
package readInTurn5.nonEx;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatEx {
    public static void main(String[] args) {
        long n = 123456789;
        System.out.format("%d%n",n);
        System.out.format("%012d%n",n);
        System.out.format("%+9d%n",n);
        System.out.format("%,9d%n",n);
        System.out.format("%+,9d%n%n",n);

        double pi = 3.1415926;
        System.out.format("%f%n",pi);
        System.out.format("%.2f%n",pi);
        System.out.format("%12.3f%n",pi);
        System.out.format("%-12.4f%n",pi);

        String name = "Can";
        String lang = "Java";
        String value = String.format("%s %s", name, lang);
        System.out.println(value);

        double value2 = 123456.78925;
        String pattern = "###,###.#####";
        DecimalFormat fmt = new DecimalFormat(pattern);
        String output = fmt.format(value2);
        System.out.println(value2 + " " + pattern + " " + output);

        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        System.out.println(format.format(now));
        format = new SimpleDateFormat("E MMM dd HH:mm:ss", Locale.UK);
        System.out.println(format.format(now));

        Calendar c = Calendar.getInstance();
        System.out.format("%tY %tB %te, %n", c, c, c);
        System.out.format("%tp %tl : %tM %n", c, c, c);
        System.out.format("%tD%n", c);

    }
}