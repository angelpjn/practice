class ClassName<T> {
	private T t;

	public T get( ) {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

public class GenericsEx {
	public static void main(String[ ] args) {
		ClassName<String> obj = new ClassName<>( ); // 생성자, 타입 인수 생략 가능
		obj.set("Pankaj"); // 유효, String 타입과 일치하기 때문
		// obj.set(88); // 컴파일 오류, String 타입과 불일치하기 때문
		ClassName obj2 = new ClassName( ); // 제네릭 적용하지 않은 경우
		obj2.set("Pankaj"); // 유효
		obj2.set(88); // 유효, autoboxing 적용
	}
}