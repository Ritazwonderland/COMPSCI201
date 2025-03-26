public class EulerFunction{
    // Complete the code here, see README on course website
    // for problem description and instructions.

    //get all prime factor and the multiplied times

    public static int euler(int n)
    {
        int result = 1;
        for (int p = 2; p <= n / p; p++) 
        {
            if (n % p == 0)
            {
                int k = 0;
                while (n % p == 0)
                {
                    n /= p;
                    k += 1;
                }
                result *= (p - 1)*Math.pow(p,k-1);
            }

        }
        if (n > 1) result *= n-1;
        return result;
    }

    public static void main(String[] args) {
        // Do not change this
        int n=Integer.parseInt(args[0]);
        System.out.println(euler(n));
    }
	
}
