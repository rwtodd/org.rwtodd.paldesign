module org.rwtodd.paldesign {
   requires javafx.fxml;
   requires javafx.controls;
   requires transitive javafx.graphics;
   opens org.rwtodd.paldesign to javafx.fxml;

   exports org.rwtodd.paldesign;
}
