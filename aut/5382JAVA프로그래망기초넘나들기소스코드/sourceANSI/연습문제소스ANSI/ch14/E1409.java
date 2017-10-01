import java.io.*;

public class E1409 {
	static final String filename = "C:/work/java/filekor.txt";
	static final String fileWrite = "C:/work/java/filekorwr.txt";
	private FileInputStream fis, in;
	public static void main(String[ ] args) {
	    try {				
		FileInputStream fis = new FileInputStream(new File(filename));
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String str = br.readLine( );
			if (str == null)
				break;
			System.out.println(str);
		}
			br.close( );
		} catch (FileNotFoundException e) {
			e.printStackTrace( );
		} catch (IOException e) {
			e.printStackTrace( );
		}
	}
}