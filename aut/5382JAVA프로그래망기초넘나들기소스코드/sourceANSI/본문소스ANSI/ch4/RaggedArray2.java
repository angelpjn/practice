import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[ ] args) {
		/* clone �޼��带 ����� �迭 ���� */
		int[ ] a = { 7, 3, 5, 2, 9 };
		int[ ] b = a.clone( ); // �迭 ��� ��� ����
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = " + b[i] + ", ");
		}
		System.out.print("\n arraycopy( ) �޼��带 ����� �迭 ����: ");

		/* arraycopy( ) �޼��带 ����� �迭 ���� */
		int[ ] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print("  " + c[i]);
		}
		System.out.print("\n arraycopy( ) �޼��带 ����� Ư�� �κ� ����: ");
		// Ư�� �κ� ����, a[3] ~ a[5]�� ��(2��)�� c[3] ~ c[5]�� ����
		System.arraycopy(a, 0, c, 3, 2);
		for (int e : c)
			System.out.print("  " + e);
		System.out.print("\n �ݺ����� �̿��� �迭 ����: ");

		/* �ݺ����� �̿��� �迭 ���� */
		int[ ] d = new int[a.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = a[i];
			System.out.print("  " + d[i]);
		}
		System.out.print("\n copyOf( ) �� �̿��� �迭 ����: ");

		/* java.util.Arrays Ŭ�������� �����ϴ� copyOf( ) �� �̿��� �迭 ���� */
		int[ ] g = new int[a.length];
		g = Arrays.copyOf(a, a.length);
		for (int e : g)
			System.out.print("  " + e);
		System.out.println( );
	}
}