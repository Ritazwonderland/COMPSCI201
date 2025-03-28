public class Combination_v1
{
    public static char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args)
    {
        // Guaranteed n <=26 
        int n = Integer.parseInt(args[0]);
        String s = alphabet.substring(0,n);

        combination_r( "", s);
    }
        
    public static void combination_r(String prepend, String s){ 
        // Note: this is very similar to the Ruler code
        // Complete the code here, see README on course website
        // for problem description and instructions.
        if (s.length()==0) 
        {
            System.out.println(prepend);
            return;
        }
        combination_r(prepend,s.substring(1,s.length()));
        prepend += s.substring(0,1);
        combination_r(prepend,s.substring(1,s.length()));
    }
}