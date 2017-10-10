
package readInTurn5.ex;

import java.util.Arrays;

public class No14 {
    public static void main(String[] args) {

        int [][] num =  {{0},
                         {1, 2},
                         {3, 4, 5},
                         {6, 7, 8, 9}};

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                System.out.printf("%d ", num[i][j]);
            }
            System.out.println();
        }
    }
}