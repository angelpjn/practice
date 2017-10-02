
package ex;

import java.util.Scanner;

class Employee {
    String name;
    String address;
    String telephone;

    public Employee(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
}

class Manager extends Employee {

    public Manager(String name, String address, String telephone) {
        super(name, address, telephone);
    }
    
    public String toString() {
        return ("\n이름 : " + super.name + "\n주소 : " + super.address + "\n전화번호 : " + super.telephone);
    }
}

public class No1 {
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