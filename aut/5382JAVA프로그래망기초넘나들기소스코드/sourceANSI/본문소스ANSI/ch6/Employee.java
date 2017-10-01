abstract class Person { // �߻� Ŭ����
	private String name;

	public Person(String nm) {
		this.name = nm;
	}

	public abstract void info( ); // �߻� �޼���(���� ��ü { } ���� ����

	@Override 	// ���� Ŭ������ �������� ���� �޼��带 �������̵��� ����
	public String toString( ) {  // �� �޼���� Ŭ���� ��� ��� ���� �������̵�
		return "�̸�= " + this.name;
	}
}

public class Employee extends Person { // Person ���
	private int empId;

	public Employee(String nm, int id) {
		super(nm);
		this.empId = id;
	}

	@Override
	public void info( ) {  // �߻� �޼���� �������̵��Ͽ� �����ؾ� ��
		System.out.println(" -- ���� �Ի��� ���Ի��!");
	}

	@Override
	public String toString( ) { // �� �޼���� Ŭ���� ��� ��� ���� �������̵�
		return super.toString( ) + ":: ���= " + empId;
	}

	public static void main(String args[ ]) { // coding in terms of abstract
		Person hong = new Employee("ȫ �浿", 20300001);
		System.out.println(hong);  // hong.toString( )�� ����, toString( ) ȣ��
		hong.info( );
	}
}