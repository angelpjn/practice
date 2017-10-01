class Dog {
	private String name = ""; // 이름
	private String breed = ""; // 품종
	private int age = 0; // 나이

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString( ) {
		return "이름: " + name + ", 품종: " + breed + ", 나이: " + age;
	}
}

public class E0508 {
	public static void main(String[ ] args) {
		Dog d = new Dog("hani", "푸들", 3);
		System.out.println(d);
	}
}