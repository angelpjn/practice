import java.io.IOException;

public class ConsoleInput {
	// throws IOException 는 System.in.read( ) 사용시 오류 발생 처리 용도
	public static void main(String[ ] args) throws IOException {

		System.out.println(" 하나의 문지를 입력: ");
		int vi = System.in.read( ); // 아스키 코드로 변환하여 저장
		System.in.skip(2); // <엔터 '\r\n'>가 버퍼에 남아있기에 2 문자 삭제

		System.out.println(" 하나의 문지를 입력: ");
		int input = System.in.read( ); // 정상적으로 다음 한 글자 입력
		System.in.skip(2); // <엔터 '\r\n'>가 버퍼에 남아있기에 2 문자 삭제

		System.out.println(" 하나의 문지를 입력: ");
		int input2 = System.in.read( ); // 정상적으로 다음 한 글자 입력

		System.out.print(vi + " "); // 모든 문자를 아스키 코드로 처리
		System.out.println((char) vi); // 원래 입력한 문자로 변환하여 출력
		System.out.println((char) input); // 원래 입력한 문자로 변환하여 출력
		System.out.println((char) input2); // 원래 입력한 문자로 변환하여 출력
	}
}