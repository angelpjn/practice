public class E0401 {
	public static void main(String[ ] args) {
		double na[ ] = { 4.14, 5.25, 8.92, 4.26, 7.32 };
		for (int i = 0; i < na.length; i++) { // a 배열의 크기만큼 루프 처리
			System.out.print("a[" + i + "] = " + na[i] + ", ");
		}
		System.out.println( );

		for (double d : na) { // for ~ each 문, 처음부터 끝까지 루프 반복
			System.out.print(d + ", ");
		}
		System.out.println( );
	}
}