
package readInTurn4.ex.no12;

public class Employee {
    protected String name;
    protected String address;
    protected String telephone;

    public Employee() {    }

    public Employee(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String toString() {
        return ("이름 : " + this.name + "주소 : " + this.address + "전화번호 : " + this.telephone);
    }
}