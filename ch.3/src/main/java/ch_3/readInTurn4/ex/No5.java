
package ch_3.readInTurn4.ex;

import java.util.Scanner;

public class No5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("1에서 9 사이의 숫자를 입력하세요. : ");

        int num = sc.nextInt();

        if((num >= 1) && (num <= 9)){

            num = num % 2;

            switch(num){
                case 0 : System.out.println("짝수");
                break;

                default : System.out.println("홀수");
                break;
            }

        }

        else{
            System.out.println("1에서 9 사이의 숫자를 입력하세요.");
        }

        sc.close();

    }
}