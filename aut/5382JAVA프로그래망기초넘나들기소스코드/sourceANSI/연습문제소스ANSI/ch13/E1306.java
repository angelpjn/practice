public class E1306 implements Runnable {
	int count;

	public synchronized void run() { // 스레드 객체가 수행할 작업
		for (int i = 0; i <= 100; i++) {
			System.out.println("i:" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		E1306 t = new E1306(); // 스레드 객체 생성
		Thread th = new Thread(t); // 스레드에 객체 장착, 매개변수로 전달
		th.start(); // 스레드가 실행 시작. 해당 스레드의 run 메서드를 호출
		Thread.sleep(1000);

		System.out.println("Thread 종료 ...");
	}
}