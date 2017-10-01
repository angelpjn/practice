import java.io.*;

public class E1411 {
	public static void main(String[ ] args) {
		try {
			File file = new File("c:/work/java/RandomAccessFileEx1.out");
			File file2 = new File("c:/work/java/RandomAccessFileCopy.out");

			if (!file.exists( ) || !file.isFile( )) {
				System.out.println("File does not exist");
				file.exists( );
			}

			file.delete( );
			RandomAccessFile raf = new RandomAccessFile(file, "rw");

			int vi = 77;
			long pos;
			double vd = 123.45;
			String data = "I can do it.";

			String[ ] temp = new String[(int) raf.length( )];
			byte[ ] b = new byte[(int) raf.length( )];

			raf.seek(0); // 파일 첫 위치
			raf.writeInt(vi);
			raf.writeDouble(vd);
			raf.writeUTF(data);

			System.out.println("[#1 파일 데이터]");
			raf.seek(0); // 파일 첫 위치
			while (raf.getFilePointer( ) < raf.length( )) {
				System.out.println(raf.readLine( )); // record 단위로 읽어서 출력
			}
			raf.seek(0); // 파일 첫 위치
			while (raf.getFilePointer( ) < raf.length( )) {
				System.out.println(raf.readInt( )); // int
				System.out.println(raf.readDouble( )); // double
				System.out.println(raf.readUTF( )); // String
			}
			// 파일 복사
			System.out.println("복사 시작....");
			raf.seek(0); // 파일시작
			RandomAccessFile fileCopy = new RandomAccessFile(file2, "rw");

			int len = (int) raf.length( ); // 파일 길이 가져오기
			byte[ ] byteCopy = new byte[len]; // 파일 길이 바이트 배열 만들기

			raf.readFully(byteCopy); // 원본 파일 내용을 읽은 배열 중
			fileCopy.write(byteCopy); // 복사본 파일에 기록
			System.out.println("복사 완료.....");

		} catch (IOException e) {
			e.printStackTrace( );
		}
	}
}