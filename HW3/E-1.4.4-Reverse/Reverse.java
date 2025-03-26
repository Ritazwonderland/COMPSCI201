import java.util.Arrays;

public class Reverse
{
    public static void main(String[] args)
    {

        int n = args.length;
        
        String[] arr ;// declare an array variable

        // Complete the code here, see README on course 
        //website for problem description and instructions.
        arr = new String[n];
        for (int i = 1; i <= arr.length; i++)
        {
            arr[i-1] = args[args.length - i];
        }


        
        // Print out the array elements
        for (int i=0;i < arr.length; i++) {
            System.out.print(arr[i] + '\n');
        }
        //System.out.println();

        //return;
    }
}