class ObjectArray {
	private int[ ] prices; // �迭�� ������ �ʵ�(��� ����)

	public int[ ] InitInfo( ) {
		prices = new int[ ] { 3, 5, -7 }; // �ݵ�� �ʱ�ȭ
		return prices;
	}	
}

public class ArrayObj2 {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( );
		int[ ] ar = new int[4];

		ar = obj.InitInfo( );
		for (int e : ar) {
			System.out.println(e);
		}
	}
}