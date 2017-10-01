import java.util.Arrays;

public class ArrayInit {
	public static void main(String[ ] args) {
		int[ ] numbers = { 5, 2, 8, 3, 9 };  // 초기화
		int sum = 0;
		double average;
		for (int e : numbers)  // 개선된 for문, numbers 배열 모든 요소 가져오기
			sum += e;       // 총계
		average = sum / numbers.length;  // 평균, length에 의해 요소 개수 얻기

		System.out.println("요소: " + Arrays.toString(numbers));
		String grade = String.format("%.2f", average);  // 소수점 2차리 까지  
		System.out.println("총점: " + sum + " / " + grade);
	}
}