
package ex;

class Employees {
    String name;
    String address;
    String phoneNum;
}

public class No1 {
    public static void main(String[] args) {

        Employees emp1 = new Employees();

        emp1.name = "박정남";
        emp1.address = "서울시 관악구";
        emp1.phoneNum = "010-8618-0796";

        System.out.printf("이름 : %s, 주소 : %s, 핸드폰 번호 : %s\n", emp1.name, emp1.address, emp1.phoneNum);        
    }       
}