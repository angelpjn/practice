
package ch_3.readInTurn5.ex;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.print("정수 입력 : ");
        i = scan.nextInt();

        System.out.println(Integer.toBinaryString(i));

    }
}