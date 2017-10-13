
package readInTurn4.ex;

import java.util.Arrays;

public class No11{
    public static void main(String[] args){
        int [][] ar = {{86, 92, 85}, 
                       {70, 89, 88},
                       {95, 98, 94},
                       {73, 76, 80}};

        System.out.println("요소 : "+Arrays.deepToString(ar));

        for(int i = 0, row = ar.length; i < row; i++){
            for(int j = 0, col = ar[i].length; j < col; j++){
                System.out.print(ar[i][j]+" ");
            }
        System.out.println();
        }

        System.out.println();

        for(int [] i : ar){
            for(int e : i){
                System.out.print(e+" ");
            }
        System.out.println();
        }
    }
}