import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

public class WildcardsEx {
	B b = new B( );
	A a = b;
	List<B> lb = new ArrayList<>( );
	List<A> la = lb; // ������ ����, A�� B�� ��Ӱ��谡 ���� ����
	List<? extends Double> list = new ArrayList<>( );
	List<? extends Number> list2 = list; // OK, ����Ÿ�� �����Ǳ� ����

	List<? super Double> list3 = new ArrayList<>( );
	List<? super Number> list4 = list3; // ������ ����, ����Ÿ�� �����ȵ�
}