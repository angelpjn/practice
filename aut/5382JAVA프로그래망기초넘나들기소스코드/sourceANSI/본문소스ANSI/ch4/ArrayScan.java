import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {
	public static void main(String[ ] args) {
		int[ ] numbers = new int[5]; // 5�� ��Ҹ� ������ �� �ִ� �迭 ����
		int sum = 0;
		double average;

		Scanner scan = new Scanner(System.in); // Ű���忡�� �Է��� �غ�

		System.out.print("���� �Է�: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt( ); // ���� �Է��Ͽ� �迭�� ����
		}

		for (int e : numbers)
			sum += e; // �Ѱ�
		average = sum / numbers.length; // ���

		System.out.println("���: " + Arrays.toString(numbers)); // ��Ҹ���Ʈ
		String grade = String.format("%.2f", average); // �Ҽ��� ���� 2�ڸ�
		System.out.println("����: " + sum + " / " + grade);
	}
}