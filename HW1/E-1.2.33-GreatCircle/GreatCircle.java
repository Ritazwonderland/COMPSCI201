public class GreatCircle {
    public static void main(String[] args) {
        double distance ;

        // Compute distance

        // Complete the code here, see README on course website for problem description and instructions.
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        distance = 60 * Math.toDegrees(Math.acos(Math.sin(Math.toRadians(x1)) * 
        Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * 
        Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))));
        
        System.out.println(distance + " nautical miles");
    }
}
