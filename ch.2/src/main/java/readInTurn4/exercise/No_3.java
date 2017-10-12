
package readInTurn4.exercise;

import java.util.Scanner;

    public class No_3 {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("G를 입력하시오 : "+scan);
            String str = scan.next();
            int asc = (int)str.charAt(0);
            System.out.println(str+", asc : "+asc);
            scan.close();
            
        }
    }