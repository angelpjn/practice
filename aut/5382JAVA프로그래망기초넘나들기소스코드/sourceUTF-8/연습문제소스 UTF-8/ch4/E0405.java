import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E03405 {
	public static void main(String[ ] args) {
		String[ ] strs = { "Java", "I can do it.", "당신에게 멋진 미래가 있다." };

		List<String> list = new ArrayList(Arrays.asList(strs));
		System.out.println("ArrayList 요소:" + list);
	}
}