import java.io.*;
public class E1407 {
	public static void main(String[ ] args) {
		RandomAccessFile rf;
		long pos = 0;

		try {
			rf = new RandomAccessFile("c:/work/java/base.txt", "r");
			pos = readLines(rf);
			rf.close( );

			rf = new RandomAccessFile("c:/work/java/base.txt", "r");
			rf.seek(pos);
			pos = readLines(rf);
		} catch (Exception e) {
			System.out.println(e.toString( ));
		}
	}

	private static long readLines(RandomAccessFile rf) throws IOException {
		long recordnum = 1;
		String temp;
		while ((temp = rf.readLine( )) != null) {
			System.out.println("Line " + recordnum + " : " + temp);
			if (((++recordnum) % 20) == 0) {
				break;
			}
		}
		return rf.getFilePointer( );
	}
}