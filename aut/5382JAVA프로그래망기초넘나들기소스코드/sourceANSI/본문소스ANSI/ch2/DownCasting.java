public class DownCasting {
	public static void main(String[ ] args) {

		int n = 815; // ���� + ���ڿ� �� ��� ���ڿ��� ��ȯ��
		String str = n + " can"; // ���ڿ� ���ڿ��� ��ġ�� ��� ���ڿ��� ��
		System.out.println(str); // ���ڿ�ȭ�� "815 can"�� ���

		int x = 123;
		String s = String.valueOf(x); // ���ڸ� ���ڿ��� �ٲٱ�, ���1
		String s1 = Integer.toString(x); // int �� ���ڸ� ���ڿ��� �ٲٱ�, ���2

		double d = 567.89;
		String s2 = Double.toString(d); // double �� ���ڸ� ���ڿ��� �ٲٱ�

		long lo = 479876543210L; // long �� ���� ���ڿ� L�� �ٿ��� ǥ���ؾ� ��
		String s3 = Long.toString(lo);
		System.out.println(s + "\t" + s1 + "\t" + s2 + "\t" + s3);

		float f2 = 8.15f; // float �� ���� ���ڿ� f�� �ٿ��� ǥ���ؾ� ��
		int i2 = (int) f2; // �� ���忡���� float ���� int ������ ��ȯ
		double d2 = (double) i2; // �� ���忡���� float ����double ������ ��ȯ
		System.out.println(f2 + "\t" + i2 + "\t" + d2);

		String str4 = "1225"; // ���ڿ� 1225
		int y = Integer.valueOf(str4).intValue( ); // ���ڿ��� ���ڷ� �ٲٱ�
		int z = Integer.parseInt(str4);
		long lo2 = Long.parseLong(str4); // ���ڿ��� long �� ���ڷ� �ٲٱ�
		float f = Float.parseFloat(str4); // ���ڿ��� float �� ���ڷ� �ٲٱ�
		double d3 = Double.valueOf(str4).doubleValue( );
		System.out.println(y + "\t" + z + "\t" + lo2 + "\t" + f + "\t" + d3);
	}
}