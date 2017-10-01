import java.lang.reflect.Method;

public class ObjectEx1 {
	Object createNewInstanceOf(Object obj) throws InstantiationException,
			IllegalAccessException {
		return obj.getClass( ).newInstance( );
	}

	void PrintClassName(Object obj) {
		Class cls = obj.getClass( ); // 객체가 속하는 클래스 정보를 리턴
		String ClassName = cls.getName( );
		System.out.println("객체 클래스 이름= " + ClassName);
	}

	public String toString( ) {
		return "Overriding(재정의)";
	}

	public static void main(String[ ] args) throws ClassNotFoundException {

		Integer value1 = new Integer(88), value2 = new Integer(88);

		if (value1.equals(value2))
			System.out.println("객체가 같다.");

		System.out.println(Thread.currentThread( ).toString( ));
		Class<?> cl = Class.forName("java.lang.String"); // 클래스 정보 얻어 변수 처리
		Method mtd[ ] = cl.getDeclaredMethods( ); // 클래스에 선언된 메서드 정보
		for (int i = 0; i < mtd.length; i++) {
			System.out.println("Methods = " + mtd[i].toString( ));
		}
	}
}