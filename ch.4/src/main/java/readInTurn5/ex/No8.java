
package readInTurn5.ex;

import java.util.Arrays;
import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr = new int [5];

        System.out.print("정수 입력 : ");
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        arr[3] = scan.nextInt();
        arr[4] = scan.nextInt();

        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.print("정수 입력 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int j = 4; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}