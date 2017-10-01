import java.io.*;

public class TextFileEx2 {
	public static void main(String[ ] args) {
		String fileName = "C:\\work\\java\\text1.txt";
		BufferedReader bf;
		int ch;
		try {
			bf = new BufferedReader(new FileReader(fileName));
			while ((ch = bf.read( )) != -1) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char) ch); // 출력
			}       
			bf.close( );
		} catch (FileNotFoundException e1) {
			e1.printStackTrace( );
		} catch (Exception e) {
			System.out.println("파일 생성 오류");
		}
	}
}