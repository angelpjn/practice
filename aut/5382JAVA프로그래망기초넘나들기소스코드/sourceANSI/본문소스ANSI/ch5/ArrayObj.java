class ObjectArray {
	private int[ ] prices; // �迭�� ������ �ʵ�(��� ����)

	public ObjectArray( ) {
		prices = new int[3];  // 3���� ��Ҹ� ���� �� �ִ� ��ü �迭 ����

		prices[0] = 88;  // �ʵ� �� ����
		prices[1] = 33;
		prices[2] = 5;
	}

	public void showInfo( ) {
		System.out.println(prices[0] + ", " + prices[1] + ", " + prices[2]);
	}
}

public class ArrayObj {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( ); // ��ü ������ ��

		obj.showInfo( );  // �޼��� ȣ��
	}
}