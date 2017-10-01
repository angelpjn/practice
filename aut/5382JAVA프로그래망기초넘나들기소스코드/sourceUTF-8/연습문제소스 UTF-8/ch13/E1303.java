class ThreadEx implements Runnable {
	int seq;

	public ThreadEx(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println("thread #" + this.seq + " 시작");
		try {
			Thread.sleep(1000); // 예외 처리문(try-catch 문)에 주목
		} catch (Exception e) {
		}
		System.out.println("thread #" + this.seq + " 종료");
	}
}
public class E1303 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// Thread t = new ThreadEx(i);
			// Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 전달 Thread t = new Thread(new
			// ThreadEx(i));
			(new Thread(new ThreadEx(i))).start();
//			Runnable r = new ThreadEx(i);
//			Thread t = new Thread(r);
//			t.start();
			try {
				(new Thread(new ThreadEx(i))).join(); // main 스레드가 종료될 때까지 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 종료");
	}
}