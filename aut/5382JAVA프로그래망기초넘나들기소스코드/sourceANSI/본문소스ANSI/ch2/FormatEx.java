import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatEx {
	public static void main(String[ ] args) {
		long n = 123456789;
		System.out.format("%d%n", n); // 123456789
		System.out.format("%012d%n", n); // 000123456789
		System.out.format("%+9d%n", n); // +123456789
		System.out.format("%,9d%n", n); // 123,456,789
		System.out.format("%+,9d%n%n", n); // +123,456,789

		double pi = 3.1415926;
		System.out.format("%f%n", pi); // 3.141593
		System.out.format("%.2f%n", pi); // 3.14
		System.out.format("%12.3f%n", pi); // "       3.142"
		System.out.format("%-12.4f%n", pi); // "3.1416      "

		String name = "Can";
		String lang = "Java";
		String value = String.format("%s %s", name, lang); // Can Java
		System.out.println(value);

		// DecimalFormat Ŭ������ new �����ڸ� ����Ͽ� ��ü�� ����
		// format �޼ҵ带 ����Ͽ� Ư�� �������� ���� ���� ����
		// ������ �� �ִ� ���� ������ '0' �� '#'�� ����Ͽ� ����
		double value2 = 123456.78925;
		String pattern = "###,###.#####"; // 123,456.78925 ����
		DecimalFormat fmt = new DecimalFormat(pattern);
		String output = fmt.format(value2);
		System.out.println(value2 + "  " + pattern + "  " + output);

		Date now = new Date( );
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		System.out.println(format.format(now)); // 20150529
		format = new SimpleDateFormat("E MMM dd HH:mm:ss", Locale.UK);
		System.out.println(format.format(now)); // Fri May 29 21:19:48

		Calendar c = Calendar.getInstance( );
		// ��(��ü,2015): %tY, (2�ڸ�,15): %ty , ��: %tB, %tb (���), �޼�: %m
		// ��(��ü�̸�): %tA , (���) %ta, (0����) %td , (������): %te
		System.out.format("%tY %tB %te, %n", c, c, c); // 2015 5�� 29,

		// AM/PM: %p , ��(24�ð�): % , (12�ð�): %i
		System.out.format("%tp %tl:%tM %n", c, c, c); // ���� 9:19
		System.out.format("%tD%n", c); // 05/29/15
	}
}