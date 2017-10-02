
package ex.no12;

import java.util.Scanner;

public class ManagerNo2{
    public static void main(String[] args) {
        
        ManagerNo1 manager = new ManagerNo1();
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 : ");
        manager.name = scan.next();

        System.out.print("주소 : ");
        manager.address = scan.next();

        System.out.print("전화 번호 : ");
        manager.telephone = scan.next();

        System.out.print("직위 : ");
        manager.position = scan.next();

        System.out.println(manager);


    }

}

