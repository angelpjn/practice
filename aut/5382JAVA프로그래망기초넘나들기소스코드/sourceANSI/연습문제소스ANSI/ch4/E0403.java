public class E0403 {
	public static void main(String[ ] args) {
		String[ ] strs = new String[3];
		strs[0] = "Java";
		strs[1] = "I can do it.";
		strs[2] = "��ſ��� ���� �̷��� �ִ�.";
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}