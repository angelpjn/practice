public class LocalOuter {
	private int data = 50;
	final int Lv = 123; // final�� ���� ������ ���, ���� ������ ��
	void method( ) {
		// LocalInner Ŭ������ method( ) �޼��� �������� ��� ����
		class LocalInner { // ���� Ŭ����, �޼��� �ȿ��� ����� �ӽ� Ŭ�����̹Ƿ�
			void msg( ) {
				System.out.println("data = " + data);
			}
		}
		// ���� Ŭ������ ����� �޼��� �ȿ��� ��ü�� �����ؾ߸� �Կ� �ָ�
		LocalInner local = new LocalInner( ); // ��ü ���� ��
		local.msg( ); // �޼��带 ȣ���Ͽ� ���
	}

	public static void main(String args[ ]) {
		LocalOuter obj = new LocalOuter( );
		obj.method( );
	}
}