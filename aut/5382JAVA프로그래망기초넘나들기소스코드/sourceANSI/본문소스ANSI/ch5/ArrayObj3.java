class ObjectArray {
	private int[ ] prices; // �迭�� ������ �ʵ�(��� ����)

	// �Ű������� Ÿ�� int[ ] �� ��ü �迭
	public void showInfo(int[ ] prices) {
		System.out.println(prices[0] + ", " + prices[1] + ", " + prices[2]);
	}
}

public class ArrayObj3 {
	public static void main(String[ ] args) {
		int prices[ ] = new int[ ] { 3, 5, -7 }; // ��ü �迭 �ʱ�ȭ
		ObjectArray obj = new ObjectArray( ); // ��ü ����

		obj.showInfo(prices); // �μ��� ��ü �迭 ����, �� �� ��ü���� �����
	}
}