public class ArrayEx1 {
	public static void main(String[ ] args) {
		int[ ] a = new int[ ] { 5, 8, 7, 6, 9 }; // 초기화

		for (int i = 0; i < a.length; i++) { // a 배열의 크기만큼 루프 처리
			System.out.print("a[" + i + "] = " + a[i] + ", ");
		}
		System.out.println( );

		for (int d : a) { // for ~ each 문(foreach 문)
			System.out.print(d + ", ");
		}
		System.out.println( );
	}
}