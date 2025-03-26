

// Complete the code here, see README on course website for problem description and instructions.
public class Equal
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b == c) {System.out.print("The three arguments all equal to " + a + ".");}
        else System.out.print("The three values are not the same.");
    }

}

