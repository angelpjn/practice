public class VarScore {
	int varReturn(int a) { // a�� varReturn �޼��忡���� ����
		a++; // a�� ���� 1 ����
		return a;
	}

	public static void main(String[ ] args) {
		int a = 1; // �޼��� ������ ������ ������ �� �޼��� �ȿ��� ��ȿ
		VarScore obj = new VarScore( );

		obj.varReturn(a); // �μ� a�� varReturn �޼����� a�� �ٸ�
		System.out.println(a);

		a = obj.varReturn(a); // varReturn �޼��� ��� ���� ����
		System.out.println(a);
	}
}