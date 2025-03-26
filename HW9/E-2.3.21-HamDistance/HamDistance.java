public class HamDistance
{
    // Complete the code here, see README on course website for 
    //problem description and instructions.

    //write the String into an array
    /*modified combination: add a parameter k, if reached then
    return/if reached the end of String-array then return*/
    /*inside combination we do flip (a separate static method, 
    read in the array and flip the position as parameter 
    specifies)*/
    public static int[] seq;
    public static boolean[] flipping;

    public static void choose(int k,int index)
    {
        //System.out.println("choosecheck");
        if (k==0 || index==seq.length) 
        {
            //System.out.print("reachcheck");
            //System.out.print(seq.length);
            for (int j=0; j<seq.length; j++)
            {
                //System.out.print(j);
                if (flipping[j]==false) 
                {
                    System.out.print(seq[j]);
                    //System.out.println("nonflip");
                }
                else
                {
                    //System.out.println("flip");
                    if (seq[j]==1) System.out.print(0);
                    else System.out.print(1);
                }
            }
            System.out.println();
            return;
        }
        flipping[index]=true;
        choose(k-1,index+1);
        flipping[index]=false;
        choose(k,index+1);
    }
    
    public static void main(String[] args)
    {
        //System.out.print(args.length);
        seq=new int[args[1].length()];
        //System.out.print(seq.length);

        flipping=new boolean[args[1].length()];
        //System.out.print(args[0]);
        for (int i=0; i<seq.length; i++)
        {

            seq[i]=Integer.parseInt(args[1].substring(i,i+1));
            //System.out.print(seq[i-2]);
            //System.out.print(args[i]);

        }
        //System.out.print(seq.length);
        choose(Integer.parseInt(args[0]),0);
    }
}