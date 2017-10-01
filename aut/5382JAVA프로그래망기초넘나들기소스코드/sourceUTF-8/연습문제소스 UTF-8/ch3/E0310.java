public class E0310 {
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 0; x <= 100; x++) {
			sum += x; // 일반 덧셈 공식
		}
		System.out.println("1 + 2 + ... + 100 = " + sum);
	}
}