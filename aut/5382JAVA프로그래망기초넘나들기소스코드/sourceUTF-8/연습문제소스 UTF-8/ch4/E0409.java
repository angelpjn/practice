public class E0409 {
	public static void main(String[ ] args) {
		int max = 20;
		int min = 5;
		int[ ][ ] na = new int[3][4];

		// java.lang.Math 클래스의 random 메서드 사용
		System.out.println("[#1 [5 10] 범위의 난수 발생");
		for (int i = 0; i < na.length; i++) {
			for (int j = 0; j < na[i].length; j++) {
				na[i][j] = (int) (Math.random( ) * (max - min + 1) + min);
				System.out.print(na[i][j] + "\t");
			}
			System.out.println( );
		}
	}
}