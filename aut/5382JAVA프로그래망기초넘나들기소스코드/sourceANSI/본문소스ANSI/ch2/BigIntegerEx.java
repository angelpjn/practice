import java.math.*;
import java.text.*;
import java.util.Locale;

public class BigIntegerEx {
	public static void main(String[ ] args) throws ParseException {
		BigInteger b1 = new BigInteger("987654321987654321987654321");
		BigInteger b2 = new BigInteger("987654321987654321987654321");
		BigInteger result = b1.add(BigInteger.valueOf(5)); // Á¤¼ö 5¸¦ º¯È¯ÇØ¾ßÇÔ
		System.out.println("µ¡¼À °á°ú = " + result);

		BigInteger add = b1.add(b2);
		BigInteger sub = b1.subtract(b2);
		BigInteger product = b1.multiply(b2);
		BigInteger division = b1.divide(b2);

		System.out.println("µ¡¼À °á°ú = " + add);
		System.out.println("»¬¼À °á°ú = " + sub);
		System.out.println("°ö¼À °á°ú = " + product);
		System.out.println("³ª´°¼À °á°ú = " + division);

		BigInteger renumlt = BigInteger.ONE;
		for (int i = 1; i <= 5; i++) {
			renumlt = renumlt.multiply(BigInteger.valueOf(i));
		}
		System.out.println(5 + "! = " + renumlt);

		String intStr = "123456789";
		BigInteger temp = new BigInteger(intStr, 16);
		System.out.println("123456667ÀÇ 16Áø¼ö = " + temp);

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

		System.out.println(num1.toBigInteger( )); // BigInteger °´Ã¼·Î ¹ÝÈ¯
		DecimalFormat twoDigits = new DecimalFormat("0.00"); // ¼Ò¼öÁ¡ ¹Ø 2ÀÚ¸®±îÁö
		String str = twoDigits.format(num1);
		System.out.println("DecimalFormat: " + str);

		BigDecimal add2 = num1.add(num2); // ´õÇÏ±â
		BigDecimal sub2 = num1.subtract(num2); // »©±â
		BigDecimal mul2 = num1.multiply(num2); // °öÇÏ±â
		BigDecimal div1 = num1.divide(num2, BigDecimal.ROUND_UP); // ¿Ã¸²

		// ¼Ò¼öÁ¡ 3¹øÂ° ÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²
		BigDecimal div2 = num1.divide(num2, 3, BigDecimal.ROUND_HALF_UP);
		System.out.println("µ¡¼À : " + add2);
		System.out.println("»¬¼À : " + sub2);
		System.out.println("°ö¼À : " + mul2);
		System.out.println("³ª´°¼À1 : " + div1);
		System.out.println("³ª´°¼À2 : " + div2);

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