public class ParathesesCompleter {
    public static void main(String[] args)
    {
        Stack<String> elements = new Stack<>();
        Stack<String> operator = new Stack<>();
        String []sx = StdIn.readAllStrings();
        
        // Complete the code here, see README on course website
        // for problem description and instructions.
        String num2="",op="",num1="",ele="";
        for (int i=0; i<sx.length; i++)
        {
            if (sx[i].equals(")"))
            {
                num2=elements.pop();
                op=elements.pop();
                num1=elements.pop();
                ele="("+num1+op+num2+")";
                elements.push(ele);
            }
            else if (!sx[i].equals(")")) elements.push(sx[i]);
        }
        System.out.print(elements.pop());
    }
}