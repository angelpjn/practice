
package readInTurn5.ex;

import java.util.Arrays;

public class No10 {
    public static void main(String[] args) {

        String [][] arr = {{"호랑이", "곰", "사자"}, {"오이", "당근"}, {"TV", "장농", "침대", "화장대"}};

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