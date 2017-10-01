public class E0705 {
	public static void main(String args[ ]) {
		StringBuffer sb = new StringBuffer( );
		sb.append("Can"); 
		sb.append(" ");
		sb.append("do it"); // "can" + " " + "do it."
		System.out.println(sb);
		System.out.println("2번째 위치의 문자 : " + sb.charAt(2));
	}
}