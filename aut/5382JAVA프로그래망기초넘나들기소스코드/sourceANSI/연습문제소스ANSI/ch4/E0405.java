import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E03405 {
	public static void main(String[ ] args) {
		String[ ] strs = { "Java", "I can do it.", "��ſ��� ���� �̷��� �ִ�." };

		List<String> list = new ArrayList(Arrays.asList(strs));
		System.out.println("ArrayList ���:" + list);
	}
}