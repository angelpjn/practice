package readInTurn4.ex;

import java.util.Arrays;

public class No5{
    public static void main(String[] args){

        int i, j;
        int [][] ar = new int [5][6];

        for(i = 0; i < ar.length; i++){
            for(j = 0; j < ar[i].length; j++){
                ar[i][j] = (int)((Math.random() * 16) + 5);
                System.out.print(ar[i][j]+"\t ");
            }
            System.out.println();
        }
    }
}