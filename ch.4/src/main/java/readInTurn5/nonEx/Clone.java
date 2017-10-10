
package readInTurn5.nonEx;

import java.util.Arrays;

public class Clone {
    public static void main(String[] args) {

        int [] ar = {1, 2, 3, 4, 5};
        int [] ar2 = ar.clone();

        for (int i = 3; i < ar2.length; i++) {
            System.out.print(ar2[i]);
        }
        System.out.println();

    }
}