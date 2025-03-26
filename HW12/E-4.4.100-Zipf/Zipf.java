import java.util.Arrays;

public class Zipf { 
    // Note: nested class for sort freq/key pair
    static class Pair implements Comparable<Pair>
    {
        // Complete the code here, see README on course website for
        // problem description and instructions.
        int freq;
        String key;

        public Pair(int freq,String key)
        {
            this.freq=freq;
            this.key=key;
        }

        public int compareTo(Pair b)
        {
            if (this.freq>b.freq) return -1;
            else if (this.freq<b.freq) return 1;
            else return this.key.compareTo(b.key);
        }
    }

    public static void main(String[] args)
    { 
        /*
          To read input stream from a file, use this

        In in = new In (args[0]);
        while (!in.isEmpty())
        {
            String key = in.readString();
            ...
        } 
        */
        // Complete the code here, see README on course website for
        // problem description and instructions.
        BST<String,Integer> words=new BST<String,Integer>();

        In in = new In (args[0]);
        while (!in.isEmpty())
        {
            String wd = in.readString();
            if (!words.contains(wd)) words.put(wd,1);
            else words.put(wd, words.get(wd) + 1);
        } 

        Pair[] text=new Pair[words.size()];
        int fre;
        int i=0;
        for (String wd : words.keys())
        {
            fre=words.get(wd);
            text[i++]=new Pair(fre,wd);
        }

        Arrays.sort(text);
        int pairslen=Math.min(20,text.length);
        for (i=0; i<=pairslen-1; i++)//print: System.out.printf("%10d %s\n", freq, key);
        {
            System.out.printf("%10d %s\n", text[i].freq, text[i].key);
        }
    }
}