class ThreadEx implements Runnable {
	int seq;

	public ThreadEx(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println("thread #" + this.seq + " ����");
		try {
			Thread.sleep(1000); // ���� ó����(try-catch ��)�� �ָ�
		} catch (Exception e) {
		}
		System.out.println("thread #" + this.seq + " ����");
	}
}
public class E1303 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// Thread t = new ThreadEx(i);
			// Thread�� �����ڷ� Runnable �������̽��� ������ ��ü�� ���� Thread t = new Thread(new
			// ThreadEx(i));
			(new Thread(new ThreadEx(i))).start();
//			Runnable r = new ThreadEx(i);
//			Thread t = new Thread(r);
//			t.start();
			try {
				(new Thread(new ThreadEx(i))).join(); // main �����尡 ����� ������ ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main ����");
	}
}