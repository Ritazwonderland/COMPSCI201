public class Permutation_v1
{
    public static void main(String[] args)
    {
        int n  = Integer.parseInt(args[0]); 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        String s = alphabet.substring(0, n);
        // Create an char [] for permutation use
        char[] alpha = new char[26];
        for (int i=0; i<26; i++) alpha[i]=alphabet.charAt(i);
        perm("",s);
        
    }

    public static void perm(String prepend, String s){

        if (s.length()==0) System.out.println(prepend);

        // Complete the code here, see README on course website
        // for problem description and instructions.
        String last_prepend=prepend;
        for (int i=0;i<s.length();i++)
        {
            prepend=s.substring(i,i+1)+prepend;
            perm(prepend,s.substring(0,i)+s.substring(i+1,s.length()));
            prepend=last_prepend;
        }
    }
}
