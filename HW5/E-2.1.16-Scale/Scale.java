import java.util.Arrays;

public class Scale {
    // textbook 2.1.16
    public static double max(double[] arr){
        // Complete the code here, see README on course website
        // for problem description and instructions.
        double max=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            max = Math.max(max, arr[i]); 
        }
        return max;
    }
    public static double min(double[] arr){
        // Complete the code here, see README on course website
        // for problem description and instructions.
        double min=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            min = Math.min(min, arr[i]); 
        }
        return min;
    }
    public static void scale(double[] arr){
        // Complete the code here, see README on course website
        // for problem description and instructions.
        //double substract=max(arr)-min(arr);
        //System.out.println(substract);
        double min = min(arr);
        double max = max(arr);
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (arr[i]-min) / (max-min);
        }
    }

    public static void main(String[] args) {
        // Do not change this part-read and print
        double[] arr=StdIn.readAllDoubles();
        scale(arr);
        StdOut.println(Arrays.toString(arr));
    }
}