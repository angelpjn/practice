public class Employee {
	private String name;
	private String address;
	private String telephone;

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
public class E0504 {
	public static void main(String[ ] args) {
		Employee im = new Employee("ȫ�浿", "��⵵", "010-1234-5678");
		System.out.println(im);
	}
}