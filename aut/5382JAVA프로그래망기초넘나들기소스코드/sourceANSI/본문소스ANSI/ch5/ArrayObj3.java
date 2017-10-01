class ObjectArray {
	private int[ ] prices; // 배열로 선언한 필드(멤버 변수)

	// 매개변수의 타입 int[ ] 은 객체 배열
	public void showInfo(int[ ] prices) {
		System.out.println(prices[0] + ", " + prices[1] + ", " + prices[2]);
	}
}

public class ArrayObj3 {
	public static void main(String[ ] args) {
		int prices[ ] = new int[ ] { 3, 5, -7 }; // 객체 배열 초기화
		ObjectArray obj = new ObjectArray( ); // 객체 생성

		obj.showInfo(prices); // 인수로 객체 배열 전달, 이 때 객체명을 사용함
	}
}