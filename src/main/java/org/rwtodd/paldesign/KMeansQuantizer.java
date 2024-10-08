package org.rwtodd.paldesign;

import java.util.Arrays;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

/**
 * A class to perform K-Means color quantizing on images.
 *
 * @author rtodd
 */
public class KMeansQuantizer {
    // there is a 1:1 correspondence between these arrays...

    private final Cluster[] clusters;
    private final Color[] centroids;
    private double totalError; // the complete error from the last assignment of colors to centroids

    private final int width;
    private final int height;
    private final Image img;

    public KMeansQuantizer(final Image im, final int maxColors) {
        // these two arrays have a 1:1 correspondence
        clusters = new Cluster[maxColors];
        centroids = new Color[maxColors];
        for (int i = 0; i < maxColors; i++) {
            clusters[i] = new Cluster();
        }

        // keep some info about the input image...
        width = (int) im.getWidth();
        height = (int) im.getHeight();

        img = im;
        totalError = 0;
    }

    /**
     * After quantization, the total error (color - best_centroid) for the image
     * is available, in case the client wants to perform multiple runs and keep
     * the best outcome.
     *
     * @return The total error from the last assignment of colors to centroids.
     */
    public double getTotalError() {
        return totalError;
    }

    /**
     * Take a pass at quantizing the image.
     *
     * @return an array of quantized Colors.
     */
    public Color[] quantize() {
        // Step 1: randomly assign colors to centroids...
        final PixelReader rdr = img.getPixelReader();
        randomInitialCentroids(rdr);

        // Step 2: keep re-classifying the image until the centroids
        // don't change...
        while (checkCentroids()) {
            totalError = assignColors(rdr);
        }

        return Arrays.copyOf(centroids, centroids.length);
    }

    private void randomInitialCentroids(final PixelReader rdr) {
        Random rnd = new Random();

        // divide the picture into quadrants...
        int amt = (int)Math.sqrt(clusters.length);
        if(amt < 1) amt = 1;
        double xspan = ((double)width)/amt;
        double yspan = ((double)height)/amt;
        int idx = 0;
        for(int y = 0; y < amt; ++y) {
           for(int x = 0; x < amt; ++x) {
              final Color c = rdr.getColor((int)((x+rnd.nextDouble())*xspan), (int)((y+rnd.nextDouble()*yspan)));
              clusters[idx++].add(c);
           }
        }
        
        // wildcards
        for(;idx < clusters.length; ++idx) {
              final Color c = rdr.getColor(rnd.nextInt(width), rnd.nextInt(height));
              clusters[idx].add(c);
        }
                
    }

    private double colorDistance(final Color a, final Color b) {
        final double distr = a.getRed() - b.getRed();
        final double distg = a.getGreen() - b.getGreen();
        final double distb = a.getBlue() - b.getBlue();
        return Math.sqrt(distr*distr + distg*distg + distb*distb);
    }
    
    private double assignColors(final PixelReader rdr) {
        double error = 0;
        boolean tieBreakSecond = true;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double curErr = Double.MAX_VALUE;
                int minErrIdx = 0;
                final Color c = rdr.getColor(x, y);

                for (int i = 0; i < clusters.length; i++) {
                    final double dist = colorDistance(centroids[i], c);
                    
                    // resolve every other tie the opposite way...
                    if (dist == curErr) {
                        if(tieBreakSecond) {
                            curErr = Double.MAX_VALUE; 
                        }
                        tieBreakSecond = !tieBreakSecond;
                    }
                    
                    if (dist < curErr) {
                        curErr = dist;
                        minErrIdx = i;       
                    }
                }
                
                // now add the color to the closest centroid
                clusters[minErrIdx].add(c);
                error += curErr;
            }
        }
        
        return error;
    }

    /**
     * Update the centroids and check for changes.
     *
     * @return true if centroids changed, and false otherwise.
     */
    private boolean checkCentroids() {
        boolean someChanged = false;
        for (int i = 0; i < clusters.length; i++) {
            final Color tmp = clusters[i].getCentroid();          
            if ((tmp != null) && (!tmp.equals(centroids[i]))) {
                 centroids[i] = tmp;
                 someChanged = true;
            }
            clusters[i].reset();
        }
        return someChanged;
    }
}

/**
 * A class to keep track of a set of colors, and its centroid.
 */
final class Cluster {

    private double totalR, totalG, totalB;
    private int numPoints;

    Cluster() {
        reset();
    }

    Color getCentroid() {
        if (numPoints == 0) { return null; }
        return new Color(totalR / numPoints, totalG / numPoints, totalB / numPoints, 1.0);
    }

    void add(Color c) {
        totalR += c.getRed();
        totalG += c.getGreen();
        totalB += c.getBlue();
        ++numPoints;
    }

    final void reset() {
        totalR = 0;
        totalG = 0;
        totalB = 0;
        numPoints = 0;
    }
}
