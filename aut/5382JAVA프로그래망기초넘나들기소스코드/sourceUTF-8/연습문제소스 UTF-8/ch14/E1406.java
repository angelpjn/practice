import java.io.*;

// 문자기반 스트림을 사용하므로 한글도 깨지지 않음
public class Ex1406 {
	public static void main(String args[ ]) throws IOException {
	FileReader fr = new FileReader("c:/work/java/base.txt");	
      FileWriter fw = new FileWriter("c:/work/java/baseout.txt");
	int data = 0;
	while ((data = fr.read( )) != -1) {
		System.out.print((char) data);
		fw.write(data);
	}
		fr.close( );
		fw.close( );
	}
}