class anonymousClass {
	public void method( ) {
		System.out.println("method( )");
	}
}

public class AnonymousOuter {
	public static void main(String[ ] args) {

		// �̸� ���� ����(�ڽ�, ����) Ŭ���� ����,
		// �͸�Ŭ���� �������� ��� ������ �������̵��� ��츸 ������
		anonymousClass ac = new anonymousClass( ) {
			public void method( ) { // �ܺ� Ŭ������ �޼��� �������̵�
				System.out.println("method( ) �������̵�(������)");
			}
		}; // new anonymousClass( )�� { } �ٿ��� �͸� Ŭ���� ����(��ü �ݱ�)
		ac.method( );
	}
}