import java.util.Arrays;

public class ArrayInit {
	public static void main(String[ ] args) {
		int[ ] numbers = { 5, 2, 8, 3, 9 };  // �ʱ�ȭ
		int sum = 0;
		double average;
		for (int e : numbers)  // ������ for��, numbers �迭 ��� ��� ��������
			sum += e;       // �Ѱ�
		average = sum / numbers.length;  // ���, length�� ���� ��� ���� ���

		System.out.println("���: " + Arrays.toString(numbers));
		String grade = String.format("%.2f", average);  // �Ҽ��� 2���� ����  
		System.out.println("����: " + sum + " / " + grade);
	}
}