public class Tape {
    public Stack<Character> left = new Stack<Character>();
    public Stack<Character> right = new Stack<Character>();
    private char current;

    public Tape(String input) 
    {
        right.push('#');
        for (int i=input.length()-1; i>=0; i--)
            right.push(input.charAt(i));
        current = right.pop();//begins at #
    }

    public static String reverse(String s) {
        /* Finish reverse() used in toString*/
        String left_half;
        String right_half;
        int N = s.length();
        if (N <= 1) return s;
        left_half = s.substring(0, N/2);
        right_half = s.substring(N/2, N);
        return reverse(right_half) + reverse(left_half);
    }

    public char read() {
        return current;
    }

    public void write(char symbol) {
        current = symbol;
    }

    public void moveLeft() {
        //StdOut.println("left");
        right.push(current);
        if (left.isEmpty())
            left.push('#');
        current = left.pop();
    }

    public void moveRight() {
        //StdOut.println("right");
        left.push(current);
        if (right.isEmpty())
            right.push('#');
        current = right.pop();
    }

    public String toString() {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        String opt="";

        String lt=""; 
        String rt="";
        while (!left.isEmpty())
            lt+=left.pop();
        lt=reverse(lt);
        while (!right.isEmpty())
            rt+=right.pop();
        String tp=lt+rt;

        for (int i=0; i<tp.length(); i++)
        {
            if (tp.charAt(i)!='#')
                opt=opt+tp.charAt(i)+" ";
        }
        return "  "+opt;
    }

    public static void main(String[] args)
    {
        TuringMachine tm=new TuringMachine(args[0]);
        String ipt=StdIn.readString();
        Tape in=new Tape(ipt);
        tm.simulate(ipt);
    }/**/
}