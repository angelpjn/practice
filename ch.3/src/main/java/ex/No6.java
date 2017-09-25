
package ex;

import java.util.Scanner;

public class No6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int point = sc.nextInt();

        char re;

        switch(point/10){

        case 10 : re = 'A';
        break;

        case 9 : re = 'A';
        break;

        case 8 : re = 'B';
        break;

        case 7 : re = 'C';
        break;

        case 6 : re = 'D';
        break;
        
        default : re = 'F';
        break;

        }

        System.out.println(re);

        sc.close();

    }
}