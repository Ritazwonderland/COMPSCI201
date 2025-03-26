// Complete the code here, see README on course website 
//for problem description and instructions.
public class InsertionSortTrace
{
    // Complete the code here, see README on course website for
    // problem description and instructions.
    public static void sort(Comparable[] a)
    {
        int n=a.length;
        for (int i=1; i<n; i++)
        {
            for (int k=0; k<a.length; k++)
            {
                StdOut.print(a[k]+" ");
            }
            StdOut.println();
            for (int j=i; j>0; j--)
            {
                if (a[j].compareTo(a[j-1])<0)
                    exchangeNPrint(a,j-1,j);
                else break;
            }   
        }
    }
    public static void exchangeNPrint(Comparable[] a, int i, int j)
    {
        Comparable temp=a[j]; 
        a[j]=a[i]; 
        a[i]=temp;
    }
    public static void main(String[] args)
    {
        String[] a=StdIn.readAllStrings();
        sort(a);
        for (int i=0; i<a.length; i++)
        {
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }
}

