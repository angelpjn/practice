public class LocalOuterEx {
	private int a = 50;
	final int Lv = 123; // final�� ���� ������ ���, ���� ������ ��

	void method(final int a, int b) {
		int c = 30;       // �ʵ�(��� ����)
		final int d = 40; // �ʵ�(��� ����)
		 
	    // LocalInner Ŭ������ method( ) �޼��� �������� ��� ����
		class LocalInner { // ���� Ŭ����, �޼��� �ȿ��� ����
			void msg( ) {
				int no = 0;  // ���� ������ �ݵ�� �ʱ�ȭ�ؾ߸� ��� ����
				no = no + 8;
				System.out.println("data = " + a);
				/* outer method�� ���������� �Ű����� �߿� final�� ���� ���� */
				// d = 3; // ������ ����, final ������ ���� ���� �Ұ�
				System.out.println(a); // ����
				System.out.println(LocalOuter.this.a); // ����
				System.out.println(b); // ������ ����
				System.out.println(c);
				// �� ������ ����: final �� ���� ���������� �Ķ���ʹ� ���� �Ұ�
				System.out.println(d); // ����
			}
		}
		LocalInner local = new LocalInner( ); // Ŭ������ ���� ��ü ���� ��
		local.msg( ); // �޼��带 ȣ���Ͽ� ���
	}

	public static void main(String args[ ]) {
		LocalOuter obj = new LocalOuter( );
		obj.method(5, 10);
	}
}