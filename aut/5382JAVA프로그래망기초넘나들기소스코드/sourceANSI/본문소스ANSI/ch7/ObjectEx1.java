import java.lang.reflect.Method;

public class ObjectEx1 {
	Object createNewInstanceOf(Object obj) throws InstantiationException,
			IllegalAccessException {
		return obj.getClass( ).newInstance( );
	}

	void PrintClassName(Object obj) {
		Class cls = obj.getClass( ); // ��ü�� ���ϴ� Ŭ���� ������ ����
		String ClassName = cls.getName( );
		System.out.println("��ü Ŭ���� �̸�= " + ClassName);
	}

	public String toString( ) {
		return "Overriding(������)";
	}

	public static void main(String[ ] args) throws ClassNotFoundException {

		Integer value1 = new Integer(88), value2 = new Integer(88);

		if (value1.equals(value2))
			System.out.println("��ü�� ����.");

		System.out.println(Thread.currentThread( ).toString( ));
		Class<?> cl = Class.forName("java.lang.String"); // Ŭ���� ���� ��� ���� ó��
		Method mtd[ ] = cl.getDeclaredMethods( ); // Ŭ������ ����� �޼��� ����
		for (int i = 0; i < mtd.length; i++) {
			System.out.println("Methods = " + mtd[i].toString( ));
		}
	}
}