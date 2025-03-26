// Exercise 3.2.1 Rectangle
// Please fill in the 
//perimeter(), intersects() and contains() methods.

public class Rectangle
{
    private final double x, y;    // center of rectangle
    private final double width;   // width of rectangle
    private final double height;  // height of rectangle
    
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public Rectangle(double x0, double y0, double w, double h)
    {
        x = x0;
        y = y0;
        width = w;
        height = h;
    }

    public double area()
    {  return width * height;}

    public double perimeter()
    {
        /* Compute perimeter. */
        return 2*(width+height);
    }

    public boolean intersects(Rectangle b)
    {  
        /* Does this rectangle intersect b? */  
        //System.out.println(this.contains(b));
        //System.out.println(b.contains(this));
        //should be and, not or. think about it
        return (Math.abs(this.x-b.x)<=(this.width+b.width)/2) &&
                (Math.abs(this.y-b.y)<=(this.height+b.height)/2);
    }

    public boolean contains(Rectangle b)
    {
        /* Is b inside this rectangle? */
        return (this.x-width/2<=b.x-b.width/2 &&
                this.x+width/2>=b.x+b.width/2 &&
                this.y-height/2<=b.y-b.height/2 &&
                this.y+height/2>=b.y+b.height/2);
    }

    public String toString() {
        return "Rectangle "+ width + "x"+ height + " centered at (" + x + ", " + y + ").";
    }
        
    public String infoString() {
        return "   perimeter = " + perimeter() + ", area = " + area();
    }

    public static Rectangle CreateRectangleFromStdin(){
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        double w = StdIn.readDouble();
        double h = StdIn.readDouble();
        return new Rectangle(x,y,w,h);
    }
    
    public static void main(String[] args)
    {
        Rectangle A =  CreateRectangleFromStdin();
        Rectangle B =  CreateRectangleFromStdin();
        System.out.println("A : " + A + A.infoString());
        System.out.println("B : " + B + B.infoString());
        
        System.out.println("A contains B: " + A.contains(B));
        System.out.println("B contains A: " + B.contains(A));
        
        System.out.println("A intersects B: " + A.intersects(B));
        System.out.println("B intersects A: " + B.intersects(A));
    }
}