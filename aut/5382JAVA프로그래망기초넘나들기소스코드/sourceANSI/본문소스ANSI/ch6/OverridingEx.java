class Fruit { }
class Apple extends Fruit { }

public class class Human { // 슈퍼 클래스, 부모 클래스, 상위 클래스
	public void move( ) {
		System.out.println("인간이 움직인다.");
	}
}

class Boy extends Human { // 서브 클래스, 자식 클래스, 하위 클래스
	public void move( ) {
		super.move( ); // 슈퍼 클래스 Human의 move( ) 호출
		System.out.println("소년이 움직인다.");
	}
}

public class OverridingEx {
	public static void main(String args[ ]) {
		Human a = new Human( ); // Human 객체 생성
		Human b = new Boy( ); // Boy 클래스 객체로 Human 객체 생성
		Boy c = new Boy( ); // Boy 객체 생성

		a.move( ); // Human 클래스의 move( ) 호출하여 실행
		b.move( ); // Boy 클래스의 move( ) 호출하여 실행
		c.move( ); // Boy 클래스의 move( ) 호출하여 실행
	}
} {
	public static void main(String[ ] args) {
		Fruit f = new Fruit( );
		Apple a = new Apple( );

		f = (Fruit) a; // upcasting, (Fruit)를 생략해도 묵시적으로 이뤄짐
		a = (Apple) f; // downcasting

		boolean x = f instanceof Fruit; // 결과: true, 
		boolean y = f instanceof Apple; // 결과: true
		boolean t = f.getClass( ).equals(Fruit.class); // False, 상속받지 않기 때문
		boolean z = f.getClass( ).equals(Apple.class); // True
		System.out.println("x = " + x + " , y = " + y);
		System.out.println("t = " + t + " , z = " + z);

		if (f instanceof Fruit) { // 타입 확인
			System.out.println("Fruit 타입");
		} else if (f instanceof Apple) {
			System.out.println("Apple 타입");
		}

		Apple c = (f instanceof Apple) ? (Apple) f : null;
	}
}