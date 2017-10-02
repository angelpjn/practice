
package ex;

import java.util.Scanner;

class Score2 {
    String idNumber, name;
    int kor, eng, math, total;
    double avg;

    Score2 (String id, String n, int kor, int eng, int math) {
        this.idNumber = id;
        this.name = n;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    void compute() {
        this.total = this.kor + this.eng + this.math;
        this.avg = (double)this.total / 3;

        System.out.printf("\n학번 : %s\n성명 : %s\n", this.idNumber, this.name);

        System.out.print("\n국어 점수 : " + this.kor + "점");

        switch (this.kor / 10) {
            case 10 : System.out.print("(A+)");
            break;
            case 9 : System.out.print("(A)");
            break;
            case 8 : System.out.print("(B)");
            break;
            case 7 : System.out.print("(C)");
            break;
            case 6 : System.out.print("(D)");
            break;
            default : System.out.print("(F)");
            break;
        }

        System.out.print("\n영어 점수 : " + this.eng + "점");

        switch (this.eng / 10) {
            case 10 : System.out.print("(A+)");
            break;
            case 9 : System.out.print("(A)");
            break;
            case 8 : System.out.print("(B)");
            break;
            case 7 : System.out.print("(C)");
            break;
            case 6 : System.out.print("(D)");
            break;
            default : System.out.print("(F)");
            break;
        }

        System.out.print("\n수학 점수 : " + this.math + "점");

        switch (this.math / 10) {
            case 10 : System.out.print("(A+)");
            break;
            case 9 : System.out.print("(A)");
            break;
            case 8 : System.out.print("(B)");
            break;
            case 7 : System.out.print("(C)");
            break;
            case 6 : System.out.print("(D)");
            break;
            default : System.out.print("(F)");
            break;
        }
        System.out.println();

        System.out.printf("\n\n총 점 : %d\n평균 점수 : %.2f\n\n", this.total, this.avg);

        if(this.avg >= 90) {
            System.out.println(this.name + "학생은 성적 우수 장학금 대상입니다.");
        }
        else if(this.avg < 60) {
            System.out.println(this.name + "학생은 유급 대상입니다.");
        }
        else {
            System.out.println(this.name + "학생은 조금 더 노력이 필요합니다.");
        }
    }
}

public class No11 {
    public static void main(String[] args) {
        String id, name;
        int kor, eng, math;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("학번 : ");
        id = scan.next();
        System.out.print("성명 : ");
        name = scan.next();
        System.out.print("국어 점수 : ");
        kor = scan.nextInt();
        System.out.print("영어 점수 : ");
        eng = scan.nextInt();
        System.out.print("수학 점수 : ");
        math = scan.nextInt();

        Score2 score = new Score2(id, name, kor, eng, math);
        score.compute();
        scan.close();

    }
}