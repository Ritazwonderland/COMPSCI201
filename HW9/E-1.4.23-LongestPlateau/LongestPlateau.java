public class LongestPlateau
{
    public static void main(String[] args)
    {
        // Exercise 1.4.23 LongestPlateau

        int maxPlateauLen = 0;// max record
        int maxPlateauStartPos = 0;

        int start=0;
        int count=1;
        boolean up=true;
        // Read the terrain info from command line 
        int[] A = new int[args.length];
        for (int i = 0 ; i < args.length ; i++){
            A[i] = Integer.parseInt(args[i]);
            //System.out.print(args[i]);      
        }
        
        // Complete the code here, see README on course website
        // for problem description and instructions.
        
        //two loops: first one go through, second one start if <
        // and break if > or reinitialize if next num < or next 
        //plateau length <=
        for (int j=1; j<A.length; j++)
        {
            if (A[j-1]>A[j]) {count=1;up=false;}
            if (A[j-1]<A[j]) {count=1;start=j;up=true;}
            if (A[j-1]==A[j] && up==true) {count+=1;}
            
            if (count>maxPlateauLen && (j==A.length-1 || A[j+1]<A[j])) {
                maxPlateauLen=count;
                maxPlateauStartPos=start;
            }
        }

        System.out.println("maxPlateauLen = "  + maxPlateauLen);
        System.out.println("startPos = " + maxPlateauStartPos);

        return;
    }
}