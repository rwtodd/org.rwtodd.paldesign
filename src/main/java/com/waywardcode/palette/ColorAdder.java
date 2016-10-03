/*
 * Copyright Richard Todd. I put the code under the
 * GPL v2.0.  See the LICENSE file in the repository.
 * for more information.
 */
package com.waywardcode.palette;

import java.util.function.Supplier;
import javafx.scene.paint.Color;

/**
 * A class representing an option in a combo box which adds colors
 * to a palette.
 * @author rtodd
 */
class ColorAdder {
    private final  String name;
    private final Supplier<Color[]> supplier;
    
    ColorAdder(String n, Supplier<Color[]> supp) {
        name = n;
        supplier = supp;
    }
    
    @Override public String toString() { return name; }
    
    Color[] get() { return supplier.get(); }
}
