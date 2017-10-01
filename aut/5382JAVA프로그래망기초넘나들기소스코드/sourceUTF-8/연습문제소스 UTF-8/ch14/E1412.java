import java.io.*;

public class E1412 {
	public static void main(String[ ] args) throws Exception {
		String[ ] names = { "홍 길동", "이 기자", "한 반도" };
		String[ ] addresses = { "경기도", "서울", "광주" };
		byte[ ] ages = { 19, 25, 27 };
		double[ ] salaries = { 3000.0, 5000.0, 8000.0 };

		RandomAccessFile raf = new RandomAccessFile(
				"c:/work/java/employee.dat", "rw");
		Employee emp = new Employee( );
		for (int i = 0; i < names.length; i++) {
			emp.setName(names[i]);
			emp.setAddress(addresses[i]);
			emp.setAge(ages[i]);
			emp.setSalary(salaries[i]);
			emp.write(raf);
		}
		raf = new RandomAccessFile("c:/work/java/employee.dat", "rw");
		emp = new Employee( );

		long pos = raf.getFilePointer( );
		System.out.println("현재 파일 포인터 위치 = " + pos);
		System.out.println("파일 크기 = " + raf.length( ) + " bytes");
		int numRecords = (int) raf.length( ) / emp.size( );

		raf.seek(0);
		for (int i = 0; i < numRecords; i++) {
			emp.read(raf);
			System.out.print(emp.getName( ) + " ");
			System.out.print(emp.getAddress( ) + " ");
			System.out.print(emp.getAge( ) + " ");
			System.out.println(emp.getSalary( ));
		}
	}
}

class Employee {
	private String name;
	private String address;
	private byte age;
	private double salary;

	void read(RandomAccessFile raf) throws IOException {
		char[ ] temp = new char[15];
		for (int i = 0; i < temp.length; i++)
			temp[i] = raf.readChar( );
		name = new String(temp);

		temp = new char[20];
		for (int i = 0; i < temp.length; i++)
			temp[i] = raf.readChar( );
		address = new String(temp);
		age = raf.readByte( );
		salary = raf.readDouble( );
	}

	void write(RandomAccessFile raf) throws IOException {
		StringBuffer sb;
		if (name != null)
			sb = new StringBuffer(name);
		else
			sb = new StringBuffer( );
		sb.setLength(15);
		raf.writeChars(sb.toString( ));

		if (address != null)
			sb = new StringBuffer(address);
		else
			sb = new StringBuffer( );
		sb.setLength(20);

		raf.writeChars(sb.toString( ));
		raf.writeByte(age);
		raf.writeDouble(salary);
	}

	void setAge(byte age) { this.age = age; }
	byte getAge( ) { return age; }
	void setAddress(String address) { this.address = address; }
	String getAddress( ) { return address; }
	void setName(String name) { this.name = name; }
	String getName( ) { return name; }
	void setSalary(double salary) { this.salary = salary; }
	double getSalary( ) { return salary; }
	int size( ) { return 2 * (15 + 20) + (1 + 8); }
}