import java.util.*;

public class VectorEx {
	public static void main(String[ ] args) {
		Vector v[ ] = new Vector[3]; // Vector 클래스배열 선언

		v[0] = new Vector( ); // 객체생성
		v[1] = new Vector(5); // 공간 개수 capacity( )값은 5
		v[2] = new Vector(5, 2); // 공간 개수 5, 새로운 객체가 추가시 2씩 늘어남

		for (int i = 0; i < v.length; i++) {
			System.out.println("벡터 V의 저장공간 개수 = " + v[i].capacity( ));
		}

		System.out.println( );

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				v[i].addElement(1234);
			}
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print("V[" + i + "]의 객체 수 = " + v[i].size( ));
			System.out.println(", 저장 공간 개수 = " + v[i].capacity( ));
		}

		Vector vc = new Vector( );
		vc.add(33);  vc.add(55); vc.add(88);
		vc.add(1, 99); // 위치 1에 99 삽입하고 한 칸씩 뒤로 이동함
		System.out.println("벡터 vc의 요소 개수 = " + vc.size( ));
		System.out.print("v[0] = " + vc.elementAt(0) + ", ");
		System.out.print("v[1] = " + vc.elementAt(1) + ", ");
		System.out.print("v[2] = " + vc.elementAt(2) + ", ");
		System.out.println("v[3] = " + vc.elementAt(3));

		vc.remove(0); // 위치 0의 값을 없애고 한 칸씩 땡겨 이동함
		vc.remove(1); // 위치 1의 값을 없애고 한 칸씩 땡겨 이동함

		for (int i = 0; i < vc.size( ); i++) {
			Integer result = (Integer) vc.elementAt(i);
			System.out.println("벡터 요소 : " + result);
		}
	}
}