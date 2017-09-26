
package ex;

import java.util.Arrays;

public class No7{
    public static void main(String[] args){
         
        String [] cloneFrom = {"1", "2", "3", "4", "5"};
        String [] cloneTo = cloneFrom.clone();

        for(int i = 0; i < cloneTo.length; i++){
           System.out.println(cloneTo[i]);
        }
    }
}