
package readInTurn5.ex.no12345;

class EmployeeInsertMethod {
	String name, address, telephone;
	
	EmployeeInsertMethod(String n, String a, String t) {
		this.name = n;
		this.address = a;
		this.telephone = t;
	}
	
	public String toString() {
		return ("name : " + this.name + "\naddress : " + address + "\ntelephone : " + telephone + "\n");
	}
	
	public void setInfo(String n, String a, String t) {
		this.name = n;
		this.address = a;
		this.telephone = t;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s \n주소 : %s \n전화번호 : %s\n", name, address, telephone);
	}
}