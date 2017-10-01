class ClassA {
	private String message;
	private boolean flag; // wait( ) ȣ�� ����

	public synchronized void methodA(String contents) {
		while (flag) { // ������ ���� ó�� ���� üũ
			try {
				wait( ); // ���� ��ȯ�ϰ� ���, �ݵ�� ���� ������ ��
			} catch (InterruptedException e) {
			}
		}

		flag = true;
		message = contents;
		notifyAll( ); // ������(Wakeup), ��� ���� ��� �����带 ���� �����ϵ��� 
	}

	public synchronized String methodB( ) {
		while (!flag) {
			try {
				wait( ); // ���� ��ȯ�ϰ� ���
			} catch (InterruptedException e) {
			}
		}

		flag = false;
		notify( ); // ������(Wakeup), ��� ���� �ϳ��� �����带 ���� �����ϵ��� 
		return message;
	}
}

class ClassB implements Runnable {
	private ClassA classA;

	public ClassB(ClassA ca) {
		this.classA = ca;
	}

	public void run( ) {
		for (int i = 0; i < 5; i++) {
			String contents = i + " ����(" + System.nanoTime( ) + ")";
			System.out.println(contents);
			classA.methodA(contents);
		}
	}
}

class ClassC implements Runnable {
	private ClassA classA;

	public ClassC(ClassA ca) {
		this.classA = ca;
	}

	public void run( ) {
		for (int i = 0; i < 5; i++) {
			classA.methodA(Integer.toString(i));
			System.out.println(Thread.currentThread( ).getName( ) + " "
					+ classA.methodB( ));
		}
	}
}

public class E1310 {
	public static void main(String[ ] args) {
		ClassA i = new ClassA( );
		Thread t = new Thread(new ClassC(i), "ClassC ������");
		Thread t2 = new Thread(new ClassB(i), "ClassB ������");
		t.start( );
		t2.start( );
		System.out.println("main ����");
	}
}