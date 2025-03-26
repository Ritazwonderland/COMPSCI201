import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CountMatches {
    public static void main(String[] args) { 
        int count = 0;
        String input;
        String regexp = StdIn.readLine();
        Pattern pattern = Pattern.compile(regexp);
        
        // Complete the code here, see README on course website
        // for problem description and instructions.
        input=StdIn.readString();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            count+=1;

        StdOut.println(count);
    }
    
}