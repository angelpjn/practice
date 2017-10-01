import java.io.*;

public class TextFileEx1 {
	public static void main(String[ ] args) {
		String fileName = "C:\\work\\java\\text1.txt";
		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(fileName));
			file.write("I can do it.");
         file.flush( );
			file.close( );
		} catch (Exception e) {
			System.out.println("파일 생성 오류");
		}
	}
}