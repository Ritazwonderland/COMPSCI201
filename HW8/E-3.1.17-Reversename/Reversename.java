public class Reversename
{
    public static void main(String[] args)    {
        // Exercise 3.1.17 Reversename
        
        String a = args[0];
        System.out.println(reverseName(a));

        return;
    }
    public static String reverseName(String sequence) {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        String[] arr=sequence.split("\\.");
        String out="";
        for (int i=arr.length-1; i>0; i--)
            {
                out += arr[i];
                out += ".";
            }
        out += arr[0];
        return out;
    }
}
