public class BoxingUnBoxing {
	public static void main(String[ ] args) {
		Integer num = 88; // 자동박싱, int 88을 Integer로 변환
		// Integer val = new Integer(88); 와 동일
		int n = num; // 자동 언박싱, int x = val.intValue( ); 와 같음
		// 오토 박싱 : 스택 영역의 값을 힙 영역에 객체를 생성해서 넣음
		// 오토 언박싱 : 힙 영역에서 값을 꺼내 스택영역으로 복사함
		System.out.println(num + ", " + n);
	}
}