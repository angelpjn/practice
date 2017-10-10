
package ex;

import java.util.Scanner;

public class No10{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요! : ");       
        int dec = sc.nextInt();

        System.out.println(Integer.toBinaryString(dec));

    }

}