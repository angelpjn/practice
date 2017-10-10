
package readInTurn5.ex;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;

        System.out.print("알파벳 입력 : ");
        ch = scan.next().charAt(0);
        if((int)ch >= 65 && (int)ch <= 91) {
            ch += 32;
            System.out.println(ch);
        }
        else {
            ch -= 32;
            System.out.println(ch);
        }
    }
}