package sec01.exam01__inheritance;


public class Apple extends Fruit {
	private String flavor;

	public Apple(String name, String flavor) {
		super(name); // 슈퍼 클래스의 생성자 Fruit(String name)호출
		this.flavor = flavor;
	}

	public void fruiter() {
		System.out.println("사과 나무");
	}

	public String toString() { // toString 오버라이드: 객체 출력용
		return ("name = " + name + " 맛: " + flavor);
	}
}
