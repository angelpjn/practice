
package ch_3.readInTurn5.ex;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        
        System.out.print("정수 입력 : ");
        i = scan.nextInt();
        if(i == 0) {
            System.out.println("3의 배수 아님");
        }
        else {
            if (i % 3 == 0){
                System.out.println("3의 배수");
            }
            else {
                System.out.println("3의 배수 아님");
            }
        }
    }
}