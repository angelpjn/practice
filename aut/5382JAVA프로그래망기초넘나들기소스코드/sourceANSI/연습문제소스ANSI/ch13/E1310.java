class ClassA {
	private String message;
	private boolean flag; // wait( ) 호출 조건

	public synchronized void methodA(String contents) {
		while (flag) { // 루프를 통해 처리 여부 체크
			try {
				wait( ); // 락을 반환하고 대기, 반드시 루프 구성할 것
			} catch (InterruptedException e) {
			}
		}

		flag = true;
		message = contents;
		notifyAll( ); // 깨워줌(Wakeup), 대기 중인 모든 스레드를 실행 가능하도록 
	}

	public synchronized String methodB( ) {
		while (!flag) {
			try {
				wait( ); // 락을 반환하고 대기
			} catch (InterruptedException e) {
			}
		}

		flag = false;
		notify( ); // 깨워줌(Wakeup), 대기 중인 하나의 스레드를 실행 가능하도록 
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
			String contents = i + " 내용(" + System.nanoTime( ) + ")";
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
		Thread t = new Thread(new ClassC(i), "ClassC 스레드");
		Thread t2 = new Thread(new ClassB(i), "ClassB 스레드");
		t.start( );
		t2.start( );
		System.out.println("main 종료");
	}
}