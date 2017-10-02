
package ex;

import java.util.Scanner;

class AbsoluteValue {
    private static int num;

    static void computeAbsoluteValue(int n) {

        num = n;

        if(num < 0) {
            System.out.println(num + 2*(- num));
        }
        else {
            System.out.println(num);
        }
    }
}

public class No12 {
    public static void main(String[] args) {
        int n2;
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요! : ");
        n2 = scan.nextInt();

        AbsoluteValue.computeAbsoluteValue(n2);
    }
}