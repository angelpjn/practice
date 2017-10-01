public class E1308 implements Runnable {
   public void mA( ) {
	int[ ] digit = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	int length = digit.length;
	for (int i = 0; i < length; i++) {
		System.out.print("\nmA: " + digit[i] + ", ");
		try {
			Thread.sleep(50); // 0.05�� �� �ٸ� ������ �����ϵ���
		} catch (InterruptedException e) { e.printStackTrace( ); }
	}
   }

   public void mB( ) {
	for (int i = 0; i < 10; i++) {
		System.out.print("\nmB: " + i + ", ");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) { e.printStackTrace( ); }
	}
   }

   public void run( ) { mA( ); }

   public static void main(String[ ] args) {
	E1308 mt = new E1308( ); // ��ü ����
	Thread th = new Thread(mt); // Runnable �������̽��� ��ü mt ����
	th.start( );
	mt.mB( );
   }
}