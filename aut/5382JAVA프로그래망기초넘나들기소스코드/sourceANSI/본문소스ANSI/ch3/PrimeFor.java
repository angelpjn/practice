public class PrimeFor {
	public static void main(String[] args) {
		int x, count = 0;
		boolean isPrime = true; // �Ҽ�: ����� 1�� �ڽŻ��� 1���� ū ����
		System.out.print(" --- �Ҽ�(prime) --- \n");
		for (x = 2; x < 100; x++) {
			isPrime = true;
			for (int n = 2; n < x; n++) {
				if (x % n == 0) { // ���� �������� 0�̸� �Ҽ��� �ƴ�
					isPrime = false;
				}
			}

			if (isPrime == true) { // �Ҽ�
				count++; // �Ҽ� ����
				System.out.print(x + ", ");
			}
		}
		System.out.println("\n�Ҽ� ���� = " + count);
	}
}