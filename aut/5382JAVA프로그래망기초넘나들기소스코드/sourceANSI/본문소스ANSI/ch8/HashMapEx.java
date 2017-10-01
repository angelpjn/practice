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
			it.remove( ); // ConcurrentModificationException ����
		}
	}

	public static void main(String[ ] agrs) {
		Map<String, String> map = new HashMap<String, String>( );
		map.put("�̸�", "ȫ �浿");
		map.put("����", "20");
		map.put("�ּ�", "��⵵ ��õ��");

		if (map.containsKey("�̸�")) {
			System.out.println(map.get("�̸�")); // value �˾Ƴ���
		}
		// ���1: Iterator ����� ������ ����
		Iterator<String> keys = map.keySet( ).iterator( );
		System.out.print("[#1 key/value] ");
		while (keys.hasNext( )) {
			String key = keys.next( );
			System.out.print(key + " / " + map.get(key) + ", ");
		}

		System.out.print("\n[#2 key/value] ");
		// ���2: For-Each loop
		for (Map.Entry<String, String> e : map.entrySet( )) {
			System.out.print(e.getKey( ) + " / " + e.getValue( ) + ", ");
		}

		System.out.println("\n[#3 key/value] ");
		// ���3: key�� value�� ���� ������ ����(iterating)
		for (String key : map.keySet( )) {
			System.out.print(key + " / " + map.get(key) + ", ");
		}

		for (String value : map.values( )) {
			System.out.print("��: " + value + ", ");
		}
		System.out.print("\n[#4 key/value] ");

		Object[ ] ar = map.keySet( ).toArray( ); // HashMap�� �迭�� ��ȯ

		for (int i = 0; i < ar.length; i++) {
			String key = (String) ar[i];
			System.out.print(key + " / " + map.get(key) + ", ");
		}
		System.out.print("\n[#5 key/value] ");

		Collection<String> coll = map.values( );
		Iterator<String> iter = coll.iterator( );

		while (iter.hasNext( )) {
			String obj = iter.next( );
			System.out.print("��: " + obj + ", ");
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