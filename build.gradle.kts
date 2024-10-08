plugins {
  `java-library`
  id("org.openjfx.javafxplugin") version "0.1.0"
  `maven-publish`
  signing
}

version = "1.0.0"
group = "org.rwtodd"

base {
  archivesName = "org.rwtodd.paldesign"
}

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 21
}

javafx {
    version = "23"
    modules = listOf("javafx.controls", "javafx.fxml")
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "org.rwtodd.paldesign"
            from(components["java"])
            pom {
                name = "org.rwtodd.paldesign"
                description = "An image palette design component for JavaFX"
                url = "https://github.com/rwtodd/org.rwtodd.paldesign"
                //properties = mapOf( "" to "" )
                licenses {
                    license {
                        name = "MIT License"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }
                developers {
                    developer {
                        id = "rwtodd"
                        name = "Richard Todd"
                        email = "rwtodd@users.noreply.github.com"
                    }
                }
                scm {
                    connection = "scm:git:https://github.com/rwtodd/org.rwtodd.paldesign.git"
                    developerConnection = "scm:git:https://github.com/rwtodd/org.rwtodd.paldesign.git"
                    url = "https://github.com/rwtodd/org.rwtodd.paldesign"
                }
            }
        }
    }
    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2")
            credentials {
                username = project.findProperty("ossrhUsername") as String? ?: ""
                password = project.findProperty("ossrhPassword") as String? ?: ""
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenJava"])
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

tasks.register("credentials") {
    doLast {
        println(project.findProperty("ossrhUsername"))
        println(project.findProperty("ossrhPassword"))
    }
}
