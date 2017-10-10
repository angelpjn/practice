
package ex;

import java.util.Scanner;

public class No3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("알파벳을 입력하세요 : ");

        char ch = sc.next().charAt(0);

        if(( ch >= 65 ) && ( ch <= 91 )){

            System.out.println("입력하신 알파벳은 대문자입니다.");

            ch += 32;

            System.out.println((char)(ch-32)+"의 소문자는"+(char)ch+"입니다.");
    
        }
        else if((ch >= 97 )||(ch <= 123)){
            System.out.println("입력하신 알파벳은 소문자입니다.");

            ch -= 32;

            System.out.println((char)(ch+32)+"의 대문자는"+(char)ch+"입니다.");

        }

        else{
            System.out.println("알파벳이 아닙니다. 다시 입력하세요!");
        }

        sc.close();

    }
}