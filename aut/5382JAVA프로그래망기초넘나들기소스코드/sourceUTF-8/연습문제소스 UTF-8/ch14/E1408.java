import java.io.*;
public class Ex1408 {
	static final String filename = "C:/work/java/base.txt";

	public static void main(String[ ] args) {
		try {
		    RandomAccessFile raf = new RandomAccessFile(filename, "r");
			raf.seek(raf.length( )-1); //seek 위치 조정(파일 끝으로 이동)
			long pos = raf.getFilePointer( ); // 파일 위치 값 알아내기
			int  position = (int)pos;  
			System.out.println(pos);
			System.out.println(new String(readFromFile(filename, 0, position)));
			writeToFile(filename, "C:/work/java/basera", 20);
		} catch (IOException e) {
			e.printStackTrace( );
		}
	}

	private static byte[ ] readFromFile(String filePath, int position, int size)
			throws IOException {
		RandomAccessFile raf = new RandomAccessFile(filePath, "r");
		raf.seek(position);
		byte[ ] bytes = new byte[size];
		raf.read(bytes);
		raf.close( );
		return bytes;
	}

	private static void writeToFile(String filePath, String data, int position)
			throws IOException {
		RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
		raf.seek(position);
		raf.write(data.getBytes( ));
		raf.close( );
	}
}