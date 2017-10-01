public class E0309 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 0;

		while (x <= 100) // 100이 될 때 까지 반복
		{
			sum += x; // 일반 덧셈 공식
			x++; // x = x + 1
		}
		System.out.println("1 + 2 + ... + 100 = " + sum);

	}
}