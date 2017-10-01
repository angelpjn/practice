import java.io.*;

// 바이트 단위로 불러와서 출력하므로 한글은 깨져서 출력   
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