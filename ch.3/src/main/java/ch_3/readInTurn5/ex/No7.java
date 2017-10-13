
package ch_3.readInTurn5.ex;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;

        System.out.print("문자 입력 : ");
        ch = scan.next().charAt(0);

        if((ch >= 65) && (ch <= 91))
            ch += 32;

        switch (ch) {
            case 'a' : System.out.println("모음");
            break;
            case 'e' : System.out.println("모음");
            break;
            case 'i' : System.out.println("모음");
            break;
            case 'o' : System.out.println("모음");
            break;
            case 'u' : System.out.println("모음");
            break;
            default : System.out.println("자음");
            break;
        }
    }
}