
package readInTurn4.exercise;

import java.util.Scanner;

    public class No_5 {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int num;
            
            System.out.print("정수 입력 : ");
            num = scan.nextInt();
            
            if ( num > 0 )
            {
            System.out.println("양수");
            }

            else if( num < 0 )
            {
            System.out.println("음수");
            }

            else
            {
            System.out.println("0 입력하지 마세요!");
            }

            scan.close();
        }
    }