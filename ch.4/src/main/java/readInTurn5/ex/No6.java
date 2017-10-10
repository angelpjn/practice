
package readInTurn5.ex;

import java.util.Arrays;

public class No6 {
    public static void main(String[] args) {
        int [] arrFrom = {1, 2, 3, 4, 5};
        int [] arrTo = new int [5];

        System.arraycopy(arrFrom, 0, arrTo, 0, 4);
        System.out.println(Arrays.toString(arrTo));
    }
}