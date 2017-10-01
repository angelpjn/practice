import java.io.*;
import java.util.*;

public class E0801 {
	public static void main(String[ ] args) throws IOException {
		List<String> str = new ArrayList<String>( );
		str.add("I can ");
		str.add("do it.");

		String sub1 = str.get(0); System.out.println(sub1);
		String sub2 = str.get(1); System.out.println(sub2);

		for (Iterator<String> iter = str.iterator( ); iter.hasNext( );) {
			String s = iter.next( );
			System.out.print(s);
		}

		for (String s : str) {
			System.out.print(s);
		}
	}
}