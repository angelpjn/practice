
package exercise;

import java.util.Scanner;

    public class No_9_1 {
        public static void main(String[] args){

            Scanner sa = new Scanner(System.in);

            System.out.println("변환할 값을 입력하세요 : ");
            int bit = sa.nextInt();
            
            System.out.println(~bit);

            sa.close();
        }
    }