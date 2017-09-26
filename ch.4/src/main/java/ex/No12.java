
package ex;

import java.util.Arrays;

public class No12{
    public static void main(String[] args){
         
        int [][] stds = {{50, 55, 60},
                         {40, 80, 90},
                         {100, 95, 90},
                         {10, 5, 10},};

        System.out.println(Arrays.deepToString(stds));

        for(int i = 0, row = stds.length; i < row; i++){
            for(int j = 0, col = stds[i].length; j < col; j++){
                System.out.print(stds[i][j] + "  ");
            }
            System.out.println();
        }


    }
}