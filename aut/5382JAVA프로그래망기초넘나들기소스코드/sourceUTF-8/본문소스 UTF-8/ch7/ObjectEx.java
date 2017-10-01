import java.util.Date;

final class A {
	private Date date = new Date( );
	String LF = System.getProperty("line.separator");

	@Override
	public String toString( ) {  // 객체를 문자열로 변환
		StringBuilder result = new StringBuilder( );

		result.append(this.getClass( ).getName( ) + " 객체" + LF);
		result.append("년도: " + date + LF);
		return result.toString( );
	}
}

public class ObjectEx {
	public static void main(String[ ] args) {
		A obj = new A( );
		System.out.println(obj); // obj.toString( ) 자동 호출
	}
}