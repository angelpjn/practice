class Employee {
	private String name;
	private String address;
	private String telephone;

	public String getName( ) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress( ) {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone( ) {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String toString( ) {
		return (name + "," + address + "," + telephone);
	}
}

public class E0503 {
	public static void main(String[ ] args) {
		Employee im = new Employee( );
		im.setName("ȫ�浿");
		im.setAddress("��⵵");
		im.setTelephone("010-1234-5678");
		System.out.println(im);		
	}
}