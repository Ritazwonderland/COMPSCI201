import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        // Exercise 4.3.4 Reverse
        //read strings from input and print them in reverse order

        // Complete the code here, see README on course website
        // for problem description and instructions.
        Stack s=new Stack();
        while (!StdIn.isEmpty())
        {
            s.push(StdIn.readString());
        }
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
        return;
    }
}