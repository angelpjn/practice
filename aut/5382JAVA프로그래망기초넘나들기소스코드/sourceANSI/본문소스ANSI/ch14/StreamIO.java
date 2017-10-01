import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamIO {
	public static void main(String[ ] args) {
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		try {
			isr = new InputStreamReader(System.in); // 문자-> 문자 스트림
			osw = new OutputStreamWriter(System.out); // 문자-> 바이트 스트림

			char[ ] buffer = new char[256];
			int readcount = 0;
			System.out.println("키보드에서 데이터를 입력하세요...");
			while ((readcount = isr.read(buffer)) != -1) {
				osw.write(buffer, 0, readcount); // 콘솔에 읽은 문자 하나씩 출력
			}
		} catch (IOException e) {
			e.printStackTrace( );
		} finally {
			try {
				isr.close( );
				osw.close( );
			} catch (IOException e) {
			}
		}
	}
}