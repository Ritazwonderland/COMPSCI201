import java.util.*;

public class Birthday
{
    public static void main(String[] args)
    {
        int n_tests = Integer.parseInt(args[0]);
        Random gen = new Random(n_tests);
        
        // Reminder : use (int) (gen.nextDouble() * 365) to 
        //generate a random day instead of Math.random(), 
        //otherwise your result might be off from the SAG 
        //solution
        
        // Complete the code here, see README on course website
        // for problem description and instructions.
        
        int entering;
        int sum=0;
        int num=0;
        for (int i=1; i<=n_tests; i++)
        {
            num = 0;
            boolean[] date = new boolean[365];
            while (true)
            {   
                entering = (int) (gen.nextDouble()*365);
                if (date[entering]) break;
                else date[entering] = true;
                num+=1;
            }
            sum += num;
        }
        System.out.println("Average number students before having a duplicate birthday: "+(sum*1.0/n_tests));
        return;
    }
}