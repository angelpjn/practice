import java.util.Vector;

public class VectorEx2 extends Vector { // Vector 상속
	public VectorEx2(int typeNumber) { // 저장할 데이터 타입 개수
		super(typeNumber);
	}

	public static void main(String[ ] args) {
		VectorEx2 v = new VectorEx2(3); // 3가지 다른 데이터 타입

		System.out.println("v의 용량은 " + v.capacity( ));

		v.addElement(new Integer(88)); // 정수 88 삽입
		v.addElement(new Double(12.25)); // 실수 12.35 삽입
		v.addElement(new String("자바")); // 문자열 "자바" 삽입

		System.out.println("요소 총개수 : " + v.elementCount);
		// 모든 요소 출력
		for (int i = 0; i < v.size( ); i++) {
			System.out.println(v.get(i));
		}

		if (v.contains("자바")) { // 포함여부 확인
			System.out.println("인덱스 위치 : " + v.indexOf("자바"));
		}

		System.out.println("1번째 인덱스의 요소: " + v.elementAt(1));
	}
}