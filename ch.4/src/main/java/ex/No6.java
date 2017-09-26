
package ex;

import java.util.Arrays;

public class No6{
    public static void main(String[] args){
         
        int [] copyFrom = {1, 2, 3, 4, 5};
        int [] copyTo = new int [5];

        System.arraycopy(copyFrom, 0, copyTo, 0, 5);
        System.out.println(Arrays.toString(copyTo));
    }
}