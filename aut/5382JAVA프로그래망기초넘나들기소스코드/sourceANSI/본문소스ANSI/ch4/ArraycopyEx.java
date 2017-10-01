import java.util.Arrays;

public class ArraycopyEx {
	public static void main(String[ ] args) {
		char[ ] copyFrom = { 'c', 'a', 'n', 'd', 'o' };
		char[ ] copyTo = new char[5];

		System.arraycopy(copyFrom, 0, copyTo, 0, 3); // �κ� ����
		System.out.println(new String(copyTo)); // copyTo[ ] ��� ���
		System.out.println("copyTo ���: " + Arrays.toString(copyTo));

		for (char e : copyTo) { // copyTo[ ] ��� ���
			System.out.println(e);
		}
	}
}