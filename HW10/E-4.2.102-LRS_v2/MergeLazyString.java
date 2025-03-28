public class MergeLazyString
{
   private static LazyString[] aux;
   public static void merge(LazyString[] a, int lo, int mid, int hi)
   {
       // Merge a[lo, mid) with a[mid, hi) into aux[0, hi-lo).
       int i = lo, j = mid, N = hi - lo;
       for (int k = 0; k < N; k++)
            {
               if      (i == mid) aux[k] = a[j++];
               else if (j == hi)  aux[k] = a[i++];
               else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
               else                               aux[k] = a[i++];
            }
       // Copy back into a[lo, hi)
       for (int k = 0; k < N; k++)
           a[lo + k] = aux[k];
   }
    public static void sort(LazyString[] a)
    {
        aux = new LazyString[a.length];  // Allocate just once!
        sort(a, 0, a.length);
    }
    public static void sort(LazyString[] a, int lo, int hi)
    {   // Sort a[lo, hi).
        int N = hi - lo;
        if (N <= 1) return;
        int mid = lo + N/2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }
    public static void main(String[] args)
    {}
}