
package readInTurn5.nonEx;

import java.util.Arrays;

public class ArraycopyEx {
    public static void main(String[] args) {
        int [] copyFrom = {1, 2, 3, 4, 5};
        int [] copyTo = new int [5];

        System.arraycopy(copyFrom, 0, copyTo, 0, 3);
        System.out.print(Arrays.toString(copyTo));

        System.out.println();
        System.out.print("copyTo 요소 출력 : " + Arrays.toString(copyTo));

        System.out.println();
        for(int e : copyTo)
            System.out.print(e);
        System.out.println();

    }
}