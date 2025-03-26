import java.util.*;

public class IntegerProperty
{
    public static void main(String[] args)
    {
        // don't change this - read, use and print
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("isPrime(a): "+ isPrime(a));
        System.out.println("isPrime(b): "+ isPrime(b));
        System.out.println("isRelativePrime(a+b): " + isRelativePrime(a, b));
        
        System.out.print("distinct factors of (a): ");
        for (int f : factor(a)) 
            System.out.print(f + " "); 
        System.out.println();
                
        System.out.print("distinct factors of (b): ");
        for (int f : factor(b)) 
            System.out.print(f + " "); 
        System.out.println();

        System.out.println("gcd(a+b): " + gcd(a, b));
        System.out.println("lcm(a+b): "+ lcm(a, b));
        System.out.println("phi(a): "+ phi(a));
        System.out.println("phi(b): "+ phi(b));
    }

    // Exercise 2.2.23 IntegerProperty
    // create the functions below: isPrime(), 
    //isRelativePrime(), factor(), gcd(), lcm(), phi()
    
    public static boolean isPrime(int x) 
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        for (int i=2; i < x; i++)
        {
            if (x%i == 0) return false;
        }
        return true;
    }
    public static boolean isRelativePrime(int a, int b) 
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        for (int i=2; i<=Math.min(a,b); i++)
        {
            if (a%i==0 && b%i==0) return false;
        }
        return true;
    }
    public static int[] factor(int x) 
    // get all distinct factors
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.

        //count
        int x_=x;
        int count = 0;
        int recFac=0;
        for (int fac = 2; fac <= x / fac; fac++) 
        {
            while (x % fac == 0)
            {
                x /= fac;
                if (recFac != fac) count += 1;
                recFac = fac;
            }
        }
        if (x>1) count+=1;

        //read
        recFac=0;
        int[] result = new int[count];
        int i = 0;
        for (int fac = 2; fac <= x_ / fac; fac++) 
        {
            if (x_%fac==0)
            {
                while (x_ % fac == 0)
                {
                    x_ /= fac;
                    if (recFac != fac) 
                    {
                        result[i] = fac;
                        recFac = fac;
                    }
                }
                i++;
            }
        }
        if (result[count-1]==0) result[count-1]=x;
        return result;
    }
    public static int gcd(int a, int b) 
    // greatest common divisor
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        return b==0 ? a : gcd(b, a % b);
    }
    public static long lcm(int a, int b) 
    // least common multiplier
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        long c = (long) a;
        long d = (long) b;
        long gcd = (long) gcd(a,b);
        return a*(b/gcd);
    }
    public static long phi(int x) // Euler's totient function
    {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        long result = 1;
        for (int p = 2; p <= x / p; p++) 
        {
            if (x % p == 0)
            {
                int k = 0;
                while (x % p == 0)
                {
                    x /= p;
                    k += 1;
                }
                result *= (p - 1)*Math.pow(p,k-1);
            }
        }
        if (x > 1) result *= x-1;
        return result;
    }
}