class ClassName<T> {
	private T t;

	public T get( ) {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

public class GenericsEx {
	public static void main(String[ ] args) {
		ClassName<String> obj = new ClassName<>( ); // ������, Ÿ�� �μ� ���� ����
		obj.set("Pankaj"); // ��ȿ, String Ÿ�԰� ��ġ�ϱ� ����
		// obj.set(88); // ������ ����, String Ÿ�԰� ����ġ�ϱ� ����
		ClassName obj2 = new ClassName( ); // ���׸� �������� ���� ���
		obj2.set("Pankaj"); // ��ȿ
		obj2.set(88); // ��ȿ, autoboxing ����
	}
}