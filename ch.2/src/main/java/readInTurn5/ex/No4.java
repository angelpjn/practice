
package readInTurn5.ex;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("3 나누기 5입력해라 : ");
        int i = scan.nextInt();
        int i2 = scan.nextInt();

        double dob = (double)i / i2;

        System.out.println(dob) ;

    }
}