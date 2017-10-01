import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void printMap(Map mp) {
		Iterator it = mp.entrySet( ).iterator( );
		while (it.hasNext( )) {
			Map.Entry pair = (Map.Entry) it.next( );
			System.out.println(pair.getKey( ) + " = " + pair.getValue( ));
			it.remove( ); // ConcurrentModificationException 방지
		}
	}

	public static void main(String[ ] agrs) {
		Map<String, String> map = new HashMap<String, String>( );
		map.put("이름", "홍 길동");
		map.put("나이", "20");
		map.put("주소", "경기도 부천시");

		if (map.containsKey("이름")) {
			System.out.println(map.get("이름")); // value 알아내기
		}
		// 방법1: Iterator 사용한 순차적 접근
		Iterator<String> keys = map.keySet( ).iterator( );
		System.out.print("[#1 key/value] ");
		while (keys.hasNext( )) {
			String key = keys.next( );
			System.out.print(key + " / " + map.get(key) + ", ");
		}

		System.out.print("\n[#2 key/value] ");
		// 방법2: For-Each loop
		for (Map.Entry<String, String> e : map.entrySet( )) {
			System.out.print(e.getKey( ) + " / " + e.getValue( ) + ", ");
		}

		System.out.println("\n[#3 key/value] ");
		// 방법3: key와 value에 의한 순차적 접근(iterating)
		for (String key : map.keySet( )) {
			System.out.print(key + " / " + map.get(key) + ", ");
		}

		for (String value : map.values( )) {
			System.out.print("값: " + value + ", ");
		}
		System.out.print("\n[#4 key/value] ");

		Object[ ] ar = map.keySet( ).toArray( ); // HashMap을 배열로 변환

		for (int i = 0; i < ar.length; i++) {
			String key = (String) ar[i];
			System.out.print(key + " / " + map.get(key) + ", ");
		}
		System.out.print("\n[#5 key/value] ");

		Collection<String> coll = map.values( );
		Iterator<String> iter = coll.iterator( );

		while (iter.hasNext( )) {
			String obj = iter.next( );
			System.out.print("값: " + obj + ", ");
		}
		System.out.print("\n[#6 key/value] ");

		Set<String> set = map.keySet( );
		Iterator<String> lters = set.iterator( );
		while (lters.hasNext( )) {
			String key = lters.next( );
			String value = map.get(key);
			System.out.print(key + " / " + value + ", ");
		}
		System.out.println( );

	}
}