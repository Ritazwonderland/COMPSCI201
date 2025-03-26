public class Reverse
{
    public static void main(String[] args)
    {
        // Exercise 3.1.1 Reverse
        // Do not change this part
        System.out.println(Reverse(args[0]));

        return;
    }
    // Implement a static Reverse method that returns a String. 
    //The returned String is the reverse of its argument

    // Complete the code here, see README on course website for
    // problem description and instructions.
    public static String Reverse(String n)
    {
        if (n.length()==1 || n.length()==0) return n;
        return n.substring(n.length()-1,n.length())+Reverse(n.substring(0,n.length()-1));
    }





}