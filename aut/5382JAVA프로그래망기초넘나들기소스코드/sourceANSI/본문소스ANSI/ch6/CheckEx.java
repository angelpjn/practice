class Fruit { }
class Apple extends Fruit { }

public class CheckEx {
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