// Modify this file to achieve the output format in the demo case

public class Ruler {

    public static String ruler(int n) {

        if (n == 0) {
            return " ";
        } else {
            String space="";
            for (int i=0; i<n-1; i++) space+=" ";
            return  ruler(n-1)+space+n+'\n'+ruler(n-1);
        }
    }
    public static void main(String[] args) {
 
        int n = Integer.parseInt(args[0]);
        System.out.println("Ruler of "+n+":\n==========");
        StdOut.println(ruler(n));
        return;
    }
}
