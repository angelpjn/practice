
package ex;

import java.util.Scanner;

public class No1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");

        int num = sc.nextInt();

        if( num < 0){
            System.out.println(num+"은 음수입니다.");
        }

        else if( num > 0 ){
            System.out.println(num+"은 양수입니다.");
        }

        else{
            System.out.println(num+"은 0입니다.");
        }

        sc.close();
    }
}