import java.util.StringTokenizer;

public class E0710 {
	static String in = "일, 월, 화, 수, 목, 금, 토";

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

		// split( )은 null token 을 빈문자열로 변환하여 배열에 저장
		// StringTokenizer는 모든 null token에 대하여, 무시하고 건너 뛴다.
		// 빈문자열도 토큰으로 인식, 배열로 반환, 값이 없어도 처리하려면 split ,
		// 그외는 StringTokenizer 를 사용
		String[ ] week = in.split(",");
		System.out.println("토큰 개수: " + st.countTokens( ));
		for (int i = 0; i < week.length; i++) {
			System.out.print(i + " : " + week[i] + ",  ");
		}
	}
}