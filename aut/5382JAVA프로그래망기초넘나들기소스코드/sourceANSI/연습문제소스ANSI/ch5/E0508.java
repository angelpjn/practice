class Dog {
	private String name = ""; // �̸�
	private String breed = ""; // ǰ��
	private int age = 0; // ����

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString( ) {
		return "�̸�: " + name + ", ǰ��: " + breed + ", ����: " + age;
	}
}

public class E0508 {
	public static void main(String[ ] args) {
		Dog d = new Dog("hani", "Ǫ��", 3);
		System.out.println(d);
	}
}