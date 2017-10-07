
package readInTurn5.nonEx;

public class DownCasting {
    public static void main(String[] args) {

        int n = 815;
        String str = n + " can";
        System.out.println(str);
        
        int x = 123;
        String s = String.valueOf(x);
        String s1 = Integer.toString(x);

        double d = 567.89;
        String s2 = Double.toString(d);

        long lo = 479876543210L;
        String s3 = Long.toString(lo);
        System.out.println(s + "\t" + s1 + "\t" + s2 + "\t" + s3);

        float f2 = 8.15f;
        int i2 = (int) f2;
        double d2 = (double) i2;
        System.out.println(f2 + "\t" + i2 + "\t" + d2);

        String str4 = "1224";
        String str5 = "1224.34";        
        int y = Integer.valueOf(str4).intValue();
        int z = Integer.parseInt(str4);
        long lo2 = Long.parseLong(str4);
        float f = Float.parseFloat(str5);
        double d3 = Double.valueOf(str5).doubleValue();
        System.out.println(y + "\t" + z + "\t" + lo2 + "\t" + f + "\t" + d3);
    }
}
