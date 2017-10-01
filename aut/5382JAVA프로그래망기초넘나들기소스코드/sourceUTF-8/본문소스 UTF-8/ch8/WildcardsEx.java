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
	List<A> la = lb; // 컴파일 오류, A와 B는 상속관계가 없기 때문
	List<? extends Double> list = new ArrayList<>( );
	List<? extends Number> list2 = list; // OK, 서브타입 성립되기 때문

	List<? super Double> list3 = new ArrayList<>( );
	List<? super Number> list4 = list3; // 컴파일 오류, 서브타입 성립안됨
}