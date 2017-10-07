
package readInTurn5.ex;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("알파벳 대문자 입력 : ");
        char ch = scan.next().charAt(0);

        int a = (int)ch + 32;

        System.out.println((char) a);

    }
}