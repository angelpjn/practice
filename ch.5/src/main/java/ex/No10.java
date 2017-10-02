
package ex;

import java.util.Scanner;

class Score {
    int idNumber;
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;

    Score (int id, String n, int kor, int eng, int math) {
        this.idNumber = id;
        this.name = n;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    void compute() {
        this.total = this.kor + this.eng + this.math;
        this.avg = (double)this.total / 3;

        System.out.printf("학번 : %d \n성명 : %s \n국어 점수 : %d \n영어 점수 : %d \n수학 점수 : %d \n총 점 : %d \n평균 점수 : %.2f\n", this.idNumber, this.name, this.kor, this.eng, this.math, this.total, this.avg);

        switch ((int)this.avg / 10) {
            case 10 : System.out.print("학점 : A+");
            break;
            case 9 : System.out.print("학점 : A");
            break;
            case 8 : System.out.print("학점 : B");
            break;
            case 7 : System.out.print("학점 : C");
            break;
            case 6 : System.out.print("학점 : D");
            break;
            default : System.out.print("학점 : F");
            break;
        }
        
        System.out.println();

        if((int)this.avg >= 90) {
            System.out.println(this.name + "학생은 성적 장학금 대상입니다.");
        }
        else if((int)this.avg <= 60) {
            System.out.println(this.name + "학생은 유급 대상입니다.");
        }
        else {
        }
    }
}

public class No10 {
    public static void main(String[] args) {

        int idNumber;
        String name;
        int kor, eng, math;

        Scanner scan = new Scanner(System.in);

        System.out.print("학번 : ");
        idNumber = scan.nextInt();
        System.out.print("이름 : ");
        name = scan.next();
        System.out.print("국어 점수 : ");
        kor = scan.nextInt();
        System.out.print("영어 점수 : ");
        eng = scan.nextInt();
        System.out.print("수학 점수 : ");
        math = scan.nextInt();

        System.out.println();

        Score score = new Score(idNumber, name, kor, eng, math);
        score.compute();

        scan.close();
    }
}