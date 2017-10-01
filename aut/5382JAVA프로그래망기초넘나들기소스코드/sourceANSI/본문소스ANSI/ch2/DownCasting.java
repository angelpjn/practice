public class DownCasting {
	public static void main(String[ ] args) {

		int n = 815; // 숫자 + 문자열 은 모두 문자열로 변환됨
		String str = n + " can"; // 숫자와 문자열을 합치면 모두 문자열이 됨
		System.out.println(str); // 문자열화된 "815 can"이 출력

		int x = 123;
		String s = String.valueOf(x); // 숫자를 문자열로 바꾸기, 방법1
		String s1 = Integer.toString(x); // int 형 숫자를 문자열로 바꾸기, 방법2

		double d = 567.89;
		String s2 = Double.toString(d); // double 형 숫자를 문자열로 바꾸기

		long lo = 479876543210L; // long 형 값은 값뒤에 L를 붙여서 표기해야 함
		String s3 = Long.toString(lo);
		System.out.println(s + "\t" + s1 + "\t" + s2 + "\t" + s3);

		float f2 = 8.15f; // float 형 값은 값뒤에 f를 붙여서 표기해야 함
		int i2 = (int) f2; // 이 문장에서만 float 형을 int 형으로 변환
		double d2 = (double) i2; // 이 문장에서만 float 형을double 형으로 변환
		System.out.println(f2 + "\t" + i2 + "\t" + d2);

		String str4 = "1225"; // 문자열 1225
		int y = Integer.valueOf(str4).intValue( ); // 문자열을 숫자로 바꾸기
		int z = Integer.parseInt(str4);
		long lo2 = Long.parseLong(str4); // 문자열을 long 형 숫자로 바꾸기
		float f = Float.parseFloat(str4); // 문자열을 float 형 숫자로 바꾸기
		double d3 = Double.valueOf(str4).doubleValue( );
		System.out.println(y + "\t" + z + "\t" + lo2 + "\t" + f + "\t" + d3);
	}
}