
package readInTurn5.ex;

import java.util.Arrays;

public class No13 {
    public static void main(String[] args) {

        int [][] students =  {{80, 90, 100},
                              {10, 20, 30},
                              {50, 60, 70},
                              {30, 40, 80}};
        int [] sum = new int[4];
        double [] avg = new double[4];
        int [] sum2 = new int[3];
        double [] avg2 = new double[3];
        String [] name = {"홍길동", "임꺽정", "전우치", "장길산"};
        String [] subjectsName = {"국어", "영어", "수학"};


        for(int i = 0; i < students.length; i++) {
            for(int j = 0; j < students[i].length; j++) {
                sum[i] += students[i][j];
            }
            avg[i] = sum[i] / (double)4;

            System.out.printf("이름 : %s => 국어 : %d 영어 : %d 수학 : %d \n총 점 : %d \n평균 : %.2f\n\n", name[i], students[i][0], students[i][1], students[i][2], sum[i], avg[i]);
        }

        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < students.length; i++) {
                sum2[j] += students[i][j];
            }
            avg2[j] = sum2[j] / (double)4;

            System.out.printf("과목별 결과 : %s => 총 점 : %d 평균 : %.2f\n", subjectsName[j], sum2[j], avg2[j]);
        }


    }
}