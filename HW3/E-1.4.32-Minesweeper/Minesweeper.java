public class Minesweeper
{
    public static void main(String[] args)
    {
        // Exercise 1.4.32 Minesweeper

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        // mineField[i][j]==true 
        //if there is a mine at slot (i,j)
        boolean[][] mineField = new boolean[n][m];
        
        // value is used to compute 
        int[][] value = new int[n][m];
        
        // The following code is given to read a mine-field
        // specification. See problem description for further
        // informaiton
        //-------------------------------------------------------
        // The following code is given (don't modify) to read 
        //in the specification of a mine field
        // ------------------------------------------------------
        // See problem description for the form of the mine-field
        // specification

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
            {
                char ch = ' ';
                while (ch == ' ' || ch == '\n') ch = StdIn.readChar();
                if (ch == '*') mineField[i][j] = true;
                else mineField[i][j] = false;
            }

        // Fill in the code to compute the 2D-array 'value' 
        // Complete the code here, see README on course website
        // for problem description and instructions.
         for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                value[i][j]=0;
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (mineField[i][j])
                {
                    value[i][j] = -1; 
                    if (i==0 || i==n-1 || j==0 || j==m-1)
                    {
                        if (i-1>=0 && j-1>=0)
                        {if (!mineField[i-1][j-1]) value[i-1][j-1]+=1;}
                        if (i-1>=0)
                        {if (!mineField[i-1][j]) value[i-1][j]+=1;}
                        if (i-1>=0 && j+1<=m-1)
                        {if (!mineField[i-1][j+1]) value[i-1][j+1]+=1;}
                        if (j+1<=m-1)
                        {if (!mineField[i][j+1]) value[i][j+1]+=1;}
                        if (i+1<=n-1 && j+1<=m-1)
                        {if (!mineField[i+1][j+1]) value[i+1][j+1]+=1;}
                        if (i+1<=n-1)
                        {if (!mineField[i+1][j]) value[i+1][j]+=1;}
                        if (i+1<=n-1 && j-1>=0)
                        {if (!mineField[i+1][j-1]) value[i+1][j-1]+=1;}
                        if (j-1>=0)
                        {if (!mineField[i][j-1]) value[i][j-1]+=1;}
                    }
                    else
                    {
                        if (!mineField[i-1][j-1]) value[i-1][j-1]+=1;
                        if (!mineField[i-1][j]) value[i-1][j]+=1;
                        if (!mineField[i-1][j+1]) value[i-1][j+1]+=1;
                        if (!mineField[i][j+1]) value[i][j+1]+=1;
                        if (!mineField[i+1][j+1]) value[i+1][j+1]+=1;
                        if (!mineField[i+1][j]) value[i+1][j]+=1;
                        if (!mineField[i+1][j-1]) value[i+1][j-1]+=1;
                        if (!mineField[i][j-1]) value[i][j-1]+=1;
                    }
                }
            }
        }

        System.out.println("The mine-field:\n");

        //-----------------------------------------------
        // The following code print the content of 'value' 
        //-----------------------------------------------
        // Complete the code here, see README on course 
        //website for problem description and instructions.
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (value[i][j]==-1) {System.out.print("* ");continue;}
                if (value[i][j]==0) {System.out.print("  ");continue;}
                System.out.print(value[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
}