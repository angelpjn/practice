import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {
	public static void main(String[ ] args) {
		int[ ] numbers = new int[5]; // 5개 요소를 저장할 수 있는 배열 생성
		int sum = 0;
		double average;

		Scanner scan = new Scanner(System.in); // 키보드에서 입력할 준비

		System.out.print("정수 입력: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt( ); // 정수 입력하여 배열에 저장
		}

		for (int e : numbers)
			sum += e; // 총계
		average = sum / numbers.length; // 평균

		System.out.println("요소: " + Arrays.toString(numbers)); // 요소리스트
		String grade = String.format("%.2f", average); // 소수점 이하 2자리
		System.out.println("총점: " + sum + " / " + grade);
	}
}