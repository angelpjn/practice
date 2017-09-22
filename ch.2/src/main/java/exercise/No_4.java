
package exercise;

import java.util.Scanner;

    public class No_4 {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int scan1, scan2;
            
            System.out.print("3 입력 : ");
            scan1 = scan.nextInt();
            System.out.print("5 입력 : ");
            scan2 = scan.nextInt();

            double res = (double)scan1 % (double)scan2;
            System.out.println("3 나누기 5 나머지 : "+res);
            scan.close();
            
        }
    }