class Fruit {  // 슈퍼(부모, 상위) 클래스
	protected String name; // 서브 클래스에서 접근 허용

	public void fruiter( ) {
		System.out.println("과일 나무");
	}
}

class Apple extends Fruit {  // 서브(자식, 하위) 클래스
	private String flavor;

	public String getFlavor( ) {
		return flavor;
	}

	void setFlavor(String flavor) {
		this.flavor = flavor;
	}
}

public class InheritanceDemo {
	public static void main(String[ ] args) {
		Fruit f = new Fruit( );  // 슈퍼 클래스 객체
		f.fruiter( ); // 슈퍼 클래스에 있는 메서드 호출

		Apple a = new Apple( ); // 서브 클래스 객체
		a.setFlavor("sweet"); // 서브 클래스에 있는 메서드 호출
		System.out.println("사과 맛: " + a.getFlavor( ));
	}
}