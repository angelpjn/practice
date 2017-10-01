public class StaticOuter {
	private int outerM = 0;
	// int siv = outerM; // �ܺ�Ŭ������ �ν��Ͻ� ����� ���� �Ұ�
	private static int outerDf = 0;

	// �޸� �� �̹� �ε��Ǿ� �ö󰬱⿡ ��ü �������� ���� ���
	public static class StaticInner {
		private int innerMember = 20;
		private static int outerDf = 3; // �ܺ��� outerDf�� ������
		final int Lv = 123; // final�� ���� ������ ���

		public static void nestedM( ) {
			// System.out.println(innerMember); // ����, static -> non-static
			// System.out.println(outerM); // ����
			// System.out.println(StaticInner.innerMember); // ����
		}

		// �ܺθ޼��忡���� ����Ŭ������ ����� ������ �� ����
		// ���� Ŭ����ó�� �ν��ϹǷ� private �Ӽ��� ���õ�
		public void method( ) {
			System.out.println("outerDf = " + outerDf); // private �Ӽ� ����,3
			System.out.println("this.outerDf = " + this.outerDf); // 3
			// StaticOuter.StaticInner.outerDf; // //private �̹Ƿ� ���� �Ұ�
			// Lv = 100; // Lv�� ����̹Ƿ� ���� �Ұ�
			System.out.println("Lv = " + Lv); // 123
			// System.out.println(StaticOuter.this.outerM); // ���� �Ұ�
		}
	}

	public static void main(String[ ] args) {
		// static Ŭ������ ��ü �������� �ʰ� ���� ȣ��
		StaticOuter.StaticInner obj = new StaticOuter.StaticInner( );
		obj.method( ); // �޼��� ȣ���Ͽ� ����
		System.out.println(StaticOuter.StaticInner.outerDf);
	}
}