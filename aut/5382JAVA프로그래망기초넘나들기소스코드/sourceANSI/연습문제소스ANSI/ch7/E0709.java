import java.io.*;
import java.util.*;

public class E0709 {
	public static void main(String args[ ]) throws IOException {
		String str = "2015,5,,,8";

		System.out.println("StringTokenizer�� ���ڿ� �и�");
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens( ))
			System.out.println("#1 " + st.nextToken( ));

		System.out.println("Scanner.useDelimiter( )�� ���ڿ� �и�");
		Scanner scan = new Scanner(str).useDelimiter(",");
		while (scan.hasNext( ))
			System.out.println("#2 " + scan.next( ));

		System.out.println("String.split( )�� ���ڿ� �и�");
		String[ ] temp = new String(str).split(",");
		for (String s : temp)
			System.out.println("#1 " + s);
	}
}