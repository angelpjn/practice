
package readInTurn5.ex;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int year;

        System.out.print("연도 입력 : ");
        year = scan.nextInt();
        if(year % 4 == 0) {
            System.out.println("윤년");
        }
        else {
            System.out.println("평년");
        }
    }
}