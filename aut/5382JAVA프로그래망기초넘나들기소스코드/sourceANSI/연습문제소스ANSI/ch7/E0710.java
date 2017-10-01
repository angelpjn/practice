import java.util.StringTokenizer;

public class E0710 {
	static String in = "��, ��, ȭ, ��, ��, ��, ��";

	public static void printArray(String[ ] arr) {
		for (String s : arr) {
			System.out.print("'" + s + "'\t");
		}
		System.out.println( );
	}

	public static void printToken(StringTokenizer token) {
		while (token.hasMoreTokens( )) {
			System.out.print("'" + token.nextToken( ) + "'\t");
		}
		System.out.println( );
	}

	public static void main(String args[ ]) {
		String[ ] arr = "||A|c|t||g|o||".split("\\|");
		printArray(arr);

		StringTokenizer tokenizer = new StringTokenizer("||C|a|n||d||", "|");
		printToken(tokenizer);

		StringTokenizer st = new StringTokenizer(in, ",");
		printToken(tokenizer);

		// split( )�� null token �� ���ڿ��� ��ȯ�Ͽ� �迭�� ����
		// StringTokenizer�� ��� null token�� ���Ͽ�, �����ϰ� �ǳ� �ڴ�.
		// ���ڿ��� ��ū���� �ν�, �迭�� ��ȯ, ���� ��� ó���Ϸ��� split ,
		// �׿ܴ� StringTokenizer �� ���
		String[ ] week = in.split(",");
		System.out.println("��ū ����: " + st.countTokens( ));
		for (int i = 0; i < week.length; i++) {
			System.out.print(i + " : " + week[i] + ",  ");
		}
	}
}