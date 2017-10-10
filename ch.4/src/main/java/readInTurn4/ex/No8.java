
package ex;

import java.util.Arrays;
import java.util.Collections;

public class No8{
    public static void main(String[] args){
         
        String [] so = {"1", "2", "3", "4", "5"};

        Arrays.sort(so);
        System.out.println(Arrays.toString(so));

        Arrays.sort(so, Collections.reverseOrder());
        System.out.println(Arrays.toString(so));
    }
}