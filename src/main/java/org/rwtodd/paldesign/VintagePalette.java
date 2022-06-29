package org.rwtodd.paldesign;

import javafx.scene.paint.Color;

/**
 * An enumeration of the common palette options one might want to use.
 * @author Richard Todd
 */
enum VintagePalette {
    /**
     * Black-and-White
     */
    MONO("Monochrome B/W",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * Gray-Scale (4 colors).
     */
    GRAY4("Gray 4-Color",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0x55, 0x55),
            Color.rgb(0xAA, 0xAA, 0xAA),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * Gray-Scale (16 colors).
     */
    GRAY16("Gray 16-Color",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x11, 0x11, 0x11),
            Color.rgb(0x22, 0x22, 0x22),
            Color.rgb(0x33, 0x33, 0x33),
            Color.rgb(0x44, 0x44, 0x44),
            Color.rgb(0x55, 0x55, 0x55),
            Color.rgb(0x66, 0x66, 0x66),
            Color.rgb(0x77, 0x77, 0x77),
            Color.rgb(0x88, 0x88, 0x88),
            Color.rgb(0x99, 0x99, 0x99),
            Color.rgb(0xAA, 0xAA, 0xAA),
            Color.rgb(0xBB, 0xBB, 0xBB),
            Color.rgb(0xCC, 0xCC, 0xCC),
            Color.rgb(0xDD, 0xDD, 0xDD),
            Color.rgb(0xEE, 0xEE, 0xEE),
            Color.rgb(0xFF, 0xFF, 0xFF)),
   
