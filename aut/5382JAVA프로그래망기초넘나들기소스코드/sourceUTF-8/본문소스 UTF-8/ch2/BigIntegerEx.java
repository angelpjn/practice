import java.math.*;
import java.text.*;
import java.util.Locale;

public class BigIntegerEx {
	public static void main(String[ ] args) throws ParseException {
		BigInteger b1 = new BigInteger("987654321987654321987654321");
		BigInteger b2 = new BigInteger("987654321987654321987654321");
		BigInteger result = b1.add(BigInteger.valueOf(5)); // 정수 5를 변환해야함
		System.out.println("덧셈 결과 = " + result);

		BigInteger add = b1.add(b2);
		BigInteger sub = b1.subtract(b2);
		BigInteger product = b1.multiply(b2);
		BigInteger division = b1.divide(b2);

		System.out.println("덧셈 결과 = " + add);
		System.out.println("뺄셈 결과 = " + sub);
		System.out.println("곱셈 결과 = " + product);
		System.out.println("나눗셈 결과 = " + division);

		BigInteger renumlt = BigInteger.ONE;
		for (int i = 1; i <= 5; i++) {
			renumlt = renumlt.multiply(BigInteger.valueOf(i));
		}
		System.out.println(5 + "! = " + renumlt);

		String intStr = "123456789";
		BigInteger temp = new BigInteger(intStr, 16);
		System.out.println("123456667의 16진수 = " + temp);

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

		System.out.println(num1.toBigInteger( )); // BigInteger 객체로 반환
		DecimalFormat twoDigits = new DecimalFormat("0.00"); // 소수점 밑 2자리까지
		String str = twoDigits.format(num1);
		System.out.println("DecimalFormat: " + str);

		BigDecimal add2 = num1.add(num2); // 더하기
		BigDecimal sub2 = num1.subtract(num2); // 빼기
		BigDecimal mul2 = num1.multiply(num2); // 곱하기
		BigDecimal div1 = num1.divide(num2, BigDecimal.ROUND_UP); // 올림

		// 소수점 3번째 자리에서 반올림
		BigDecimal div2 = num1.divide(num2, 3, BigDecimal.ROUND_HALF_UP);
		System.out.println("덧셈 : " + add2);
		System.out.println("뺄셈 : " + sub2);
		System.out.println("곱셈 : " + mul2);
		System.out.println("나눗셈1 : " + div1);
		System.out.println("나눗셈2 : " + div2);

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