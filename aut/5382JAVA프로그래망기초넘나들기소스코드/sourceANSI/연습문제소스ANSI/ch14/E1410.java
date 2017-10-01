import java.io.*;

public class E1410 {
	public static void main(String[ ] args) {
		String filename = "c:/work/java/test.out";
		RandomAccessFile raf = null;

		try {
			System.out.println("[���� ���� ����]");
			raf = new RandomAccessFile(filename, "r");
			long fileLength = raf.length( ); // ���� ����
			int pos = (int) raf.getFilePointer( ); // ���������� ��ġ

			raf.seek(pos); // ������ ó�� ��ġ
			byte[ ] data = new byte[(int) fileLength]; // ������ ������
			int i = 0, byteread = 0;

			while ((byteread = raf.read( )) != -1) { // ó������ ������
				data[i] = (byte) byteread; // �������Ͽ��� ���� ������ ����
				i++; // ���� ��ġ��
			}

			for (i = 0; i < data.length; i++) {
				System.out.print(data[i] + " "); // ȭ�鿡 ���
			}			
			System.out.println( );
			raf.close( );

		} catch (IOException e) {
			e.printStackTrace( );
		}
	}
}