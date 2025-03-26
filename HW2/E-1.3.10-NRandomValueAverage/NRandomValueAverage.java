import java.util.Random;

public class NRandomValueAverage {
    public static void main(String[] args) {
        // Exercise 1.3.10 in textbook
        
        // Takes an Integer N as a command-line argument uses
        // Math.random() to print N uniform random values between
        // 0 and 1 and then prints their average value. 
                
        int N = Integer.parseInt(args[0]);
        Random generator = new Random(N);

        int i = 1;
        double sum = 0;
        double cur;
        //double last = generator;
        double Average;

        //sum = sum + (double) generator;
        //System.out.println(generator);

        // Note: use generator.nextDouble() to generate the next
        // random value for deterministic grading

        

        while (i <= N) {
            cur = generator.nextDouble();
            System.out.println(cur);
            sum = sum + cur;
            //last = cur;
            i = i + 1;
        }

        // Complete the code here, see README on course website 
        //for problem description and instructions.

        Average = sum / N;
        System.out.println("Average: " + Average);





        return;
    }
}
