import java.io.*;

// ����Ʈ ������ �ҷ��ͼ� ����ϹǷ� �ѱ��� ������ ���   
public class E1405 {
    public static void main(String args[ ]) throws IOException {
	try {
	    FileInputStream fis = new FileInputStream("c:/work/java/base.txt");
	    FileOutputStream fos = new FileOutputStream(
				"c:/work/java/baseout.txt");
           int data = 0;
	     while ((data = fis.read( )) != -1) {
		System.out.print((char) data);
		fos.write(data);
	     }
		fis.close( );
		fos.close( );
	     } catch (IOException e) {
		e.printStackTrace( );
	    }
	}
}