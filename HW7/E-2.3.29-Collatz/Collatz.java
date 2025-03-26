public class Collatz
{
    public static long [] memo = new long [40000000];
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public static long read;
    public static long times;

    public static void collatz(long n)
    {
        if (n<40000000 && memo[(int) n]!=0)
        {
            times+=memo[(int) n];
            return;
        }
        times+=1;
        if (n == 1) {
            //System.out.print(1+",");
            return;
        }
        if (n % 2 == 0) 
        {
            //System.out.print(n/2+",");
            collatz(n / 2);
        }
        else 
        {
            if (3*n+1>=4000000)
            {
                times+=1;
                collatz((3*n+1)/2);
            }
            else
            {
                //System.out.print((3*n+1)+",");
                collatz(3*n + 1);
            }
        }
    }

    public static void main(String[] args) {
        long n = Integer.parseInt(args[0]);
        // Complete the code here, see README on course website
        // for problem description and instructions.
        read=n;
        
        boolean print=false;

        //n<40000000, get the max
        for (int i=1; i<n && i<40000000; i++)
        {
            times=0;
            collatz(i);
            memo[i]=times;
            //System.out.println(times);
        }

        long max=0;
        for (int i=1; i<=n; i++) max=Math.max(max,memo[i]);
            //n<40000000, print the max
        if (n<40000000)
            for (int i=1; i<=n; i++)
                if (memo[i]==max && print==false) 
                {
                    System.out.print(i);
                    print=true;
                    break;
                }

        //n>=40000000, get the total max
        else
        {
            for (int j=40000000; j<=n; j++) 
            {
                times = 0;
                collatz(j);
                max=Math.max(max,times);
            }
            //n>40000000, find and print the max
            for (int k=40000000; k<=n; k++)
            {
                times = 0;
                collatz(k);
                if (times==max && print==false) 
                {
                    print=true;
                    System.out.print(k);
                }
            }
            for (int l=1; l<=n; l++)
                if (memo[l]==max && print==false) 
                {
                    print=true;
                    System.out.print(l);
                    break;
                }
        }
            
    } 
}