package ex;

import java.util.Arrays;

public class No14{
    public static void main(String[] args){

        int [][] ar = {{0},
                       {1, 2},
                       {3, 4, 5},
                       {6, 7, 8, 9}};

        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                System.out.printf("%d", ar[i][j]);
            }
            System.out.println();
        }
    }
}