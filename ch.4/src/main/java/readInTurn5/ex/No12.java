
package readInTurn5.ex;

import java.util.Arrays;

public class No12 {
    public static void main(String[] args) {

        int [][] students =  {{80, 90, 100},
                              {10, 20, 30},
                              {50, 60, 70},
                              {30, 40, 80}};
        int [] sum = new int[4];
        double [] avg = new double[4];
        String [] name = {"홍길동", "임꺽정", "전우치", "장길산"};



        for(int i = 0; i < students.length; i++) {
            for(int j = 0; j < students[i].length; j++) {
                sum[i] += students[i][j];
            }
            avg[i] = sum[i] / (double)4;

            System.out.printf("이름 : %s => 국어 : %d 영어 : %d 수학 : %d \n총 점 : %d \n평균 : %.2f\n\n", name[i], students[i][0], students[i][1], students[i][2], sum[i], avg[i]);
        }


    }
}