public class VowelsInOrder
{
    public static void main(String[] args) { 
        String arg = args[0];
        String regexp = "[^aeiou]*a[^aeiou]*e[^aeiou]*i[^aeiou]*o[^aeiou]*u[^aeiou]*";
        // Complete the code here, see README on course website 
        //for problem description and instructions.
        //StdOut.println(arg);
        if (arg.matches(regexp))
            StdOut.println("Yes");
        else StdOut.println("No");
    }
}