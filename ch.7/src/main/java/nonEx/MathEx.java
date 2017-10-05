
package nonEx;

public class MathEx {
    public static int randomRange(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    public static void main(String[] args) {
        double ratio = 180 / 3.14159265358979323846;

        System.out.println("|-9| = " + Math.abs(-9));
        System.out.println("sqrt(9) = " + Math.sqrt(9));
        System.out.println("pow(2,3) = " + Math.pow(2,3));
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.sin(30 / ratio));

        for (int i = 1; i <= 5; i++) {
            System.out.println(randomRange(3,7) + ", ");
        }
        System.out.println();

    }


}