class ObjectArray {
	private int[ ] prices; // 배열로 선언한 필드(멤버 변수)

	public ObjectArray( ) {
		prices = new int[3];  // 3개의 요소를 넣을 수 있는 객체 배열 생성

		prices[0] = 88;  // 필드 값 대입
		prices[1] = 33;
		prices[2] = 5;
	}

	public void showInfo( ) {
		System.out.println(prices[0] + ", " + prices[1] + ", " + prices[2]);
	}
}

public class ArrayObj {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( ); // 객체 생성한 후

		obj.showInfo( );  // 메서드 호출
	}
}