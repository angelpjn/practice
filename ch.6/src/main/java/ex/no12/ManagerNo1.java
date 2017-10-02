
package ex.no12;

class ManagerNo1 extends Employee {
    String position;

    public ManagerNo1() {}
    public ManagerNo1(String name, String address, String telephone, String position) {
        super(name, address, telephone);
        this.position = position;
    }

    public String toString() {
        return ("이름 : " + this.name + "주소 : " + this.address + "전화번호 : " + this.telephone + "직위 : " + this.position);
    }
}
