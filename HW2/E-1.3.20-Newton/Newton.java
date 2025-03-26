
public class Newton {

    // task: use newtons method to find the kth root of n

    public static void main(String[] args) {

        // Raed n,k from command line
        int n = Integer.parseInt(args[0]);//num
        int k = Integer.parseInt(args[1]);//root
        
        // initial_guess
        double initial_guess = Math.random() * 100;

        // smaller epsilon, denotes more accuracy
        double epsilon = 0.000001;

        // keep the result here
        double kth_root_of_n;

        // Complete the code here, see README on course
        // website for problem description and instructions.

        double cur = initial_guess;
        double last = initial_guess;
        while (Math.abs(cur - Math.pow(n, 1.0 / k)) >= epsilon)
        {
            cur = (k-1) * last / k + n / (Math.pow(last, k - 1)*k);
            last = cur;
        }

        kth_root_of_n = cur;

        
        // Don't touch from here
        
        // only print 5 digits after the decimal point (precision-wise)
        System.out.printf("%sth root of %s is %.5f\n", k, n, kth_root_of_n); 
    }
}