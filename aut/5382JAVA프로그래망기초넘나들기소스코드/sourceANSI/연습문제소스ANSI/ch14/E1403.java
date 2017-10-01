import java.io.*;
import java.util.*;
public class E1403 {
	public static void main(String[ ] args) {
		BufferedReader br = null;
		String src = "";
		Scanner in = new Scanner(System.in);
		System.out.print("파일 이름 입력: ");
		src = in.nextLine( );

		try {
			br = new BufferedReader(new FileReader(src));
			String content; // 각 줄의 내용
			int count = 1; // 시작 줄 번호
			while (true) {
				content = br.readLine( );
				if (content == null) {
					break;
				}
				System.out.printf("%5d", count++); // 행 번호 출력
				System.out.println(":" + content); // 소스 한행 출력
			}
			if (br != null)
				br.close( );
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없네");
		} catch (IOException e) {
			System.out.println("입출력 오류 발생!");
		}
	}
}