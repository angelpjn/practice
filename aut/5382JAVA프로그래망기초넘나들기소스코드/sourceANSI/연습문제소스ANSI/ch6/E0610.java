interface Site {
	public void buy( );
}

class Handphone implements Site {
	public void buy( ) {
		System.out.println("핸드폰을 사다.");
	}
}

class Student implements Site {
	public void buy( ) {
		System.out.println("학생이 핸드폰을 사다.");
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