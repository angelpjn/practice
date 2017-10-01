public class StringBufferEx {
	public static void main(String[ ] args) {

		StringBuffer sb = new StringBuffer("test");
		sb.append(" to java");
		sb.insert(0, "Vision ");
		System.out.println(sb); // sb.toString( ) 자동 호출
		System.out.println("substing( ): " + sb.substring(0, 5));

		String str = sb.substring(3);
		System.out.println("substing( ): " + str);
		System.out.println("길이: " + sb.length( ) + ", 용량(버퍼크기): "
				+ sb.capacity( ));

		System.out.println("3번째 위치의 문자: " + sb.charAt(2));
		System.out.println("3번째 위치의 문자 unicode: " + sb.codePointAt(2));
		System.out.println("특정 문자열 처음 위치:" + sb.indexOf("t"));
		System.out.println("삭제: " + sb.delete(2, 2 + "sion".length( )));
		System.out.println("역순: " + sb.reverse( ));
	}
}