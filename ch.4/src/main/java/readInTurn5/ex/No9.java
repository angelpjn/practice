
package readInTurn5.ex;

import java.util.Arrays;

public class No9 {

    public static int randomRange(int n1, int n2) {
        return (int)(Math.random() * (n2 - n1 + 1))  + n1;
    }

    public static void main(String[] args) {

        int [] arr = new int [5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = randomRange(5, 20);
        }
        System.out.println(Arrays.toString(arr));
    }
}