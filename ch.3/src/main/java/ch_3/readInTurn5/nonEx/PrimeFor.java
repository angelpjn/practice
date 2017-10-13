
package ch_3.readInTurn5.nonEx;

public class PrimeFor {
    public static void main(String[] args) {

        int a = 0, b = 0;
        boolean prime;

        for(a = 2; a < 100; a++) {
            prime = true;
            for(int c = 2; c < a; c++) {
                if(a % c == 0) {
                    prime = false;
                }
            }
            if(prime == true) {
                b++;
                System.out.print(a + ", ");
            }
        }
        System.out.println("\n소수 갯수 : " + b);
    }
}