import java.util.Scanner;

public class ScannerEx {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("연속하여 3개의 문자를 입력(공백으로 구분): ");
		String str1 = scan.next( ); // 첫번째 단어 읽어들임
		String str2 = scan.next( ); // 두번째 단어 읽어들임
		String str3 = scan.next( ); // 세번째 단어 읽어들임
		System.out.println(str1 + '\t' + str2 + '\t' + str3);

		int vi;
		double weight;
		System.out.print(" 정수 입력: ");
		vi = scan.nextInt( ); // 숫자 입력한 직후 버퍼에 <엔터>가 남아있게 되므로
		System.out.println("정수: " + vi);

		System.out.print(" 몸무게 입력: ");
		weight = scan.nextDouble( ); // 키보드 숫자 Double형 입력
		System.out.println("몸무게: " + weight);
		scan.nextLine( ); // 버퍼 초기화하여 버퍼에서 <엔터>를 삭제해야 정상 동작
		
		System.out.print(" 주소 입력: ");
		String address = scan.nextLine( );
		System.out.println("주소: " + address);
		scan.close( );

		Scanner sc = new Scanner("2030/08/15");
		sc.useDelimiter("/");
		while (sc.hasNext( )) {
			System.out.print(sc.next( ) + "\t");
		}
		System.out.println(" --- end --- ");
		sc.close( );
	}
}