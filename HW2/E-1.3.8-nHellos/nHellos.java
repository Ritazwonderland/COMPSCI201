public class nHellos {
    public static void main(String[] args) {

        // Complete the code here, see README on course website for problem description and instructions.
        int i = Integer.parseInt(args[0]);
        int count = 1;
        int mod;
        while (count <= i)
        {
            mod = count % 100;
            if (mod == 0) {System.out.println(count + "th hello");count = count + 1;continue;}
            if (mod < 20 && mod > 10) {
                System.out.println(count + "th hello"); 
                count = count + 1;
                continue;
                }
            else mod = count % 10;
            if (mod == 0) {System.out.println(count + "th hello");}
            if (mod == 1) {System.out.println(count + "st hello");}
            if (mod == 2) {System.out.println(count + "nd hello");}
            if (mod == 3) {System.out.println(count + "rd hello");}
            if (mod > 3) {System.out.println(count + "th hello");}
            count = count + 1;
            }

            
        } 



    }

