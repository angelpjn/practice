
package ch_3;

import java.util.Scanner;

public class NestedIfElse{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("연령을 입력하세요! : ");
        int age = sc.nextInt();

        if( age < 20 ){
            System.out.println("미성년자 할인 요금 대상");
        }
        
        else if( age > 65 ){
            System.out.println("고령자 할인 요금 대상");
        }

        else{
            System.out.println("성인 요금 대상");
        }

        sc.close();
    }
}