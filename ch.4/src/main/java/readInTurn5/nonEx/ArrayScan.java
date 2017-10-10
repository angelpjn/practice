
package roundInTurn5.nonEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for(int e : numbers)
            sum += e;
        average = (double)sum / numbers.length;

        System.out.println("요소 : " + Arrays.toString(numbers));
        String grade = String.format("%.2f", average);
        System.out.println("총점 : " + sum + "/" + grade);
    }
}