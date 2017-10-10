
package readInTurn5.ex;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        System.out.print("정수 입력 : ");
        i = scan.nextInt();

        if ( i % 2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
    }
}