import java.util.*;
public class E0805 {
	public static void main(String[ ] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>( );

		hm.put("한국", 51395238);
		hm.put("미국", 318892103);
		hm.put("중국", 1355692576);
		hm.put("인도", 1236344631);
		hm.put("인도네시아", 253609643);

		Set set = hm.entrySet( );
		Iterator it = set.iterator( );
		while (it.hasNext( )) {
			Map.Entry entry = (Map.Entry) it.next( );
			System.out.print("(키: " + entry.getKey( ) + " , 값): ");
			System.out.println(entry.getValue( ));
		}

		int var = hm.get("한국");
		System.out.println("(키 한국의 값): " + var);

		hm.remove("인도네시아"); // 키5와 해당 값 제거
		System.out.println("[제거한 후의 값]");
		Set set2 = hm.entrySet( );
		Iterator it2 = set2.iterator( );
		while (it2.hasNext( )) {
			Map.Entry entry2 = (Map.Entry) it2.next( );
			System.out.print("(키: " + entry2.getKey( ) + " , 값): ");
			System.out.println(entry2.getValue( ));
		}
	}
}