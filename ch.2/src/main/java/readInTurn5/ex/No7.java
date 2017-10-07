
package readInTurn5.ex;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("초 입력 : ");
        int sec = scan.nextInt();
        int hour = sec / 3600;
        int min = (sec - hour * 3600) / 60;
        int sec2 = sec - hour * 3600 - min * 60;

        
        System.out.printf("%d시 %d분 %d초",hour, min, sec2);
    }
}