import java.util.Arrays;
public class WCPalindrome
{
    public static void main(String[] args) {
        // Exercise 3.1.11 WCPalindrome
        // Do not change this part
        System.out.println(isWatsonCrickPalindrome(args[0]));
        return;
    }

    public static String Reverse(String n)
    {
        if (n.length()==1 || n.length()==0) return n;
        return n.substring(n.length()-1,n.length())+Reverse(n.substring(0,n.length()-1));
    }

    public static String Complement(String s){
        // Complete the code here, see README on course website
        // for problem description and instructions.
        if (s.length()==1)
            switch (s.toUpperCase().charAt(0))
            {    
                case 'A':
                    return "T";
                    //break;
                case 'T':
                    return "A";
                    //break;
                case 'C':
                    return "G";
                    //break;
                case 'G':
                    return "C";
                    //break;
            }

        switch (s.toUpperCase().charAt(0))
        {    
            case 'A':
                return "T"+Complement(s.substring(1));
                //break;
            case 'T':
                return "A"+Complement(s.substring(1));
                //break;
            case 'C':
                return "G"+Complement(s.substring(1));
                //break;
            case 'G':
                return "C"+Complement(s.substring(1));
                //break;
        }
        return "";
    }

    public static boolean isWatsonCrickPalindrome(String sequence)
    {
    // Complete the code here, see README on course website 
    //for problem description and instructions.
        if (Reverse(sequence).equals(Complement(sequence)))
            return true;
        return false;
    }
}