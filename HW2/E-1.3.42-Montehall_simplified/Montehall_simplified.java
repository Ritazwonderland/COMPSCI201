import java.text.DecimalFormat;
import java.util.Random;
public class Montehall_simplified {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        float percentage1, percentage2;
        DecimalFormat df = new DecimalFormat("##.##");
        // for formating percentage to 2 decimal places
        
        int seed = Integer.parseInt(args[0]);
        Random generator = new Random(seed);
        
        // Note: use generator.nextDouble() to generate a random
        // number between 0 and 1.

        double ran;
        
        // Complete the code here, see README on course website 
        //for problem description and instructions.

        float no = 0;
        float sw = 0;

        for (int i = 1; i <= n; i++)
        {
            ran = generator.nextDouble();//pick which
            //pick d0
            if (ran <= 1.0 / 3)
            {
                no ++;
                continue;                
            }
            //pick d1 or d2
            sw += 1;
        }

        percentage1 = (no / (no + sw)) * 100;
        percentage2 = sw / (sw + no) * 100;


        System.out.println("Sucess rate of no switch: " + df.format(percentage1) + "%");
        System.out.println("Sucess rate of switching gate: " + df.format(percentage2) + "%");
        
    }
}