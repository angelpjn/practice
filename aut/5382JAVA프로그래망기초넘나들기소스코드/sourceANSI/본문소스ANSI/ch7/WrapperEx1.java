public class WrapperEx1 {
	public static void main(String[ ] args) {

		char ch = 'A';
		int vi = 18;
		Integer i = new Integer(25);
		Double d = new Double(3.14);

		System.out.print(Character.getNumericValue(ch)); // ���ڸ� ���ڷ� ��ȯ
		System.out.print("\t" + Integer.parseInt("-38") + "\t"); // ���ڿ� -38�� ������
		System.out.println(Character.valueOf('A')); // ���� Ŭ����

		System.out.print("������ : " + Integer.toBinaryString(vi));
		System.out.print("\t8���� : " + Integer.toOctalString(vi));
		System.out.println("\t16���� : " + Integer.toHexString(vi));

		String data = Integer.toString(88); // String Ÿ������ ����, ��88��
		System.out.print(i.doubleValue( )); // ������ double�� ��ȯ
		System.out.print("\t" + d.toString( ) + "\t"); // d ���� ���ڿ���
		System.out.println(Character.toLowerCase('D')); // �ҹ��� ��ȯ
	}
}