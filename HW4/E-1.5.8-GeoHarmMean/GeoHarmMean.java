public class GeoHarmMean {
    public static void main(String[] args) {

        // Complete the code here, see README on course website for problem description and instructions.
        double[] list=StdIn.readAllDoubles();
        int n=list.length;
        double geomean=0, harmomean=0, geosum=0, harmosum=0;
        for (int i=0; i<n; i++)
        {
            geosum+=Math.log(list[i]);
            harmosum+=1.0/list[i];
        }
        geomean=Math.pow(Math.E,geosum*1.0/n);
        harmomean=n*1.0/(harmosum*1.0);
        System.out.println(geomean);
        System.out.println(harmomean);
    }
}