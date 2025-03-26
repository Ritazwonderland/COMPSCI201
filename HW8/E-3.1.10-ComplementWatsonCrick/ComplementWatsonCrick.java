public class ComplementWatsonCrick
{
    public static void main(String[] args) 
    {
        // Exercise 3.1.10 ComplementWatsonCrick
        // TODO: your own description
        
        String s = StdIn.readString();
        System.out.println(Complement(s));
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
}