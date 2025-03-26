public class LCS_R
{
    public static void main(String[] args)  {
        String a = args[0];
        String b = args[1];

        String ret = LCS_r(a,b);
        System.out.println(ret);
    }

    public static String commonseq;

    public static String LCS_r (String x,  String y) {

        // Complete the code here, see README on course website
        // for problem description and instructions.
        //System.out.println(x + " " + y);
        if (x.equals("") || y.equals("")) return "";
        if (x.charAt(0)==y.charAt(0)){
            //System.out.println("pass");
            return x.charAt(0)+LCS_r(x.substring(1),y.substring(1));
        }
            String x1 = LCS_r(x.substring(1),y);
            String x2 = LCS_r(x,y.substring(1));
            if (x1.length()>x2.length())
                return x1;
            else
                return x2;




    }
}