import java.util.Vector;

public class VectorEx {
	public static void main(String[ ] args) {
		Vector<Integer> v = new Vector<Integer>( ); // Integer만 가능

		System.out.println("vector 내의 요소 객체 수) : " + v.size( ));
		System.out.println("vector의 기본 용량 : " + v.capacity( ));

		v.addElement(33); // 정수 33 삽입
		v.addElement(7788);
		v.addElement(12);

		System.out.println("vector 내의 요소 객체 수) : " + v.size( ));
		System.out.println("vector의 용량 : " + v.capacity( ));

		// 모든 요소 출력
		for (int i = 0; i < v.size( ); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("vector의 첫번째 요소 : " + v.elementAt(0));
	}
}