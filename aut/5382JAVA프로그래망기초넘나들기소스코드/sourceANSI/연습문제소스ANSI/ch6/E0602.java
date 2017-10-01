class Employee {
	protected String name;
	protected String address;
	protected String telephone;

	public Employee( ) { } // ����Ʈ �����ڵ� ��������

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
	public Manager( ) { } // ����Ʈ ������
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
		Manager hong = new Manager("ȫ�浿", "����", "010-2468-1357", "����");
		System.out.println(hong);
	}
}