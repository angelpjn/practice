public class BoxingUnBoxing {
	public static void main(String[ ] args) {
		Integer num = 88; // �ڵ��ڽ�, int 88�� Integer�� ��ȯ
		// Integer val = new Integer(88); �� ����
		int n = num; // �ڵ� ��ڽ�, int x = val.intValue( ); �� ����
		// ���� �ڽ� : ���� ������ ���� �� ������ ��ü�� �����ؼ� ����
		// ���� ��ڽ� : �� �������� ���� ���� ���ÿ������� ������
		System.out.println(num + ", " + n);
	}
}