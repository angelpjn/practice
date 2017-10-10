
package ex;

import java.util.Arrays;

public class No3{
    public static void main(String[] args){
        String [] str = new String[3];

        str[0] = "가자1";
        str[1] = "가자2";
        str[2] = "가자3";

        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+"  ");
        }
        System.out.println();
    }
}