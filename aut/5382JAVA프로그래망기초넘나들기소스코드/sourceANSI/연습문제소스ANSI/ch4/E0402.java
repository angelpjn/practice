import java.util.Arrays;

public class E0402 {
	public static void main(String[ ] args) {

		String s = "�ູ����";
		int[ ] numbers = { 1, 2, 3, 4, 5 };
		String[ ] sArr = { "I", "can", "do" };

		Object[ ] seasonNums = { "��", "����", "����", "�ܿ�" };

		Object[ ] array = new Object[4];
		array[0] = s;
		array[1] = numbers;
		array[2] = sArr;
		array[3] = seasonNums;
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(array));
	}
}