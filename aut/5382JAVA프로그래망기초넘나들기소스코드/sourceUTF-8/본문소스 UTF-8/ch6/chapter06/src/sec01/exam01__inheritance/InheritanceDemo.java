package sec01.exam01__inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		Fruit f = new Fruit("과일 나무");
		f.fruiter();

		Apple a = new Apple("사과:홍옥", "상큼한 맛");
		a.fruiter();
		System.out.println(a); // toString() 호출하여
		f = (Fruit) a; // upcasting, (Fruit)를 생략해도 동일
		a = (Apple) f; // downcasting
		System.out.println(a); // toString() 호출하여

		boolean x = f instanceof Fruit; // returns true
		boolean y = f instanceof Apple; // returns true
		boolean t = f.getClass().equals(Fruit.class); // False
		boolean z = f.getClass().equals(Apple.class); // True
		System.out.println("x = " + x + " , y = " + y);
		System.out.println("t = " + t + " , z = " + z);

		if (f instanceof Fruit)
			System.out.println("Fruit 타입: true");
		else if (f instanceof Apple)
			System.out.println("Apple 타입:true");

		Apple c = (f instanceof Apple) ? (Apple) f : null;
	}
}
