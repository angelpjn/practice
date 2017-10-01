import java.io.*;
import java.util.*;

public class E0707 {
   public static void main(String args[ ]) throws IOException {
	int sum = 0;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("ÀÔ·Â(3 + 5): ");
	String data = in.readLine( );
	StringTokenizer st = new StringTokenizer(data, "+ ");
	while (st.hasMoreTokens( )) {
		int a = Integer.parseInt(st.nextToken( ));
		sum = sum + a;
	}
	System.out.println("ÃÑ°è = " + sum);
	System.out.println( );
   }
}