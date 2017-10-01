interface Fruit {
	public boolean hasPeel( ); // 반드시 서브 클래스에서 구현해야 함
}

interface Vegetable {
	public boolean isVegetable( ); // 반드시 서브 클래스에서 구현해야 함
}

public class Tomato implements Fruit, Vegetable {  // implements로 구현
	boolean peel = false;
	boolean vegetable = false;

	public Tomato( ) {  } // 기본 생성자, 빈 내용으로 구현	
	public boolean hasPeel( ) { // 인터페이스의 메서드 구현
		return peel;
	}interface Ia {
	public static final int c = 88; // public static final 생략 가능

	// 필드는 디폴트로 public abstract final 상수 선언
	public abstract void method( ); // 메서드 디폴트는 public abstract
}

interface Ib { // 추상 메서드는 모두 상속받는 곳에서 구현해야 함
	void method( ); // public abstract가 기본이므로 생략 가능
}

// 인터페이스 다중 상속은 extends를 사용하여 인터페이스는 ,로 구분
interface Ic extends Ia, Ib { // Ic는 Ia, Ib 상속받음
	public void method2( );
}

class B {
	public String method4( ) {
		String strB = "B의 method4";
		return strB;
	}

	public String toString( ) { return "B에서 오버라이딩한 메서드 구현"; }
}

class C extends B implements Ic {
	public void method( ) { }; // Ib의 모든 추상 메서드를 구현해야 됨
   // Ic의 모든 추상 메서드를 구현해야 됨
	public void method2( ) { System.out.println("C의 method2 구현");
	}
	public void method3( ) { };
	public void method5( ) { System.out.println("C의 method5 구현"); }
}

// 인터페이스 구현은 implements 를 사용하여 추상 메서드 구현
class A implements Ic {
	// 인터페이스를 상속받은 클래스에서는 상속받은
	// 인터페이스의 모든 메서드를 구현해야함
	public void method( ) { // Ib의 모든 추상 메서드를 구현해야 됨
		System.out.println("I can do it!");
	}

	public void method2( ) { }; // Ic의 모든 추상 메서드를 구현해야 됨
	public void method3( ) { }; // 기본은 public static 이므로 생략
}

public class InterfaceEx3 {
	public static void main(String[ ] args) {
		A obj = new A( );
		Ia ia = new C( );
	}
}
		return vegetable;
	}
	public static void main(String[ ] args) {
		Tomato tomato = new Tomato( );
		if (tomato.hasPeel( ))
			System.out.println("껍질을 벗기다.");
		else
			System.out.println("껍질을 안 벗기다.");
	}
}