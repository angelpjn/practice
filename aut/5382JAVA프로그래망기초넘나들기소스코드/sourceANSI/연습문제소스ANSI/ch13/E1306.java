public class E1306 implements Runnable {
	int count;

	public synchronized void run() { // ������ ��ü�� ������ �۾�
		for (int i = 0; i <= 100; i++) {
			System.out.println("i:" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		E1306 t = new E1306(); // ������ ��ü ����
		Thread th = new Thread(t); // �����忡 ��ü ����, �Ű������� ����
		th.start(); // �����尡 ���� ����. �ش� �������� run �޼��带 ȣ��
		Thread.sleep(1000);

		System.out.println("Thread ���� ...");
	}
}