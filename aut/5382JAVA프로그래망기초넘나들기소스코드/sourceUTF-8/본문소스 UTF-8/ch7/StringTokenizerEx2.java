import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[ ] args) {
		String str = "I can, do it!";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens( ));

		System.out.println("--- 공백에 의해 분리 ---");
		while (st.hasMoreTokens( )) {
			System.out.println(st.nextToken( ));
		}

		System.out.println("--- , 에 의해 분리 ---");
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreTokens( )) {
			System.out.println(st2.nextToken( ));
		}

		System.out.println("--- 공백과 , 에 의해 분리 ---");
		StringTokenizer st3 = new StringTokenizer(str, ", ");

		while (st3.hasMoreTokens( )) {
			System.out.println(st3.nextToken( ));
		}
	}
}