import java.util.Arrays;

public class ArraycopyEx {
	public static void main(String[ ] args) {
		char[ ] copyFrom = { 'c', 'a', 'n', 'd', 'o' };
		char[ ] copyTo = new char[5];

		System.arraycopy(copyFrom, 0, copyTo, 0, 3); // 부분 복사
		System.out.println(new String(copyTo)); // copyTo[ ] 요소 출력
		System.out.println("copyTo 요소: " + Arrays.toString(copyTo));

		for (char e : copyTo) { // copyTo[ ] 요소 출력
			System.out.println(e);
		}
	}
}