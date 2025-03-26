public class DFA {
    //Complete the code here, see README on course website for 
    //problem description and instructions.
    private int start;//starting state
    private boolean[] action;//state(int) (accept/reject)
    private ST<Character, Integer>[] next;//next[state]=<input(j),next state>

    public DFA(String filename) 
    {
        //states, input, startstate, structure
        In in = new In (filename);
        int statenum=in.readInt();//number of states
        String compo=in.readString();//possible input
        start=in.readInt();//starting state

        action=new boolean[statenum];
        next = (ST<Character, Integer>[]) new ST[statenum]; 

        for (int i=0; i<statenum; i++)
        {
            //action[state(int)] (accept/reject)
            if (in.readString().equals("True"))
                action[i]=true;
            else action[i]=false;

            //next[state]=<input(j),next state>
            next[i] = new ST<Character, Integer>();
            for (int j=0; j<compo.length(); j++)
            {   next[i].put(compo.charAt(j),in.readInt());}
        }
    } 

    public boolean recognizes(String input) 
    { 
        StdOut.print(start+" ");
        int state = start; 

        for (int i = 0; i < input.length(); i++) 
        {
            StdOut.print("#"+input.charAt(i)+"-> ");
            state = next[state].get(input.charAt(i));
            StdOut.print(state+" ");
        }
        return action[state]; 
    } 

    public static void main(String[] args) 
    { 
        DFA dfa = new DFA(args[0]);//total input(filename)
        String input;

        while (!StdIn.isEmpty()) 
        { 
            input = StdIn.readString();
            if (dfa.recognizes(input)) StdOut.println("Yes"); 
            else StdOut.println("No"); 
        }
    }
}