    /** 
     * CGA Mode 1, Low intensity. Cyan, Magenta, White.
     */
    CGA1("CGA Mode 1 Dark",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x00, 0xAA, 0xAA),
            Color.rgb(0xAA, 0x00, 0xAA),
            Color.rgb(0xAA, 0xAA, 0xAA)),
    /**
     * CGA Mode 1, High intensity. Cyan, Magenta, White.
     */
    CGA1H("CGA Mode 1 Bright",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0xFF, 0xFF),
            Color.rgb(0xFF, 0x55, 0xFF),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * CGA Mode 0, Low intensity. Green, Red, Brown.
     */
    CGA0("CGA Mode 0 Dark",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0xAA, 0x00, 0x00),
            Color.rgb(0x00, 0xAA, 0x00),
            Color.rgb(0xAA, 0x55, 0x00)),
    /**
     * CGA Mode 0, High intensity. Green, Red, Yellow.
     */
    CGA0H("CGA Mode 0 Bright",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0xFF, 0x55),
            Color.rgb(0xFF, 0x55, 0x55),
            Color.rgb(0xFF, 0xFF, 0x55)),
    /**
     * EGA 16 Colors.
     */
    EGA("EGA 16-Color",
            Color.rgb(0x00, 0x00, 0x00), // 0
            Color.rgb(0x00, 0x00, 0xAA), // 1
            Color.rgb(0x00, 0xAA, 0x00), // 2
            Color.rgb(0x00, 0xAA, 0xAA), // 3
            Color.rgb(0xAA, 0x00, 0x00), // 4
            Color.rgb(0xAA, 0x00, 0xAA), // 5
            Color.rgb(0xAA, 0x55, 0x00), // 6
            Color.rgb(0xAA, 0xAA, 0xAA), // 7
            Color.rgb(0x55, 0x55, 0x55), // 8
            Color.rgb(0x55, 0x55, 0xFF), // 9
            Color.rgb(0x55, 0xFF, 0x55), // 10
            Color.rgb(0x55, 0xFF, 0xFF), // 11
            Color.rgb(0xFF, 0x55, 0x55), // 12
            Color.rgb(0xFF, 0x55, 0xFF), // 13
            Color.rgb(0xFF, 0xFF, 0x55), // 14
            Color.rgb(0xFF, 0xFF, 0xFF)), // 15
    /**
     * The default VGA 256 color palette, which actually only has 244 colors in it.
     */
    VGA("VGA 256-Color",
    		Color.rgb(  0,   0,   0),Color.rgb(    0,   0, 170),Color.rgb(    0, 170,   0),Color.rgb(    0, 170, 170),
    		Color.rgb(170,   0,   0),Color.rgb(  170,   0, 170),Color.rgb(  170,  85,   0),Color.rgb(  170, 170, 170),
    		Color.rgb( 85,  85,  85),Color.rgb(   85,  85, 255),Color.rgb(   85, 255,  85),Color.rgb(   85, 255, 255),
    		Color.rgb(255,  85,  85),Color.rgb(  255,  85, 255),Color.rgb(  255, 255,  85),Color.rgb(  255, 255, 255),
    		Color.rgb(   20,  20,  20),Color.rgb(   32,  32,  32),Color.rgb(   44,  44,  44),
    		Color.rgb( 56,  56,  56),Color.rgb(   69,  69,  69),Color.rgb(   81,  81,  81),Color.rgb(   97,  97,  97),
    		Color.rgb(113, 113, 113),Color.rgb(  130, 130, 130),Color.rgb(  146, 146, 146),Color.rgb(  162, 162, 162),
    		Color.rgb(182, 182, 182),Color.rgb(  203, 203, 203),Color.rgb(  227, 227, 227),
    		Color.rgb(  0,   0, 255),Color.rgb(   65,   0, 255),Color.rgb(  125,   0, 255),Color.rgb(  190,   0, 255),
    		Color.rgb(255,   0, 255),Color.rgb(  255,   0, 190),Color.rgb(  255,   0, 125),Color.rgb(  255,   0,  65),
    		Color.rgb(255,   0,   0),Color.rgb(  255,  65,   0),Color.rgb(  255, 125,   0),Color.rgb(  255, 190,   0),
    		Color.rgb(255, 255,   0),Color.rgb(  190, 255,   0),Color.rgb(  125, 255,   0),Color.rgb(   65, 255,   0),
    		Color.rgb(  0, 255,   0),Color.rgb(    0, 255,  65),Color.rgb(    0, 255, 125),Color.rgb(    0, 255, 190),
    		Color.rgb(  0, 255, 255),Color.rgb(    0, 190, 255),Color.rgb(    0, 125, 255),Color.rgb(    0,  65, 255),
    		Color.rgb(125, 125, 255),Color.rgb(  158, 125, 255),Color.rgb(  190, 125, 255),Color.rgb(  223, 125, 255),
    		Color.rgb(255, 125, 255),Color.rgb(  255, 125, 223),Color.rgb(  255, 125, 190),Color.rgb(  255, 125, 158),
    		Color.rgb(255, 125, 125),Color.rgb(  255, 158, 125),Color.rgb(  255, 190, 125),Color.rgb(  255, 223, 125),
    		Color.rgb(255, 255, 125),Color.rgb(  223, 255, 125),Color.rgb(  190, 255, 125),Color.rgb(  158, 255, 125),
    		Color.rgb(125, 255, 125),Color.rgb(  125, 255, 158),Color.rgb(  125, 255, 190),Color.rgb(  125, 255, 223),
    		Color.rgb(125, 255, 255),Color.rgb(  125, 223, 255),Color.rgb(  125, 190, 255),Color.rgb(  125, 158, 255),
    		Color.rgb(182, 182, 255),Color.rgb(  199, 182, 255),Color.rgb(  219, 182, 255),Color.rgb(  235, 182, 255),
    		Color.rgb(255, 182, 255),Color.rgb(  255, 182, 235),Color.rgb(  255, 182, 219),Color.rgb(  255, 182, 199),
    		Color.rgb(255, 182, 182),Color.rgb(  255, 199, 182),Color.rgb(  255, 219, 182),Color.rgb(  255, 235, 182),
    		Color.rgb(255, 255, 182),Color.rgb(  235, 255, 182),Color.rgb(  219, 255, 182),Color.rgb(  199, 255, 182),
    		Color.rgb(182, 255, 182),Color.rgb(  182, 255, 199),Color.rgb(  182, 255, 219),Color.rgb(  182, 255, 235),
    		Color.rgb(182, 255, 255),Color.rgb(  182, 235, 255),Color.rgb(  182, 219, 255),Color.rgb(  182, 199, 255),
    		Color.rgb(  0,   0, 113),Color.rgb(   28,   0, 113),Color.rgb(   56,   0, 113),Color.rgb(   85,   0, 113),
    		Color.rgb(113,   0, 113),Color.rgb(  113,   0,  85),Color.rgb(  113,   0,  56),Color.rgb(  113,   0,  28),
    		Color.rgb(113,   0,   0),Color.rgb(  113,  28,   0),Color.rgb(  113,  56,   0),Color.rgb(  113,  85,   0),
    		Color.rgb(113, 113,   0),Color.rgb(   85, 113,   0),Color.rgb(   56, 113,   0),Color.rgb(   28, 113,   0),
    		Color.rgb(  0, 113,   0),Color.rgb(    0, 113,  28),Color.rgb(    0, 113,  56),Color.rgb(    0, 113,  85),
    		Color.rgb(  0, 113, 113),Color.rgb(    0,  85, 113),Color.rgb(    0,  56, 113),Color.rgb(    0,  28, 113),
    		Color.rgb( 56,  56, 113),Color.rgb(   69,  56, 113),Color.rgb(   85,  56, 113),Color.rgb(   97,  56, 113),
    		Color.rgb(113,  56, 113),Color.rgb(  113,  56,  97),Color.rgb(  113,  56,  85),Color.rgb(  113,  56,  69),
    		Color.rgb(113,  56,  56),Color.rgb(  113,  69,  56),Color.rgb(  113,  85,  56),Color.rgb(  113,  97,  56),
    		Color.rgb(113, 113,  56),Color.rgb(   97, 113,  56),Color.rgb(   85, 113,  56),Color.rgb(   69, 113,  56),
    		Color.rgb( 56, 113,  56),Color.rgb(   56, 113,  69),Color.rgb(   56, 113,  85),Color.rgb(   56, 113,  97),
    		Color.rgb( 56, 113, 113),Color.rgb(   56,  97, 113),Color.rgb(   56,  85, 113),Color.rgb(   56,  69, 113),
    		Color.rgb( 81,  81, 113),Color.rgb(   89,  81, 113),Color.rgb(   97,  81, 113),Color.rgb(  105,  81, 113),
    		Color.rgb(113,  81, 113),Color.rgb(  113,  81, 105),Color.rgb(  113,  81,  97),Color.rgb(  113,  81,  89),
    		Color.rgb(113,  81,  81),Color.rgb(  113,  89,  81),Color.rgb(  113,  97,  81),Color.rgb(  113, 105,  81),
    		Color.rgb(113, 113,  81),Color.rgb(  105, 113,  81),Color.rgb(   97, 113,  81),Color.rgb(   89, 113,  81),
    		Color.rgb( 81, 113,  81),Color.rgb(   81, 113,  89),Color.rgb(   81, 113,  97),Color.rgb(   81, 113, 105),
    		Color.rgb( 81, 113, 113),Color.rgb(   81, 105, 113),Color.rgb(   81,  97, 113),Color.rgb(   81,  89, 113),
    		Color.rgb(  0,   0,  65),Color.rgb(   16,   0,  65),Color.rgb(   32,   0,  65),Color.rgb(   48,   0,  65),
    		Color.rgb( 65,   0,  65),Color.rgb(   65,   0,  48),Color.rgb(   65,   0,  32),Color.rgb(   65,   0,  16),
    		Color.rgb( 65,   0,   0),Color.rgb(   65,  16,   0),Color.rgb(   65,  32,   0),Color.rgb(   65,  48,   0),
    		Color.rgb( 65,  65,   0),Color.rgb(   48,  65,   0),Color.rgb(   32,  65,   0),Color.rgb(   16,  65,   0),
    		Color.rgb(  0,  65,   0),Color.rgb(    0,  65,  16),Color.rgb(    0,  65,  32),Color.rgb(    0,  65,  48),
    		Color.rgb(  0,  65,  65),Color.rgb(    0,  48,  65),Color.rgb(    0,  32,  65),Color.rgb(    0,  16,  65),
    		Color.rgb( 32,  32,  65),Color.rgb(   40,  32,  65),Color.rgb(   48,  32,  65),Color.rgb(   56,  32,  65),
    		Color.rgb( 65,  32,  65),Color.rgb(   65,  32,  56),Color.rgb(   65,  32,  48),Color.rgb(   65,  32,  40),
    		Color.rgb( 65,  32,  32),Color.rgb(   65,  40,  32),Color.rgb(   65,  48,  32),Color.rgb(   65,  56,  32),
    		Color.rgb( 65,  65,  32),Color.rgb(   56,  65,  32),Color.rgb(   48,  65,  32),Color.rgb(   40,  65,  32),
    		Color.rgb( 32,  65,  32),Color.rgb(   32,  65,  40),Color.rgb(   32,  65,  48),Color.rgb(   32,  65,  56),
    		Color.rgb( 32,  65,  65),Color.rgb(   32,  56,  65),Color.rgb(   32,  48,  65),Color.rgb(   32,  40,  65),
    		Color.rgb( 44,  44,  65),Color.rgb(   48,  44,  65),Color.rgb(   52,  44,  65),Color.rgb(   60,  44,  65),
    		Color.rgb( 65,  44,  65),Color.rgb(   65,  44,  60),Color.rgb(   65,  44,  52),Color.rgb(   65,  44,  48),
    		Color.rgb( 65,  44,  44),Color.rgb(   65,  48,  44),Color.rgb(   65,  52,  44),Color.rgb(   65,  60,  44),
    		Color.rgb( 65,  65,  44),Color.rgb(   60,  65,  44),Color.rgb(   52,  65,  44),Color.rgb(   48,  65,  44),
    		Color.rgb( 44,  65,  44),Color.rgb(   44,  65,  48),Color.rgb(   44,  65,  52),Color.rgb(   44,  65,  60),
    		Color.rgb( 44,  65,  65),Color.rgb(   44,  60,  65),Color.rgb(   44,  52,  65),Color.rgb(   44,  48,  65)
    		),
    /**
     * The Plan-9 OS palette.
     */
    PLAN9("Plan-9 OS Palette"),
    /**
     * The famous Netscape "web safe" palette.
     */
    WEBSAFE("WebSafe 216-Color");

    private Color[] colors;
    private final String description;
    
    @Override public String toString() { return description; }
    
    // consider switching to an array copy one day to avoid a client possibly 
    // corrupting the color list
    public Color[] getColors() { return colors; }
    
    VintagePalette(String desc, Color... cols) {
        description = desc;
        colors = cols;
                 
        // a few of them are too big so I just generate them on demand.
        if(cols.length == 0) {
            switch(name()) {
                case "PLAN9": genPlan9Colors(); break;
                case "WEBSAFE": genWebSafeColors(); break;       
            }
        }
    }
    
    // derived from the Go standard packages...
    private void genPlan9Colors() {
        colors = new Color[256];
        int idx = 0;
        
        for (int r = 0; r < 4; r++) {
            for (int v = 0; v < 4; v++) {
                for (int g = 0; g < 4; g++) {
                    for (int b = 0; b < 4; b++) {
                        int den = r;
                        if(g > den) { den = g; }
                        if(b > den) { den = b; }
                        if(den == 0) {
                            colors[idx++] = Color.rgb(0x11 * v, 0x11*v, 0x11*v);
                        } else {
                            int num = 17 * (4*den + v);
                            colors[idx++] = Color.rgb(r*num/den, g*num/den, b*num/den);
                        }
                    }
   
                }                
            }
        }
    }
    
    private void genWebSafeColors() {
        colors = new Color[216];
        final int[] options = { 0x00, 0x33, 0x66, 0x99, 0xCC, 0xFF };
        int idx = 0;
        for (int r : options) {
            for (int g : options) {
                for (int b : options) {
                    colors[idx++] = Color.rgb(r,g,b);
                }
            }
        }        
    }
}
