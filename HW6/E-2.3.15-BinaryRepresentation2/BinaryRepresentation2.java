public class BinaryRepresentation2
{
    public static int recur_depth = 0;
    public static boolean[] check;
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        String space="";
        int n_=n;
        while (n_!=1&&n_!=0)
            {
                recur_depth+=1;
                n_/=2;
            }
        recur_depth+=1;
        check=new boolean[recur_depth];

        String output = ConvertToBinary(n);
        System.out.printf("Result: %d -> %s\n", n, output);
    }
    
    public static String ConvertToBinary(int n){
        if (n==0) 
        {        
            if (check[0]==false)
            {    
                check[0]=true;
                System.out.println("0 --> 0");
            }                
            return "0";
        }
        else if (n==1) 
        {
            if (check[0]==false)
            {
                check[0]=true;
                System.out.println("1 --> 1");
            }
            return "1";
            
        }
        else
        {
            int n_=n;
            recur_depth=0;
            while (n_!=1&&n_!=0)
            {
                recur_depth+=1;
                n_/=2;
            }

            if (check[recur_depth]==false)
            {
                check[recur_depth]=true;                
                String space="";
                for (int i=0;i<recur_depth;i++) space+="  ";
                System.out.println(space+n+" --> "+ConvertToBinary(n/2) + n%2);

            }

            return  ConvertToBinary(n/2) + n%2;
        }
    }
}

