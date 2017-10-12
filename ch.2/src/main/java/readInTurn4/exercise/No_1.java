
package readInTurn4.exercise;

    public class No_1 {
        public static void main(String[] args){

            int dec = 10;

            System.out.println(dec);

            String bin = Integer.toBinaryString(dec);
            String oct = Integer.toOctalString(dec);
            String hex = Integer.toHexString(dec);

            System.out.println(bin);
            System.out.println(oct);
            System.out.println(hex);
        }
    }