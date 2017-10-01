package sec01.exam01__inheritance;

public class Fruit {
	protected String name; // 서브 클래스에서 접근 허용

	protected Fruit() {
		System.out.println("과일");
	}

	public Fruit(String name) {
		this.name = name;
	}

	public void fruiter() {
		System.out.println("과수");
	}
}
