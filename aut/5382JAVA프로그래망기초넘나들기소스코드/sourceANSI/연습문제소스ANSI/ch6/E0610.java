interface Site {
	public void buy( );
}

class Handphone implements Site {
	public void buy( ) {
		System.out.println("�ڵ����� ���.");
	}
}

class Student implements Site {
	public void buy( ) {
		System.out.println("�л��� �ڵ����� ���.");
	}
}

public class E0610 {
	public static void main(String[ ] args) {

		Site site = new Handphone( );
		site.buy( );

		Site site2 = new Student( );
		site2.buy( );
	}
}