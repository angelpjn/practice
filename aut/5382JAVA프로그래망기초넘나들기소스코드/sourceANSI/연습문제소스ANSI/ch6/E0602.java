class Employee {
	protected String name;
	protected String address;
	protected String telephone;

	public Employee( ) { } // 디폴트 생성자도 구현하자

	public Employee(String name, String address, String telephone) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public String toString( ) {
		return (name + "," + address + "," + telephone);
	}
}

class Manager extends Employee {
	private String job;
	public Manager( ) { } // 디폴트 생성자
	public Manager(String name, String address, String telephone, String job) {
		super(name, address, telephone);
		this.job = job;
	}
	
	public String toString( ) {
		return (name + "," + address + "," + telephone + "," + job);
	}
}
public class E0602 {
	public static void main(String[ ] args) {
		Manager hong = new Manager("홍길동", "서울", "010-2468-1357", "팀장");
		System.out.println(hong);
	}
}