
package exercise;

import java.util.Scanner;

    public class No_10 {
        public static void main(String[] args){

            Scanner sc  = new Scanner(System.in);

            System.out.println("알파벳 대문자를 입력하시오! : ");

            char al = sc.next().charAt(0);
            int al2 = (int)al + 32;

            System.out.println((char)al2);


        }
    }