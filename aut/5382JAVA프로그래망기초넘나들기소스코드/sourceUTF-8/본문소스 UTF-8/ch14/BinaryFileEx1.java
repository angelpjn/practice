import java.io.*;

public class BinaryFileEx1 {
	public static void main(String[ ] args) {
		byte b[ ] = { 3, 5, 7, 9, 1 };
		try {
			String filename = "c:/work/java/test.out";
			FileOutputStream out = new FileOutputStream(filename);

			for (byte i = 0; i < b.length; i++) {
				out.write(b[i]);
			}
			out.close( );
		} catch (IOException ie) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}