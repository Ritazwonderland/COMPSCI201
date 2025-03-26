

public class AverageStd {

    public static void main(String[] args) {

        // Complete the code here, see README on course website
        // for problem description and instructions.
        double average;
        double result;
        double sum=0.0;
        double sum_=0.0;
        double[] list=StdIn.readAllDoubles();
        int n=list.length;
        for (int i=0; i<n; i++)
        {
            sum+=list[i];
        }
        average=sum/n;
        for (int i=0; i<n; i++)
        {
            sum_+=Math.pow(list[i]-average,2);
        }
        result = Math.sqrt(sum_/(n-1));
        System.out.println("Total number read: "+n);
        System.out.println("Average: "+average);
        System.out.println("Standard Deviation: "+result);
    }

}