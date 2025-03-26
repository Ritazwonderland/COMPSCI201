public class PrimeFactor {
    // task: Write a program PrimeCounter that takes an integer
    // command-line argument n and finds all primes less than or 
    //equal to n.
    
    public static void main(String[] args) {
        
        // Complete the code here, see README on course website 
        //for problem description and instructions.
        long recFac=0;
        long num = Long.parseLong(args[0]);
        long out = num;
        long recFac = 0;
        int count = 0;
        for (long fac = 2; fac <= num / fac; fac++) 
        {
            while (num % fac == 0)
            {
                num /= fac;
                if (recFac != fac) count += 1;
                recFac = fac;
            }
        }
        if (num > 1) count += 1;

        System.out.println(out + " has " + count + " distinct prime factors. ");
    }

    
}
