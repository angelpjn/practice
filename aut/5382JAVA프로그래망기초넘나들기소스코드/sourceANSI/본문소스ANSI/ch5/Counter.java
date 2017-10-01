public class Counter {
	private int x; // �ʵ�(��� ����)

	// ������, �޼��� �̸��� Ŭ�����̸��� �����ϹǷ�
	public Counter(int x) { // x�� �Ű�����
		this.x = x; // ��������� this.�������
	}

	public static void increment(Counter n) {
		n.x++;
	}

	// toString �޼���� ��ü�� ������ �ִ� ���� ���ڿ��� ���� ����
	// ��� ���¸� ���߷��� toString�� �ݵ�� �������̵� �ؾ� ��
	public String toString( ) { // toString�� �������̵� �ϴ� �κ�
		return "�޼��� ȣ�� <��>: " + x; // ���ǵ� ���¸� ��ȯ
	}
}

class CallByReference {
	public static void main(String[ ] args) {
		Counter c = new Counter(3); // ��ü ����, �ڵ����� ������ ȣ��
		System.out.println("�޼��� ȣ�� <��>: " + c);
		Counter.increment(c); // ��ü �����Ͽ� ��� ������ �� ����
		System.out.println("�޼��� ȣ�� <��>: " + c);
	}
}