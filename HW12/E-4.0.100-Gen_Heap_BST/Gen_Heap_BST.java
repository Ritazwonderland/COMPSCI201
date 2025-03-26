public class Gen_Heap_BST {
    public static String Heap_BST(int lo, int hi) {
        int lo1=0,hi1=0,lo2=0,hi2=0,i1=0;
        if (lo == hi) {
            return "";
        }
        if(hi-lo==1) return lo+"";
        for(int i=hi-1;i>=lo;i--){
            int n=2;
            while(n<i-lo){
                n*=2;
            }
            if(n==i-lo) n*=2;
            if(i-lo>=hi-1-i){
                if((i-lo==n-1&&hi-i-1>=n/2-1)||(i-lo<n-1&&hi-i-1==n/2-1))
                {
                    lo1=lo;
                    hi1=i;
                    lo2=i+1;
                    hi2=hi;
                    i1=i;
                }
            }
        }
        return i1+" "+Heap_BST(lo1,hi1)+" "+Heap_BST(lo2, hi2);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String r = Heap_BST(0, N);
        StdOut.println(r);
        return;
    }
}