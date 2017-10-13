
package ch_3.readInTurn5.nonEx;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수 입력 : ");

        int num = in.nextInt();

        boolean flag = num % 2 == 0;


        in.close();
    }
}