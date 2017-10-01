// 1. ����� Exception �����ϱ�, ����� ���� ��ƾ Exception ���� ��� 
// ���� �߻��� ��� �޽��� ���� �����ڸ� ���� ���ڷ� �޾� ��ü�� ����
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

	public String getMessage( ) {
		return super.getMessage( );
	}
}

// 2. ����� ���� Exception ������
// Exception �߻��� �ش� ��Ȳ ������ ���ڷ� ��� Exception�� �����Ͽ� ������.
public class MainEx {
	static void studentAge(int age) throws MyException {
		if (age < 0)
			throw new MyException("���̰� 0 ���� ���� �� ����!");
		else
			System.out.println("��ȿ!");
	}

	public static void main(String[ ] args) {
		try {
			studentAge(-2);
		} catch (MyException e) { // ����� ���� ���� ��ƾ ȣ��
			System.out.println("���ܹ߻�: " + e.getMessage( ));
			e.printStackTrace( );
		}
	}
}