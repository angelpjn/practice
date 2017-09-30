
package ex;

public class No2 {
    String name;
    String address;
    String phoneNum;

    void employeesInfo(String n, String a, String p) {
        this.name = n;
        this.address = a;
        this.phoneNum = p;

        System.out.printf("이름 : %s, 주소 : %s, 핸드폰 번호 : %s", n, a, p);
    }

    public static void main(String[] args) {

        No2 emp = new No2();
        emp.employeesInfo("박정남", "서울시 관악구", "010-8618-0796");
    }
}