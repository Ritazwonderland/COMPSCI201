public class Calculator3
{
    public static void main(String[] args)
    {
        // Complete the code here, see README on course website for problem description and instructions.
        while(!StdIn.isEmpty())
        {
            int a = StdIn.readInt();
            char op1 = StdIn.readString().charAt(0);
            int b = StdIn.readInt();
            char op2 = StdIn.readString().charAt(0);
            int c = StdIn.readInt();
            int result=0;
            switch(op1)
            {
                case '+':
                    switch(op2)
                    {
                        case '+':result=a+b+c;break;
                        case '-':result=a+b-c;break;
                        case '*':result=a+b*c;break;
                        case '/':result=a+b/c;break;
                        case '%':result=a+b%c;break;
                    }
                    break;
                case '-':
                    switch(op2)
                    {
                        case '+':result=a-b+c;break;
                        case '-':result=a-b-c;break;
                        case '*':result=a-b*c;break;
                        case '/':result=a-b/c;break;
                        case '%':result=a-b%c;break;
                    }
                    break;
                case '*':
                    switch(op2)
                    {
                        case '+':result=a*b+c;break;
                        case '-':result=a*b-c;break;
                        case '*':result=a*b*c;break;
                        case '/':result=a*b/c;break;
                        case '%':result=a*b%c;break;
                    }
                    break;
                case '/':
                    switch(op2)
                    {
                        case '+':result=(a/b)+c;break;
                        case '-':result=(a/b)-c;break;
                        case '*':result=(a/b)*c;break;
                        case '/':result=(a/b)/c;break;
                        case '%':result=(a/b)%c;break;
                    }
                    break;
                case '%':
                    switch(op2)
                    {
                        case '+':result=a%b+c;break;
                        case '-':result=a%b-c;break;
                        case '*':result=a%b*c;break;
                        case '/':result=a%b/c;break;
                        case '%':result=a%b%c;break;
                    }
                    break;
            }
            System.out.println(a+" "+op1+" "+b+" "+op2+" "+c+" = "+result);
        }
    }
}
