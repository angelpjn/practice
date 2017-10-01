public class E0406 {
	public static void main(String[ ] args) {
		int[ ] copyFrom = { 2, 5, 9, 3, 1 };
		int[ ] copyTo = new int[5];

		System.arraycopy(copyFrom, 0, copyTo, 0, 3);
		for (int e : copyTo) { // copyTo[ ] 요소 출력
			System.out.println(e);
		}
	}
}