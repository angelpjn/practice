
package readInTurn5.ex;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 입력해라 : ");
        int i = scan.nextInt();
        
        if (i > 0) {
            System.out.println("양수냐");
        }
        else if (i == 0) {
            System.out.println("0이구마");
        }
        else {
            System.out.println("음수여라 형님!");
        }
        

    }
}