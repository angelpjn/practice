import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[ ] args) {
		String str = "I can, do it!";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens( ));

		System.out.println("--- ���鿡 ���� �и� ---");
		while (st.hasMoreTokens( )) {
			System.out.println(st.nextToken( ));
		}

		System.out.println("--- , �� ���� �и� ---");
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreTokens( )) {
			System.out.println(st2.nextToken( ));
		}

		System.out.println("--- ����� , �� ���� �и� ---");
		StringTokenizer st3 = new StringTokenizer(str, ", ");

		while (st3.hasMoreTokens( )) {
			System.out.println(st3.nextToken( ));
		}
	}
}