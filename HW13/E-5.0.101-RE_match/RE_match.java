import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RE_match {
    // Complete the code here, see README on course website for 
    //problem description and instructions.
    private static int count=0;
    private static String re;
    public static void testinput(String input)
    {
        //StdOut.println(input);
        //for (long i=input.length(); i>0; i--)
        //for (long i=7; i<input.length(); i++)
            //for (int j=0; j<=input.length()-i; j++)
                //if (input.substring(j,j+(int) i).matches(re))
                    //{count+=1;return;}
        Pattern pattern = Pattern.compile(re); 
        Matcher matcher = pattern.matcher(input); 
        while (matcher.find()) 
           {count+=1;return;}
        return;
    }

    public static void main(String[] args)
    {
        re = args[0];//command line argument!!!!
        //System.out.println(re);
        String in;
        while (!StdIn.isEmpty())
        {   
            in=StdIn.readString();
            //System.out.println("test");
            testinput(in);
        }
        StdOut.println("#matching string: "+count);
    }
}