import java.math.*;
import java.text.*;
import java.util.Locale;

public class BigIntegerEx {
	public static void main(String[ ] args) throws ParseException {
		BigInteger b1 = new BigInteger("987654321987654321987654321");
		BigInteger b2 = new BigInteger("987654321987654321987654321");
		BigInteger result = b1.add(BigInteger.valueOf(5)); // ���� 5�� ��ȯ�ؾ���
		System.out.println("���� ��� = " + result);

		BigInteger add = b1.add(b2);
		BigInteger sub = b1.subtract(b2);
		BigInteger product = b1.multiply(b2);
		BigInteger division = b1.divide(b2);

		System.out.println("���� ��� = " + add);
		System.out.println("���� ��� = " + sub);
		System.out.println("���� ��� = " + product);
		System.out.println("������ ��� = " + division);

		BigInteger renumlt = BigInteger.ONE;
		for (int i = 1; i <= 5; i++) {
			renumlt = renumlt.multiply(BigInteger.valueOf(i));
		}
		System.out.println(5 + "! = " + renumlt);

		String intStr = "123456789";
		BigInteger temp = new BigInteger(intStr, 16);
		System.out.println("123456667�� 16���� = " + temp);

		BigDecimal payment = new BigDecimal("9876.54");
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		double doublePayment = payment.doubleValue( );
		String s = n.format(doublePayment);
		System.out.println(s);

		BigDecimal payment2 = new BigDecimal("9876");
		NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		int doublePayment2 = payment2.intValue( );
		String s2 = n2.format(doublePayment2);
		System.out.println(s2);

		BigDecimal num1 = new BigDecimal("987654321987654321.987654321");
		BigDecimal num2 = new BigDecimal("213654321987654321.032498765");

		System.out.println(num1.toBigInteger( )); // BigInteger ��ü�� ��ȯ
		DecimalFormat twoDigits = new DecimalFormat("0.00"); // �Ҽ��� �� 2�ڸ�����
		String str = twoDigits.format(num1);
		System.out.println("DecimalFormat: " + str);

		BigDecimal add2 = num1.add(num2); // ���ϱ�
		BigDecimal sub2 = num1.subtract(num2); // ����
		BigDecimal mul2 = num1.multiply(num2); // ���ϱ�
		BigDecimal div1 = num1.divide(num2, BigDecimal.ROUND_UP); // �ø�

		// �Ҽ��� 3��° �ڸ����� �ݿø�
		BigDecimal div2 = num1.divide(num2, 3, BigDecimal.ROUND_HALF_UP);
		System.out.println("���� : " + add2);
		System.out.println("���� : " + sub2);
		System.out.println("���� : " + mul2);
		System.out.println("������1 : " + div1);
		System.out.println("������2 : " + div2);

		String value = "1,234,567,890.999999999999999";
		BigDecimal money = new BigDecimal(value.replaceAll(",", ""));
		System.out.println(money);

		DecimalFormatSymbols symbols = new DecimalFormatSymbols( );
		symbols.setGroupingSeparator(',');
		symbols.setDecimalSeparator('.');
		String pattern = "#,##0.0#";
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		decimalFormat.setParseBigDecimal(true);

		// parse the string
		BigDecimal bigDecimal = (BigDecimal) decimalFormat
				.parse("598,765,432,987,640,124.5670");
		System.out.println(bigDecimal);
	}
}