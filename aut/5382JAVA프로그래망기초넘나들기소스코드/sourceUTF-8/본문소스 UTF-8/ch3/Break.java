public class Break {
	public static void main(String[] args) {
		int x = 8;
		while (x < 20) {
			System.out.print("x = " + x++ + " , ");
			if (x > 10)
				break; // while 문을 벗어남
		}
		System.out.println();
	}
}