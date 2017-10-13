
package readInTurn4.ex;

import java.util.Arrays;

public class No13{
    public static void main(String[] args){
        
        int [][] stds = {{50, 55, 60},
                         {40, 80, 90},
                         {100, 95, 90},
                         {10, 5, 10},};

        int sum = 0;
        float avg;

        System.out.println("학생별 과목 성적 원 데이터 : "+Arrays.deepToString(stds));



        for(int i = 0, row = stds.length; i < row; i++){
            System.out.println("std["+i+"] : ");

            for(int j = 0, col = stds[i].length; j < col; j++){
                System.out.print(stds[i][j] + "  ");
                sum += stds[i][j];
            }
            System.out.println();
            System.out.println("총 점 : "+sum);
            System.out.printf("%s %.2f\n","평균점수 :", sum/3.0f);
            System.out.println();
        }
    }
}