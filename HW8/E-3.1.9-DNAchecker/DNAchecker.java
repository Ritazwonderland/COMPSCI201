public class DNAchecker

{
    public static void main(String[] args)
    {
        // Exercise 3.1.9 DNAchecker

        // Check the input arguments is a valid DNS string or not
        boolean is_valid = isValidDNA(args[0]);
        
        System.out.println(is_valid);

        return;
    }
    
    // The task is to create a static method isValidDNA which returns
    // true if the input String is a valid DNA string or not
    
    // Complete the code here, see README on course website for
    // problem description and instructions.

    public static boolean isValidDNA(String n)
    {
        for (int i=0; i<n.length()-1; i++)
        {
            if ((n.charAt(i)!='A')&&(n.charAt(i)!='C')&&(n.charAt(i)!='T')&&(n.charAt(i)!='G'))
                return false;
        }
        return true;
    }



}