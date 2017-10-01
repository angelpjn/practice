public class MemberOuter {
	private int outerDf = 0;
	private static int si = 55;
	int c = 77;

	void outerMethod( ) {
		System.out.println(c); // �ܺ� ���
		System.out.println(outerDf); // ����ƽ �ܺ� ���
		System.out.println(this.si); // �ν��Ͻ� �ܺ� ���
		MemberInner mi = new MemberInner( ); // Ok, ���� Ŭ���� ��ü ����
		System.out.println("MemberInner( ) ȣ��: " + mi.x); // Ok, ���� �޼��� ȣ��
	}

	// static �޼���� static �Ǵ� �ֻ��� Ÿ�Կ����� ���� ����
	static void outerSt( ) {
		// MemberInner mi = new MemberInner( ); // static, ���� Ŭ���� ��ü ���� X
	}

	// ���� ���� Ŭ����(Non-static nested class, inner class, local(member) class)
	public class MemberInner {
		private int x = 33;
		int outerDf = 9;
		static final int b2 = 22; // static�� final ���� ����(��� ó��)�� ����

		// static int sy ; // ������ ����
		// static int vs = 88; // non-static ���� ũ�������� static ���� �Ұ�
		// static void innerMethod( ) { } // static �޼��� ���� �Ұ�

		public void method( ) {
			int vm = si; // non-static -> static
			System.out.println("MemberOuter�� �� ����, vm = " + vm); // 55
			outerSt( ); // non-static -> static
			MemberOuter obj = new MemberOuter( ); // ��ü ����
			System.out.println(obj.si); // �ν��Ͻ� �ܺ� ���
			System.out.println(this.x); // //�ν��Ͻ� ���� ���

			MemberOuter.this.outerDf = 100; // Outer.this�� MemberOuter ��ü ����		   outerMethod( ); // non-static -> non-static, mi.xd�� �� 33
			System.out.println("outerDf = " + outerDf); // 9
			System.out.println("this.outerDf = " + this.outerDf); // 9
			System.out.println(MemberOuter.this.outerDf); // 100
		}
	}

	public static void main(String[ ] args) {
		MemberOuter obj = new MemberOuter( ); // ��ü ����

		// �ν��Ͻ� Ŭ���� ���� �޼��带 �����ϱ� ����
		MemberOuter.MemberInner t = obj.new MemberInner( ); // ��ü ����
		t.method( ); // ���� �޼��� ȣ���Ͽ� ����
	}
}