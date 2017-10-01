import java.io.*;

public class BinaryFileEx2 {
	public static void main(String[ ] args) {
		byte b[ ] = new byte[5];
		try {
			String filename = "c:/work/java/test.out";
			FileInputStream fin = new FileInputStream(filename);
			InputStreamReader in = new InputStreamReader(fin);
			int n = 0, ch;
			while ((ch = in.read( )) != -1) {
				b[n] = (byte) ch;
				n++;
			}
	
			for (byte i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println( );
			in.close( );

		} catch (IOException ie) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}