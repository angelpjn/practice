
package ex;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
   
        String name, address, telephone;

        Scanner scan = new Scanner(System.in);

        System.out.print("이름 : ");
        name = scan.next();

        System.out.print("주소 : ");
        address = scan.next();

        System.out.print("전화 : ");
        telephone = scan.next();

        System.out.println();
    

        Manager manager = new Manager(name, address, telephone);

        System.out.println(manager);

        scan.close();
    }

}