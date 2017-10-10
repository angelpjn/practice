
package ex;

import java.util.Scanner;

public class No2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if( num%3 == 0 ){
            System.out.println(num +"은 3의 배수입니다.");
        }

        else{
            System.out.println(num +"은 3의 배수가 아닙니다.");
        }

        sc.close();
    }
}