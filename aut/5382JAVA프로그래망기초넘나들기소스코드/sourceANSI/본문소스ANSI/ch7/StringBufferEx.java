public class StringBufferEx {
	public static void main(String[ ] args) {

		StringBuffer sb = new StringBuffer("test");
		sb.append(" to java");
		sb.insert(0, "Vision ");
		System.out.println(sb); // sb.toString( ) �ڵ� ȣ��
		System.out.println("substing( ): " + sb.substring(0, 5));

		String str = sb.substring(3);
		System.out.println("substing( ): " + str);
		System.out.println("����: " + sb.length( ) + ", �뷮(����ũ��): "
				+ sb.capacity( ));

		System.out.println("3��° ��ġ�� ����: " + sb.charAt(2));
		System.out.println("3��° ��ġ�� ���� unicode: " + sb.codePointAt(2));
		System.out.println("Ư�� ���ڿ� ó�� ��ġ:" + sb.indexOf("t"));
		System.out.println("����: " + sb.delete(2, 2 + "sion".length( )));
		System.out.println("����: " + sb.reverse( ));
	}
}