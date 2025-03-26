public class LazyString implements Comparable <LazyString> { 
    
    //---------------------------------------------
    // Instance var: fixed, for later use
    //creating a lazy string is actually creating a reference
    //---------------------------------------------

    // Complete the code here, see README on course website for
    // problem description and instructions.
    private final String parent;
    private final int start;
    private final int length;

    //---------------------------------------------
    // Constructor O(1)
    //---------------------------------------------
    public LazyString( String p,  int start, int end) {
        // O(1) in time and memory

        // Complete the code here, see README on course website
        // for problem description and instructions.
        this.parent=p;
        this.start=start;
        this.length=end-start;
    }
    
    public LazyString( String p ) {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        this.parent=p;
        this.start=0;
        this.length=p.length();
    }

    //---------------------------------------------
    // Instance method
    //---------------------------------------------
    public int length() {
        // O(1) in time and memory
        // Complete the code here, see README on course website
        // for problem description and instructions.
        return this.length;
    }

    public char charAt(int i) {
        // O(1) in time and memory

        // Complete the code here, see README on course website
        // for problem description and instructions.
        return this.parent.charAt(this.start+i);
    }
    public String toString() {
        // O(length()) in time and memory

        // Complete the code here, see README on course website
        // for problem description and instructions.
        return this.parent.substring(this.start,this.length+this.start);
    }
    
    public LazyString substring(int start, int end) {
        // O(1) in time and memory

        // Note: call a String.substring here will not result in O(1)
        // memory and time. 

        // Complete the code here, see README on course website
        // for problem description and instructions.
        return new LazyString(this.parent,this.start+start,this.start+end);
    }

    public LazyString substring(int start){
        // O(1) in time and memory
        // Note: String.substring is not a O(1) operation
        // Complete the code here, see README on course website
        // for problem description and instructions.
        return this.substring(start,this.length);
    }

    public int compareTo(LazyString s) {
        // O(n) in time, O(1) in memory
        
        // Note: call a String.substring method will not be O(1) 
        //memory usage
        
        // The same semantics as String.compareTo with performance
        // requirement that memory usage is O(1)

        // Hint : The LazyString is a sequence of char as well, you
        // should use charAt to do comparison directly from charAt(0),
        // charAt(1), ... etc (in a loop).
        // 
        // Also, consider the situation when the two does not have
        // equal length
        
        // This method is not covered/tested enough in the
        // test-client, you may come back to this in the future if
        // there is a bug

        // Complete the code here, see README on course website
        // for problem description and instructions.
        if (this.length()!=s.length()) 
        {
           // System.out.println("difflength");
            for (int j=0;j<Math.min(this.length(),s.length());j++)
                {
                    if (this.charAt(j)==s.charAt(j)) {
                        //System.out.println("firstequal");
                        continue;
                    }
                    else return (int) this.charAt(j)-(int) s.charAt(j);
                }
            return this.length()-s.length();
        }
        else 
            {
                for (int i=0; i<this.length; i++)
                    {
                        if (this.charAt(i)!=s.charAt(i)) 
                            {
                                //System.out.print(this.charAt(i));
                                //System.out.println(s.charAt(i));
                                return (int) this.charAt(i)-(int) s.charAt(i);
                            }
                    }
                return 0;
            }
        }
    
    //---------------------------------------------
    // Test client 
    //---------------------------------------------
    public static void main(String [] args){
        String x = args.length>0? args[0] : "abcdef";
        String y = args.length>1? args[1] : "bcdefg";
        LazyString a = new LazyString(x);
        LazyString b = new LazyString(y);
        StdOut.println("LazyString a: " + a);
        StdOut.println("a.charAt(3): " + a.charAt(3));
        StdOut.println("LazyString a.substring(1): " + a.substring(1));
        StdOut.println("LazyString a.substring(1, 5): " + a.substring(1,5));
        StdOut.println("LazyString x.substring(1, 5): " + x.substring(1,5));
        StdOut.println("LazyString a.substring(1, 5).substring(2): " + a.substring(1,5).substring(2));
        StdOut.println("LazyString a.substring(1, 5).substring(2, 4): " + a.substring(1,5).substring(2,4));
        StdOut.println("LazyString x.substring(1, 5).substring(2, 4): " + x.substring(1,5).substring(2,4));
        StdOut.println("LazyString x.substring(1, 5).substring(2): " + x.substring(1,5).substring(2));
        StdOut.println("LazyString x.substring(1, 5).charat(2): " + x.substring(1,5).charAt(2));
        StdOut.println("LazyString a.substring(1, 5).substring(1).toString().equals(x.substring(1,5).substring(2)): " + a.substring(1, 5).substring(1).toString().equals(x.substring(1,5).substring(1) ));

        StdOut.println("LazyString a.substring(0, 3): " + a.substring(0,3));
        StdOut.println("LazyString a.substring(0): " + a.substring(0));
        StdOut.println("LazyString b: " + b);
        StdOut.println("LazyString b.legnth: " + b.length);
        StdOut.println("a.compareTo(b): " + a.compareTo(b));//
        StdOut.println("b.compareTo(a): " + b.compareTo(a));//
        StdOut.println("LazyString a.substring(1): " + a.substring(1));
        StdOut.println("LazyString b.substring(0,b.length-1): " + b.substring(0,b.length-1)) ;//
        StdOut.println("a.substring(1).compareTo(b.substring(0,b.length-1)): " + a.substring(1).compareTo(b.substring(0,b.length-1)));

    }
}