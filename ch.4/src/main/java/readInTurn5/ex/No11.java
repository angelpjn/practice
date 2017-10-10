
package readInTurn5.ex;

import java.util.Arrays;

public class No11 {
    public static void main(String[] args) {

        int [][] arr = {{86, 92, 85}, {70, 89, 88}, {95, 98, 94}, {73, 76, 80}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }
}