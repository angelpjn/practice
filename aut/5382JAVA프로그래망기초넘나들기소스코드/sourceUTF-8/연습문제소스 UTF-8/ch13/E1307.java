public class E1307 extends Thread {
	public synchronized void mA() {
		int[] digit = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int length = digit.length;
		for (int i = 0; i < length; i++) {
			System.out.print("\nmA: " + digit[i] + ", ");
			try {
				Thread.sleep(30); // 0.03초 후 다른 스레드 동작되도록
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void mB() {
		for (int i = 0; i < 10; i++) {
			System.out.print("\nmB: " + i + ", ");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		mA();
	}

	public static void main(String[] args) {
		E1307 mt = new E1307();
		mt.start();
		mt.mB();
	}
}