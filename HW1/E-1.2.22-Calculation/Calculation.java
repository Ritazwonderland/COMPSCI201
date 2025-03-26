public class Calculation
{
    public static void main(String[] args)
    {
        // Exercise 1.2.22 
        // Complete the code here, see README on course website for problem description and instructions.
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double s;
        s = x0 + v0 * t - (g * t * t) / 2;
        System.out.print(s);

        return;
    }
}
