/*
 * Copyright Richard Todd. I put the code under the
 * GPL v2.0.  See the LICENSE file in the repository.
 * for more information.
 */
package com.waywardcode.palette;

import java.util.Collection;
import javafx.scene.paint.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Palette records an list of colors, as well
 * as other data such as a descriptive name. It is the 
 * model portion of the MVC setup for palette design.
 * @author Richard Todd
 */
 class Palette {
    private String name;
    private List<Color> colors;
    private static final String CUSTOM_NAME = "Custom Palette";
    
    @Override public String toString() { return name; }
    
    public Palette() {
        colors = new ArrayList<>();
        name = CUSTOM_NAME;
    }
 
    public void clear() { 
        colors.clear(); 
        name = CUSTOM_NAME;
    }
   
    public void add(int idx, Color c) {
         name = CUSTOM_NAME;
         colors.add(idx, c);
    }
    
    private void updateName(Optional<String> n) {
        if(colors.isEmpty()) {
            name = n.orElse(CUSTOM_NAME);
        } else {
            name = CUSTOM_NAME;
        }
    }
    
    public void addPalette(final Optional<String> name, Color... cols) {
        // rename ourself if these colors are the only ones we've got
        updateName(name); 
        for (Color col : cols) {
           colors.add(col);
        }        
    }    

    public void addPalette(final Optional<String> name, final Collection<? extends Color> cols) {
        // rename ourself if these colors are the only ones we've got
        updateName(name); 
        colors.addAll(cols);
    }    

    public void remove(int idx) {
        colors.remove(idx);
        name = CUSTOM_NAME;
    }    

    public void set(int idx, Color newColor) {
        colors.set(idx, newColor);
        name = CUSTOM_NAME;
    }   
    
    public void removeDuplicates() {
        colors = colors.stream()
                       .distinct()
                       .collect(Collectors.toCollection(() -> new ArrayList<Color>()));
    }
    
    public Stream<Color> stream() { return colors.stream(); }
    
    public int size() { return colors.size(); }
      
    // return up to 256 colors from this palette...
    public Color[] toUniqueArray() {
        return colors.stream().distinct().limit(256).toArray(Color[]::new);
    }
    
}
