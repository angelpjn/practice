import java.io.*;
public class E1401 {
   public static void main(String[ ] args) {
	BufferedReader br = null;
	char buf[ ] = new char[256];
	try {
		br = new BufferedReader(new FileReader("c:\\work\\java\\base.txt"),
				buf.length);
		int numRead = 1; // 첫번째 while문 반복을 위한 값
		while (numRead > 0) {
			numRead = br.read(buf, 0, buf.length);
			if (numRead > 0) {
				String str = new String(buf, 0, numRead); // 문자 배열로 
				System.out.print(str.toLowerCase( )); // 소문자 변환 후
			}
		}
		if (br != null)
			br.close( );
	} catch (FileNotFoundException e) {
		System.out.println("파일이 없네!");
	} catch (IOException e) {
		System.out.println("입출력 오류가 발생!");
	}
   }
}