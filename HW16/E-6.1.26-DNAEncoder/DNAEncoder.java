public class DNAEncoder
{
    //------------------------------------------
    // Instance Variables
    //------------------------------------------
    private int[] dnaIntArray;
    private int length;

    //------------------------------------------
    // Constructor: 
    //converts a string to the internal representation
    //For the internal representation, use an array of int values, 
    //packing 16 characters in each int (two bits per character).
    //Example: 
    //if we use 2 bits 00,01,10,11 to represent A, C, T, G respectively, 
    //then a 8-bit decimal number 228, which in binary form is 11100100, 
    //is decoded as ACTG in DNA string. 
    //In this way, we can use 2-bit for each character, 
    //and each 8-bit (a byte) for 4 characters, saving memory usage.
    //------------------------------------------
    public DNAEncoder(String dnaString) {
        // Complete the code here, see README on course website
        // for problem description and instructions.
        length=dnaString.length();
        dnaIntArray=new int[length/16+1];
        if (length==0) dnaIntArray[0]=0;
        else
        {    
            for (int j=0; j<dnaIntArray.length; j++)
            {
                String str="1";
                for (int i=j*16; i<Math.min(j*16+16,length); i++)
                    switch (dnaString.charAt(i))
                    {
                        case 'A': str+="00"; break;
                        case 'T': str+="01"; break;
                        case 'C': str+="10"; break;
                        case 'G': str+="11"; break;
                    }
                dnaIntArray[j]=Integer.parseInt(str,2);
            }
            return;
        }
    }

    //------------------------------------------
    // Method
    //------------------------------------------
    public char charAt(int i){
        // Complete the code here, see README on course website
        // for problem description and instructions.
        //returns the character at the specified index

        //get the int position
        //get the int value
        int value=dnaIntArray[i/16];
        //get the binary string
        String bin=Integer.toBinaryString(value);
        //get the binary string position
        //get the binary value
        int binvalue=Integer.parseInt(bin.substring(i%16*2+1,i%16*2+3),2);

        String s="ATCG";
        return s.charAt(binvalue);
    }

    // Don't touch beyond this line
    //converts the internal representation to a string
    public String toString() {
        char [] ret = new char [length];
        for(int i=0;i<length;i++){
            ret[i] = charAt(i);
        }
        return String.copyValueOf(ret);
    }

    //takes a String pattern as an argument and returns 
    //the first occurrence of pattern in the represented string
    public int indexOf(String pattern) {
        DNAEncoder d = new DNAEncoder(pattern);
        for (int i=0;i<= this.length - d.length ;i++ ){
            boolean eq = true;
            for (int j=0;j<d.length;j++){
                if (this.charAt(i+j)!= d.charAt(j)) {//
                    eq = false;
                    break;
                }
            }
            if (eq) return i;
        }
        return -1;
    }

    //------------------------------------------
    // Test client 
    //------------------------------------------
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        DNAEncoder encoder = new DNAEncoder("");
        while (!StdIn.isEmpty()) {//loop, readAll one by one
            String next = StdIn.readString();
            if (next.equals("new")) {
                String t = stack.pop();
                encoder = new DNAEncoder(t);
            } else if (next.equals("toString")){
                System.out.println(encoder);
            } else if (next.equals("charAt")){
                int n  = Integer.parseInt(stack.pop());
                System.out.println(encoder.charAt(n));
            } else if (next.equals("indexOf")){
                System.out.println(encoder.indexOf(stack.pop()));
            } else {
                stack.push(next);
            }
        }
    }
}