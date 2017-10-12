
package readInTurn5.ex.no12345;

class ManagerInfo {
	String name, address, telephone, job;
	
	public ManagerInfo() {}
	
	public ManagerInfo(String n, String a, String t) {
		this.name = n;
		this.address = a;
		this.telephone = t;
		this.job = "사장";
	}
	
	public String toString() {
		return ("이름 : " + name + "\n주소 : " + address + "\n전화 번호 : " + telephone + "\n직책 : " + job);
	}
}

public class Manager {
	public static void main(String[] args) {
		ManagerInfo mng = new ManagerInfo();
		mng.name = "박정남";
		mng.address = "서울시";
		mng.telephone = "000";
		System.out.println(mng);
		
		ManagerInfo mng2 = new ManagerInfo("박정남", "서울", "11" );
		System.out.println(mng2); 

	}
}