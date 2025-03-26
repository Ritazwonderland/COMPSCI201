/******************************************************************************
 *  Compilation:  javac Value.java
 *  Execution:    java Value  (interactive test of basic functionality)
 *  Dependencies: none
 *
 *  Author: Jiang Long 
 *
 *  Untyped value ADT.
 * 
 ******************************************************************************/
import java.util.Arrays;
public class Value{
    //--------------------------------------------------------------------
    // Enum types and static variables
    //--------------------------------------------------------------------
    public enum ValueType {
        LONG,
        DOUBLE, 
        STRING
    } ;
    public static final ValueType STRING = ValueType.STRING;
    public static final ValueType LONG = ValueType.LONG;
    public static final ValueType DOUBLE = ValueType.DOUBLE;

    private long l;
    private double d;
    private String s;
    private ValueType vt;

    //--------------------------------------------------------------------
    // member variable: valType, longVal, strVal, doubleVal
    //--------------------------------------------------------------------
    // Complete the code here, see README on course website for
    // problem description and instructions.

    //--------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------
    // Complete the code here, see README on course website 
    //for problem description and instructions.
    public Value(long n)
    {
        this.l=n;
        this.d=n*1.0;
        this.s=n+"";
        this.vt=LONG;
    }
    public Value(double n)
    {
        this.d=n;
        this.s=n+"";
        this.vt=DOUBLE;
    }
    public Value(String n)
    {
        this.s=n;
        this.vt=STRING;
    }

    //--------------------------------------------------------------------
    // static method : __add__(a,b)
    //--------------------------------------------------------------------
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public static Value __add__(Value a,Value b)
    {
        if (a.vt==STRING||b.vt==STRING) return new Value(a.s+b.s);
        else if (a.vt==LONG&&b.vt==LONG) return new Value(a.l+b.l);
        else return new Value(a.d+b.d);
    }
    
    //--------------------------------------------------------------------
    // instance method : a.__add__(b)
    //--------------------------------------------------------------------
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public Value __add__(Value b)
    {
        return __add__(this,b);
    }

    //--------------------------------------------------------------------
    // __str__
    //--------------------------------------------------------------------
    public String toString(){
        if (vt == LONG) return ""+l;
        else if (vt == STRING) return s;
        else if (vt == DOUBLE) return ""+d;
        assert (false);
        return null;
    }

    //--------------------------------------------------------------------
    // Generic print method
    //--------------------------------------------------------------------
    public static <E> void  TPrint(String tag, E e){
        System.out.println(tag + " " + e);
    }

    public static <E> void  TPrint(String tag, E[] e){
        System.out.println(tag + " " + Arrays.toString(e));
    }

    //--------------------------------------------------------------------
    // test client: don't touch below this line
    //--------------------------------------------------------------------
    public static void main(String [] args){
        Value a = new Value(Long.parseLong(args[0])); // long 
        Value b = new Value(Double.parseDouble(args[1])); // double
        Value c = new Value(args[2]);
        
        Value [] vx = { a,b,c};
        TPrint("a =", a);
        TPrint("b =", b);
        TPrint("c =", c);

        TPrint("a+a =", a.__add__(a));
        TPrint("b+b =", b.__add__(b));
        TPrint("c+c =", c.__add__(c));

        TPrint("a+b =", a.__add__(b));
        TPrint("a+c =", a.__add__(c));
        TPrint("b+c =", b.__add__(c));
        TPrint("c+b =", c.__add__(b));

        TPrint("b+c =", __add__(b,c));
        TPrint("c+b =", __add__(c,b));

        TPrint("a+a+a =", a.__add__(a).__add__(a));
        TPrint("b+b+b =", b.__add__(b).__add__(b));
        TPrint("c+c+c =", c.__add__(c).__add__(c));

        TPrint("vx =", vx);
    }
}
 