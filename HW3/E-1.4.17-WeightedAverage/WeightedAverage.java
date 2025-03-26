public class WeightedAverage
{
    public static void main(String[] args)
    {
        // Exercise 1.4.17 WeightedAverage

        // the following code read the weight array 
        //-- don't modify
        double[] weights = StdArrayIO.readDouble1D();
        
        // assert weights.length == raw_exam_score[0].length
        double [][] raw_exam_score = StdArrayIO.readDouble2D();
        
        // Complete the code here, see README on course website 
        //for problem description and instructions.
        int item = raw_exam_score.length;
        int object = raw_exam_score[0].length;
        for (int i = 0; i < item; i++)
        {
            double sum = 0;
            for (int j = 0; j < object; j++)
            {
                sum += raw_exam_score[i][j]*weights[j];
            }
            System.out.println(sum);
        }
        return;
    }
}