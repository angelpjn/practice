import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String args[ ]) {
		ArrayList<String> arrayList = new ArrayList<String>( );

		arrayList.add("Java"); // ����Ʈ�� ���ڿ� "Ajeet" �߰�
		arrayList.add("Oracle");
		arrayList.add("sun");

		System.out.println("#1 ����Ʈ ���:" + arrayList); // ��� ��� ���

		arrayList.add(0, "DB"); // ù ��° ��ġ�� "Rahul" �߰�
		arrayList.add(1, "C++"); // 2��° ��ġ�� �߰�
		System.out.println("#2 ����Ʈ ���:" + arrayList); // ��� ��� ���

		Collections.sort(arrayList); // ����

		System.out.println("#3 ���� �� ����Ʈ ���: ");
		for (int i = 0; i < arrayList.size( ); i++)
			System.out.println(arrayList.get(i)); // i ��° ��� �о����
	}
}