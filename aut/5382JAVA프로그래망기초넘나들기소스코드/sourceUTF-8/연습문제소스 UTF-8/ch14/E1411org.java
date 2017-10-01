import java.io.*;

public class E1411 {
	public static void main(String[ ] args) {
		String filename = "c:/work/java/test.out";
		RandomAccessFile raf = null;

		try {
			System.out.println("[임의 파일 내용]");
			raf = new RandomAccessFile(filename, "r");
			long fileLength = raf.length( ); // 파일 길이
			int pos = (int) raf.getFilePointer( ); // 파일포인터 위치

			raf.seek(pos); // 파일의 처음 위치
			byte[ ] data = new byte[(int) fileLength]; // 데이터 보관용
			int i = 0, byteread = 0;

			while ((byteread = raf.read( )) != -1) { // 처음부터 끝까지
				data[i] = (byte) byteread; // 랜덤파일에서 읽은 데이터 보관
				i++; // 다음 위치로
			}

			for (i = 0; i < data.length; i++) {
				System.out.print(data[i] + " "); // 화면에 출력
			}			
			System.out.println( );
			raf.close( );

		} catch (IOException e) {
			e.printStackTrace( );
		}
	}
}