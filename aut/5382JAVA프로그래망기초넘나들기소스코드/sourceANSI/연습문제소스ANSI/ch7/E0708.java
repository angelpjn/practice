import java.io.*;
import java.util.*;

public class E0708 {
   public static void main(String args[ ]) throws IOException {
	int sum = 0;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("�Է�(010-1234-5678): ");
	String data = in.readLine( );
	StringTokenizer st = new StringTokenizer(data, "- ");
	System.out.println(st.countTokens( )); // ��ū ����
	while (st.hasMoreTokens( )) {
		System.out.print(st.nextToken( ) + "\t");
	}
        System.out.println(st.countTokens( ));
	System.out.println( );
	}
}