public class ImproveNo2Slash
{
    public static void main(String[] args)
    {
        // Exercise 4.1.30 ImproveNo2Slash
        String url= StdIn.readString();
        // Complete the code here, see README on course website
        // for problem description and instructions.
        String out="";
        int i=0;
        boolean backslash=false;

        while (i<url.length())
        {
            //end of url
            //if (i>=url.length()) break;
            //not /
            if (url.charAt(i)!='/')
                {
                    backslash=false;
                    out+=url.substring(i,i+1);
                    i++;
                    continue;
                }
            //is, not first /
            //former is /
            else
            {
                if (backslash)
                {
                    i++;
                    continue;
                }
                
            //is first /
                else
                {
                    backslash=true;
                    out += "/";
                    i++;
                    continue;
                }
            }
        }
        System.out.print(out);

    }
}