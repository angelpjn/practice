
package readInTurn5.nonEx;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        int [] num = {5, 2, 8, 3, 9};
        int sum = 0;
        double avg;
        for (int e : num)
            sum += e;
        avg = sum / num.length;

        System.out.println("요소 : " + Arrays.toString(num));
        String grade = String.format("%.2f", avg);
        System.out.println("총점 : " + sum + "/" + grade);
        System.out.println("평균 : " + avg);
    }
}