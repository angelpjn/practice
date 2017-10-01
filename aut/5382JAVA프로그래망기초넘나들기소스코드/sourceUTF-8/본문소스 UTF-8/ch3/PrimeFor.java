public class PrimeFor {
	public static void main(String[] args) {
		int x, count = 0;
		boolean isPrime = true; // 소수: 약수가 1과 자신뿐인 1보다 큰 정수
		System.out.print(" --- 소수(prime) --- \n");
		for (x = 2; x < 100; x++) {
			isPrime = true;
			for (int n = 2; n < x; n++) {
				if (x % n == 0) { // 나눈 나머지가 0이면 소수가 아님
					isPrime = false;
				}
			}

			if (isPrime == true) { // 소수
				count++; // 소수 갯수
				System.out.print(x + ", ");
			}
		}
		System.out.println("\n소수 갯수 = " + count);
	}
}