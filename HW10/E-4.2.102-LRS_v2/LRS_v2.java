public class LRS_v2 {
    //---------------------------------------
    // Task: this need to take LazyString as parameter
    // for better performance
    //---------------------------------------
    public static LazyString lcp(LazyString s, LazyString t)    {
        int N = Math.min(s.length(), t.length());
        for (int i = 0; i < N; i++)
            if (s.charAt(i) != t.charAt(i))
                return s.substring(0, i);
        return s.substring(0, N);
    }

    //---------------------------------------
    // Task: you need to use LazyString and Merge sort here
    //---------------------------------------
    public static LazyString lrs(LazyString s)
    {
        int N = s.length();
        LazyString[] suffixes = new LazyString[N];
        for (int i = 0; i < N; i++)
            suffixes[i] = s.substring(i, N);

        MergeLazyString.sort(suffixes);
        LazyString lrs = new LazyString("");
        for (int i = 0; i < N-1; i++)
            {
                LazyString x = lcp(suffixes[i], suffixes[i+1]);
                if (x.length() > lrs.length()) lrs = x;
            }
        return lrs;
    }

    //---------------------------------
    // Test client
    //--------------------------------
    public static void main(String[] args)
    {
        LazyString s= new LazyString(StdIn.readAll());
        StdOut.println(lrs(s));
    }
}
