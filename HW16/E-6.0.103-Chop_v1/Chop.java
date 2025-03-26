public class Chop {
    public static void chop(int n) { 
        int i=0x1;
        double bit_pos = 1;

        while(n!=0) {     
            int  x = n & 0x1;
            n=n>>1;
            //System.out.println(n);
            if(4-(int)(Math.ceil(bit_pos/4))<0)break;
            if (x!=0){
                // "0".repeat(m) creates a string of m 0's. 
                if(4-(int)(Math.ceil(bit_pos/4))>=0)
                System.out.print("0".repeat( 4-(int)(Math.ceil(bit_pos/4))) );  
                // print in HEX format using %x without leading 0
                //System.out.printf('%x\n', (i << bit_pos) ); 
                System.out.printf("%x\n", i );
            }
            bit_pos += 1;
            i=i<<1;
            //n = n >> bit_pos;
        }        
    }

    public static void main( String [] args ) {
        int  n = Integer.parseInt(args[0],16);
        chop(n);
    }
}