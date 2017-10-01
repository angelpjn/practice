class GenericClass<T> {
	T t;

	GenericClass(T t) {
		this.t = t;
	}

	T getT( ) {
		return t;
	}

	void showList( ) {
		System.out.println("타입: " + t.getClass( ).getName( ));
	}
}

public class E0803 {
	public static void main(String[ ] args) {
		GenericClass<Integer> gi = new GenericClass<Integer>(35);
		gi.showList( );

		int v = gi.getT( ); // cast 없어도 자동 변환
		System.out.println("데이터: " + v);

		GenericClass<String> gs = new GenericClass<String>("Can");
		gs.showList( );

		String str = gs.getT( );
		System.out.println("데이터: " + str);
	}
}