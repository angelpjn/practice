import java.io.*;
import java.util.*;

public class E0802 {
	public static void main(String[ ] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>( );
		list.add(0);
		list.add(1);

		int sum = 0;
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}