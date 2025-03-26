 public class DesignSquares {
    public static void main(String[] args) {
        String fname = null;
        if (args.length>0) fname = args[0];
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(.5, .5, .5);

        // Should use color GRAY/WHITE etc.

        // Complete the code here, see README on course website
        // for problem description and instructions.
        StdDraw.setPenColor(StdDraw.GRAY);
        double[] ax={0.0,0.5,1.0,0.5};
        double[] ay={0.5,1.0,0.5,0.0};
        StdDraw.filledPolygon(ax, ay);

        
        StdDraw.setPenColor(StdDraw.WHITE);
        double[]  bx={0.0,0.25,0.25};
        double[]  by={0.25,0.25,0.0};
        double[] cx={1.0,0.75,0.75};
        double[] cy={0.75,0.75,1.0};

        
        StdDraw.filledPolygon(bx, by);
        StdDraw.filledPolygon(bx, cy);
        StdDraw.filledPolygon(cx, cy);
        StdDraw.filledPolygon(cx, by);


        StdDraw.show();
        if (fname != null) {
            // save and exit
            StdDraw.save(fname); // fname must end with .png
            System.exit(0);
        } 

    }
}