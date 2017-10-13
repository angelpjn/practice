package readInTurn5.nonEx;

class Fruit2 {}
class Apple2 extends Fruit2 {}

public class CheckEx {
	public static void main(String[] args) {
		Fruit2 f = new Fruit2();
		Apple2 a = new Apple2();
		
		f = (Fruit2) a;
		a = (Apple2) f;
		
		boolean x = f instanceof Fruit2;
		boolean y = f instanceof Apple2;
		boolean t = f.getClass().equals(Fruit2.class);
		boolean z = f.getClass().equals(Apple2.class);
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("t = " + t + ", z = " + z);
		
		if ( f instanceof Fruit2) {
			System.out.println("Fruit 타입");
		} else if (f instanceof Apple2) {
			System.out.println("Apple2 타입");
		}
		
		Apple2 c = (f instanceof Apple2) ? (Apple2) f :null;
	}
}