
package readInTurn5.ex;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        System.out.print("정수 입력 : ");
        i = scan.nextInt();
        if (i < 0) {
            System.out.println("음수");
        }
        else if (i == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("양수");
        }
                
    }
}