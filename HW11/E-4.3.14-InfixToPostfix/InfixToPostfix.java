// Exercise 4.3.14 InfixToPostfix
public class InfixToPostfix
{
// Complete the code here, see README on course website for problem
// description and instructions.
    public static void main(String[] args) 
    { 
        Stack<String> ops = new Stack<String>(); 
        Stack<String> values = new Stack<String>(); 
        while (!StdIn.isEmpty()) 
        { 
            // Read token, push if operator.
            String token = StdIn.readString();
            if (token.equals("(")) ; 
            else if (token.equals("+")) ops.push(token+" "); 
            else if (token.equals("-")) ops.push(token+" "); 
            else if (token.equals("*")) ops.push(token+" "); 
            else if (token.equals("/")) ops.push(token+" "); 
            else if (token.equals(")")) 
            { 
                // Pop, evaluate, and push result if token is ")".
                String op = ops.pop(); 
                String v = values.pop(); 
                if (op.equals("+ ")) v = values.pop()+v+"+ "; 
                else if (op.equals("- ")) v = values.pop()+v+"- "; 
                else if (op.equals("* ")) v = values.pop()+v+"* "; 
                else if (op.equals("/ ")) v = values.pop()+v+"/ "; 
                values.push(v); 
            } 
            // Token not operator or paren: push double value.
            else values.push(token+" "); 
        } 
        StdOut.println(values.pop());
    } 
}

/*
  Excerpt From
  Computer Science
  Sedgewick, Robert,Wayne, Kevin
  This material may be protected by copyright.
*/