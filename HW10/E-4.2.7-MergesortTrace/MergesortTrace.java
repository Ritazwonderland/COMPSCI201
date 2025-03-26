public class MergesortTrace {
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public static void sort(Comparable[] a)
    {
        Comparable[] aux=new Comparable[a.length];
        sort(a,aux,0,a.length);
    }
    private static void sort(Comparable[] a,Comparable[] aux,int lo, int hi)
    {
        
        if (hi-lo<=1) return;
        int mid=lo+(hi-lo)/2;
        sort(a,aux,lo,mid);//
        sort(a,aux,mid,hi);//
        int i=lo,j=mid;
        for (int k=lo; k<hi; k++)
            if (i==mid) aux[k]=a[j++];
            else if (j==hi) aux[k]=a[i++];
            else if (a[j].compareTo(a[i])<0) aux[k]=a[j++];
            else aux[k]=a[i++];//
        for (int k=lo;k<hi;k++)
                a[k]=aux[k];
        for (int l=0; l<hi; l++){
                if (l<lo) StdOut.print("    ");
                else StdOut.print(aux[l]+" ");
            }
        System.out.println();
        
    }
    public static void main(String[] args)
    {
        String[] a=StdIn.readAllStrings();
        for (int i=0; i<a.length; i++)
        {
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
        sort(a);
        
    }
}