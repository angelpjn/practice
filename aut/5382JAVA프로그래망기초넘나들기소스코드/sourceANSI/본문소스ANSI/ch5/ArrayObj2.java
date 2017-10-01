class ObjectArray {
	private int[ ] prices; // 배열로 선언한 필드(멤버 변수)

	public int[ ] InitInfo( ) {
		prices = new int[ ] { 3, 5, -7 }; // 반드시 초기화
		return prices;
	}	
}

public class ArrayObj2 {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( );
		int[ ] ar = new int[4];

		ar = obj.InitInfo( );
		for (int e : ar) {
			System.out.println(e);
		}
	}
}