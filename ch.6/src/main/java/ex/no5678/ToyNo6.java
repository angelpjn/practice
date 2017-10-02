
package ex.no5678;

import java.util.Scanner;

public class ToyNo6 extends Goods2 {
    public static void main(String[] args) {

        double earn, taxRate;

        Scanner scan = new Scanner(System.in);
        System.out.print("연봉 : ");
        earn = scan.nextDouble();
        System.out.print("면세율 : ");
        taxRate = scan.nextDouble();

        Goods2 goods2 = new Goods2(earn, taxRate);

        System.out.println(goods2);

        scan.close();
    }

}