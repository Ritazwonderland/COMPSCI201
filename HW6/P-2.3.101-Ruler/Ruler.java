// Modify the file to produce the output format in the 
//description

public class Ruler {
    public static int depth; 
    public static String ruler(int n) {
        if (n == 0) {
            return "";
        } else {
            String space="";
            for (int i=0; i<depth-n; i++) space+="  ";
            return  ruler(n-1)+space+n+"\n"+ruler(n-1);
        }
    }
    public static void main(String[] args) {
 
        int n = Integer.parseInt(args[0]);
        depth = n;
        StdOut.println(ruler(n));

        return;
    }
}
