package readInTurn5.nonEx;

class Fruit {
	protected String name;
	
	protected Fruit() {
		this.name = "뭐로 할까";
		System.out.println("과일");
	}
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public void fruiter() {
		System.out.println("과수" + ", " + name);
	}
}

class Apple extends Fruit {
	private String flavor;
	
	public Apple(String name, String flavor) {
		super(name);
		this.flavor = flavor;
	}
	
	public void fruiter() {
		System.out.println("사과 나무");
	}
	
	public String toString() {
		return ("이름 : " + name + "맛 : " + flavor);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		Fruit f2 = new Fruit("과일 나무");
		
		f.fruiter();
		System.out.println("---------------");
		
		f2.fruiter();
		System.out.println("---------------");

		
		Apple a = new Apple("사과 : 홍옥 =>", " 상큼한 맛");
		a.fruiter();
		System.out.println("---------------");
		System.out.println(a);
		
	}

}
