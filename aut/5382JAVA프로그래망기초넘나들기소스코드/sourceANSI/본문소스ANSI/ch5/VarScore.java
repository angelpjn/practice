public class VarScore {
	int varReturn(int a) { // a는 varReturn 메서드에서만 유료
		a++; // a의 값을 1 증가
		return a;
	}

	public static void main(String[ ] args) {
		int a = 1; // 메서드 내에서 선언한 변수는 이 메서드 안에서 유효
		VarScore obj = new VarScore( );

		obj.varReturn(a); // 인수 a와 varReturn 메서드의 a는 다름
		System.out.println(a);

		a = obj.varReturn(a); // varReturn 메서드 결과 값을 대입
		System.out.println(a);
	}
}