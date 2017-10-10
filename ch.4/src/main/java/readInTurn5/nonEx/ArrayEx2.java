
package readInTurn5.nonEx;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        int [][] ar = {{10, 20, 30, 40}, {15, 24, 35, 45}, {50, 60, 70, 80}};
        System.out.println("요소 : " + Arrays.deepToString(ar));

        for(int row = 0; row < ar.length; row++) {
            for(int col = 0; col < ar[row].length; col++) {
                System.out.print(ar[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int [] row : ar) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}