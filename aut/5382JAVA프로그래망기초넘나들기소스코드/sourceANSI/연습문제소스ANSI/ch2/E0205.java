import java.io.*;
public class E0205 {
	public static void main(String[ ] args) {
		BufferedReader br = new BufferedReader(new 
                        InputStreamReader(System.in));
		int data = 0;
		String str;

		System.out.print("������ ���� �Է� : ");
		try {
			data = Integer.parseInt(br.readLine( ));
		} catch (NumberFormatException e) {
			e.printStackTrace( );
		} catch (IOException e) {
			e.printStackTrace( );
		}

		str = ((data > 0) ? ((data == 0) ? "0" : "���") : "����");
		System.out.print(data + " : " + str);
		System.out.println( );
	}
}