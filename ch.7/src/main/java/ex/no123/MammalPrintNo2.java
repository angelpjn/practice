
package ex.no123;

import java.util.Scanner;

public class MammalPrintNo2 {

    public static void main(String[] args) {

        char c;

        Scanner scan = new Scanner(System.in);
        MammalNo1 mammal = new MammalNo1();

        System.out.print("먹이량 : ");
        mammal.eatAmount = scan.nextInt();

        System.out.print("이동 거리 : ");
        mammal.move = scan.nextDouble();

        System.out.print("크기 : ");
        mammal.size = scan.next();

        System.out.print("동물명 : ");
        mammal.type = scan.next();

        System.out.println(mammal);
        mammal.eat();
        mammal.work();

    }
}
