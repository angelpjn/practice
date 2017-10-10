
package ex;

import java.util.Scanner;

public class No4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력하세요. : ");

        int yr = sc.nextInt();

        if( yr % 4 == 0 ){

            System.out.println(yr+"년은 윤년입니다.");

        }

        else{
            System.out.println(yr+"년은 평년입니다.");
        }

        sc.close();

    }
}