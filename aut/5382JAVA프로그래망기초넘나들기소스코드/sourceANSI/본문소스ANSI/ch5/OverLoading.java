public class OverLoading {
	int age;

	public OverLoading(int age) {
		System.out.println("������ : " + age);
		this.age = age;
	}

	public void info(int a, int b) {
		System.out.println(a + b);
	}

	public void info(double a, int b) {
		System.out.println(a + b);
	}

	public void info(String s) {
		System.out.println(s + " ���ڿ�: " + s);
	}

	public static void main(String[ ] args) {
		OverLoading s = new OverLoading(20);
		s.info(3, 5); // info(int a, int b) ȣ��
		s.info("Love"); // info(String s) ȣ��
		s.info(2.3, 6); // info(double a, int b) ȣ��
	}
}