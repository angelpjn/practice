import java.io.*;
public class E0302 {
public static void main(String[] args) throws NumberFormatException,IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                          
	int data = 0;

	System.out.print("���� �Է� : ");
        data = Integer.parseInt(br.readLine());
	if (data % 3 == 0)
		System.out.println("3�� ���");
	else
		System.out.println("3�� ����� �ƴ�.");
	}
}