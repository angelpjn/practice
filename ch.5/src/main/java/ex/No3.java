
package ex;

public class No3 {
    public static void main(String[] args){

        class Employees{
            String name;
            String address;
            int tel;
        }

        Employees emp1 = new Employees();

        emp1.name = "홍길동";
        emp1.address = "서울시 관악구";
        emp1.tel = 8618_0796;
        System.out.printf("%s %s %d",emp1.name, emp1.address, emp1.tel);
    }
}