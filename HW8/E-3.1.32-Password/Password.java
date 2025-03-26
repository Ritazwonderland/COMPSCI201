public class Password {
    public static void main(String[] args){
        // Do not change this part
        // password is readin from stdi/o
        String password = StdIn.readAll();
        
        boolean is_safe = IsSafePassword(password);
       // System.out.println(password);
        System.out.println(is_safe);
    }
    // Implement static method IsSafePassword.
    
    // Complete the code here, see README on course website 
    //for problem description and instructions.
    public static boolean IsSafePassword(String n)
    {
        if (n.length()<8) return false;
        boolean up=false;        
        for (int i=0; i<n.length(); i++)
        {
            if ((n.charAt(i)>='A')&&(n.charAt(i)<='Z')) {
                up=true;
                n.replace(n.substring(i,i+1),"");
            }
        }
        boolean low=false;
        for (int i=0; i<n.length(); i++)
        {
            if ((n.charAt(i)>='a')&&(n.charAt(i)<='z')) {
                low=true;
                n.replace(n.substring(i,i+1),"");
            }
        }
        boolean num=false;        
        for (int i=0; i<n.length(); i++)
        {
            if ((n.charAt(i)>='0')&&(n.charAt(i)<='9')) 
            {
                num=true;
                n.replace(n.substring(i,i+1),"");
            }
        }
        if (n.length()!=0) return up&&low&&num;
        return false;
    }
}