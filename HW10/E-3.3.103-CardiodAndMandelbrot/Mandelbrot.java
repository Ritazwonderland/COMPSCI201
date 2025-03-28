/******************************************************************************
 *  Compilation:  javac Mandelbrot.java
 *  Execution:    java Mandelbrot xc yc size
 *  Dependencies: StdDraw.java
 *
 *  Plots the size-by-size region of the Mandelbrot set, centered on (xc, yc)
 *
 *  % java Mandelbrot -0.5 0 2
 *
 ******************************************************************************/
import java.awt.Color;

public class Mandelbrot {
	public void init(String [] args){}
    // return number of iterations to check 
    //if c = a + ib is in Mandelbrot set.
    public static int mand(Complex z0, int max) {
        Complex z = z0;
        for (int t = 0; t < max; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return max;
    }

    public void run() {
			StdDraw.setXscale(-4,4);
			StdDraw.setYscale(-4,4);
        double xc   = -0.5;
        double yc   = 0;
        double size = 2;

        int n   = 512;   // create n-by-n image
        int max = 255;   // maximum number of iterations

        Picture picture = new Picture(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x0 = xc - size/2 + size*i/n;
                double y0 = yc - size/2 + size*j/n;
                Complex z0 = new Complex(x0, y0);
                int gray = max - mand(z0, max);
                Color color = new Color(gray, gray, gray);
                picture.set(i, n-1-j, color);
            }
        }
				picture.save("tmp3.jpg");
				StdDraw.picture(0,0,"tmp3.jpg");
				StdDraw.show();
        //picture.show();
    }
	public static void main(String [] args){
		Mandelbrot m = new Mandelbrot();
		m.run();
	}
}