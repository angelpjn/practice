public class Break {
	public static void main(String[] args) {
		int x = 8;
		while (x < 20) {
			System.out.print("x = " + x++ + " , ");
			if (x > 10)
				break; // while ¹®À» ¹þ¾î³²
		}
		System.out.println();
	}
}