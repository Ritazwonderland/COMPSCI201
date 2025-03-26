public class PlayerIO extends Const {
    public static int getNextMove(int [][] grid) { 
        if (Game2048.conf_useStdIn) 
            return PlayerIO.getNextMove_fromStdIn();
        else
            return PlayerIO.getNextMove_fromKeyboard();
    }
    
    //----------------------------------------------------------------
    // Use StdIn.readChar to return a legal move as UP, DOWN, LEFT,
    // RIGHT or QUIT. Use a while loop to keep reading if input is not
    // one of the following or until StdIn.isEmpty() then return QUIT:
    // 
    // Interpret a,d,s,w as LEFT, RIGHT, DOWN, UP (same as A,D,S,W)
    // Interprect q,Q and end-of-file as QUIT
    //----------------------------------------------------------------
    public static int getNextMove_fromStdIn() {
        // Complete the code here, see README on course website for 
        //problem description and instructions.
        if (!StdIn.isEmpty())
            {char read=StdIn.readChar();
        while ((read!='q'&&read!='Q'&&read!='a'&&read!='A'&&read!='d'&&read!='D'&&read!='w'&&read!='W'&&read!='s'&&read!='S'))
            read=StdIn.readChar();
        switch (read)
        {
            case 'w': return 1;
            case 'W': return 1;
            case 's': return 2;
            case 'S': return 2;
            case 'a': return 3;
            case 'A': return 3;
            case 'd': return 4;
            case 'D': return 4;
            case 'q': return 5;
            case 'Q': return 5;
        }}
        return 5;
    }
    
    //----------------------------------------------------------------
    // Use StdDraw.nextKeyTyped for GUI use
    //----------------------------------------------------------------
    public static int getNextMove_fromKeyboard() {
        int ret = 0 ;
        // Note: no need to implement this one.
        // Complete the code here, see README on course website for 
        //problem description and instructions.
        return ret;
    }
}