import java.io.*;
public class E0210 {
  public static void main(String[ ] args) throws NumberFormatException,IOException {
	BufferedReader br = new BufferedReader(new 
                                  InputStreamReader(System.in));

	int diff;
	char large; // 대문자
	char small; // 소문자
	System.out.print("알파벳 대문자를 입력 : ");
	large = (char) System.in.read( );
	br.readLine( );
	diff = 'a' - 'A'; // 'A' 와 'a'의 문자 사이의 ASCII 코드 차이
	small = (char) (large + diff); // 소문자로 변환
	System.out.println(large + " 소문자 변환 : " + small);
	}
}