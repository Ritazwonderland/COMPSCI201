/*
  Created by Yantao Mei and Jiang Long
  Jan 2022 
  CS201.003.2022.SP
*/
import java.util.Random;
public class Grid extends Const{
    public static Random rGen= new Random(1023);
    //----------------------------------------------------------------
    // Check if the grid is full of none-zeros
    //----------------------------------------------------------------
    public static int fill_count(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        int count=0;
        for (int i=0; i<grid.length; i++)
            for (int j=0; j<grid[0].length; j++)
                if (grid[i][j]!=0) count+=1;
        return count;
    } 

    //----------------------------------------------------------------
    // Total score is the sum of all cells
    //----------------------------------------------------------------
    public static int score(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        return Array.sum(grid);
    } 

    //----------------------------------------------------------------
    // Maximum label on the grid
    //----------------------------------------------------------------
    public static int max_label(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        return Array.max(grid);
    } 

    //----------------------------------------------------------------
    // Return nums of empty tiles (grid[i][j] == 0)
    //----------------------------------------------------------------
    public static int empty_count(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        int count=0;
        for (int i=0; i<grid.length; i++)
            for (int j=0; j<grid[0].length; j++)
                if (grid[i][j]==0) count+=1;
        return count;
    } 

    //----------------------------------------------------------------
    // Return true if cells are filled, otherwise false
    //----------------------------------------------------------------
    public static boolean full(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        for (int i=0; i<grid.length; i++)
            for (int j=0; j<grid[0].length; j++)
                if (grid[i][j]==0) return false;
        return true;
    } 

    //----------------------------------------------------------------
    // Check if the player has reach the winning_label
    //----------------------------------------------------------------
    public static boolean win(int [][] grid, int winning_label) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        if (Array.max(grid)==WIN_LABEL) return true;
        else return false;
    } 

    //----------------------------------------------------------------
    // Game over if the grid can no-longer be changed 
    //
    // The condition would be both full() and no 2 adjacent cell has
    // the same non-zero value
    // ----------------------------------------------------------------
    public static boolean game_over(int [][] grid) {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        int[][] grid_=new int[grid.length][grid[0].length];
        Array.copy(grid,grid_);

        Player.move_left(grid_);
        if (!Array.eq(grid_,grid)) return false;
        Player.move_right(grid_);
        if (!Array.eq(grid_,grid)) return false;
        Player.move_up(grid_);
        if (!Array.eq(grid_,grid)) return false;
        Player.move_down(grid_);
        if (!Array.eq(grid_,grid)) return false;
        return true;
    } 

    //----------------------------------------------------------------
    // Print the grid with a msg tag
    //----------------------------------------------------------------
    public static void print_grid(int [][] grid, String msg){
        print_grid(grid, -1,-1, msg);
    }

    //----------------------------------------------------------------
    // Print the grid and indicate (x,y) is newly created
    //----------------------------------------------------------------
    public static void print_grid(int [][] grid, int x, int y, String msg) {
        /*
          This is to use Tabulate.Tabulate2 to print the grid in
          formatted table.

          To indicate the newly created-tile, 
          this has the following features
         
          if (x,y) is a legal cell coordinate, it would print '()`
          surronding the value at grid[x][y])
        */
        // Complete the code here, see README on course website for 
        //problem description and instructions.
        if (x>=0 && x<grid.length && y>=0 && y<grid[0].length)
        {
            String[][] grid_;
            grid_=new String[grid.length][grid[0].length];
            for (int i=0; i<grid.length; i++)
                for (int j=0; j<grid[0].length; j++)
                    if (i==x && j==y) grid_[i][j]="("+grid[i][j]+")";
                    else grid_[i][j]=grid[i][j]+"";
            StdOut.println(msg);
            Tabulate.Tabulate2(grid_);
        }
        else Array.print_2d(grid,msg);
    }

    //----------------------------------------------------------------
    // Check if the two grids are the same: 
    //    a[i][j] == b[i][j] for all (i,j) in a
    //----------------------------------------------------------------
    public static boolean eq_grid(int [][] a, int[][]b){
        // Complete the code here, see README on course website for 
        //problem description and instructions.
        return Array.eq(a,b);
    }


    //----------------------------------------------------------------
    // Update the grid from a move
    //----------------------------------------------------------------
    public static void update_grid(int [][] grid, int move){
        // Note : move is one of the values from UP, DONW, LEFT, RIGHT
        // from Const.java

        // Complete the code here, see README on course website for 
        //problem description and instructions.
        switch (move)
        {
            case 1: Player.move_up(grid); break;
            case 2: Player.move_down(grid);break;
            case 3: Player.move_left(grid); break;
            case 4: Player.move_right(grid); break;
        }
    }

    public static void main(String [] args) {
        // read the two array and does the following
        int N = 6;
        // read the two array and does the following
        if (args.length>0) {
            N = Integer.parseInt(args[0]);
            rGen = new Random(N);
            Player.rGen = new Random(N);
            Array.rGen = new Random(N);
        }

        int [][] m = new int [4][4];
        Player.rand_fill(m, 5);
        Array.print_2d(m, "grid:");
        
        print_grid(m, 1,2, "marked_grid:");
        print_grid(m, "unmarked_grid:");
        
        StdOut.println("fill_count: " +  fill_count(m));
        StdOut.println("max_label: " +  max_label(m));
        StdOut.println("win: " +  win(m,32));
        StdOut.println("game_over: " +  game_over(m));
        StdOut.println("full: " +  full(m));
        StdOut.println("empty_count: " +  empty_count(m));
        StdOut.println("game_over: " +  game_over(m));

        update_grid(m, RIGHT);
        print_grid(m, "RIGHT move:");
        update_grid(m, LEFT);
        print_grid(m, "LEFT move:");
        update_grid(m, UP);
        print_grid(m, "UP move:");
        update_grid(m, DOWN);
        print_grid(m, "DOWN move:");
    } 
}