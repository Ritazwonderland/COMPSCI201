public class Remove
{
    private static class LinkNode
    {
        public String value;
        public LinkNode next;
        public LinkNode(String v, LinkNode n)
        {
            value = v; next = n;
        }
    }
    public static void main(String[] args)
    {
        // DON'T change this.
        String toBeRemoved = args[0];
        
        String[] input = StdIn.readAllStrings();
        
        /// put input into a list 
        LinkNode head = new LinkNode(input[0], null);
        LinkNode q = head;
        
        for (int i = 1; i < input.length; ++i)
            {
                q.next = new LinkNode(input[i], null);
                q = q.next;
            }
        
        // remove the node
        head = remove_iter(head, toBeRemoved);
        
        // output the list
        for (LinkNode r = head; r != null; r = r.next)
            StdOut.print(r.value + " ");
        StdOut.println();
    }
    public static LinkNode remove_iter(LinkNode head, String key)
    {
        // Hint: what would be the corner case to consider? 
        // Complete the code here, see README on course website 
        //for problem description and instructions.
        LinkNode q = head;
        LinkNode temp=q;
        while (q!=null) 
        {
            if (q.value.equals(key)) 
            {
                if (q.next!=null)
                {
                    q.value=q.next.value;
                    q.next=q.next.next;
                }
                else {
                    temp.next=null;
                    q=q.next;
                }
            }
            else {
                temp=q;
                q = q.next;
            }
        }
        return head;
    }
}