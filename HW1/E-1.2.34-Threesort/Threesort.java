public class Threesort
{
    public static void main(String[] args)
    {
        // Exercise 1.2.34 Threesort
        // sort three numbers
        
        // Read the three numbers from command line 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        // Complete the code here, see README on course website for problem description and instructions.
        int x = Math.min(Math.min(a, b), Math.min(a, c));
        int y = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
        int z = Math.max(Math.max(a, b), Math.max(a, c));
        System.out.print(x);System.out.print(" ");System.out.print(y);System.out.print(" ");System.out.print(z);

        return;
    }
}