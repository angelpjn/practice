class ThreadEx extends Thread {
	int seq;

	public ThreadEx(int seq) {
		this.seq = seq;
	}

	public void run( ) {
		System.out.println("thread #" + this.seq + " 시작");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("thread #" + this.seq + " 종료");
		yield( ); // 현재 실행중인 스레드의 실행을 다른 스레드에게 일시적으로 양보
	}
}
public class E1305 {
	public static void main(String[ ] args) {
		for (int i = 0; i < 5; i++) {
			// Thread t = new ThreadEx(i);
			Thread t = new Thread(new ThreadEx(i));
			t.start( ); // 스레드 시작
			try {
				t.join( ); // main 스레드가 종료될 때까지 대기
			} catch (InterruptedException e) {
				e.printStackTrace( );
			}
		}
		System.out.println("main 종료");
	}
}