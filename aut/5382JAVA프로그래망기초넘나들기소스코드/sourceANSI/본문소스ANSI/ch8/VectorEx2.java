import java.util.Vector;

public class VectorEx2 extends Vector { // Vector ���
	public VectorEx2(int typeNumber) { // ������ ������ Ÿ�� ����
		super(typeNumber);
	}

	public static void main(String[ ] args) {
		VectorEx2 v = new VectorEx2(3); // 3���� �ٸ� ������ Ÿ��

		System.out.println("v�� �뷮�� " + v.capacity( ));

		v.addElement(new Integer(88)); // ���� 88 ����
		v.addElement(new Double(12.25)); // �Ǽ� 12.35 ����
		v.addElement(new String("�ڹ�")); // ���ڿ� "�ڹ�" ����

		System.out.println("��� �Ѱ��� : " + v.elementCount);
		// ��� ��� ���
		for (int i = 0; i < v.size( ); i++) {
			System.out.println(v.get(i));
		}

		if (v.contains("�ڹ�")) { // ���Կ��� Ȯ��
			System.out.println("�ε��� ��ġ : " + v.indexOf("�ڹ�"));
		}

		System.out.println("1��° �ε����� ���: " + v.elementAt(1));
	}
}