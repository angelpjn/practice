import java.util.*;
public class E0805 {
	public static void main(String[ ] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>( );

		hm.put("�ѱ�", 51395238);
		hm.put("�̱�", 318892103);
		hm.put("�߱�", 1355692576);
		hm.put("�ε�", 1236344631);
		hm.put("�ε��׽þ�", 253609643);

		Set set = hm.entrySet( );
		Iterator it = set.iterator( );
		while (it.hasNext( )) {
			Map.Entry entry = (Map.Entry) it.next( );
			System.out.print("(Ű: " + entry.getKey( ) + " , ��): ");
			System.out.println(entry.getValue( ));
		}

		int var = hm.get("�ѱ�");
		System.out.println("(Ű �ѱ��� ��): " + var);

		hm.remove("�ε��׽þ�"); // Ű5�� �ش� �� ����
		System.out.println("[������ ���� ��]");
		Set set2 = hm.entrySet( );
		Iterator it2 = set2.iterator( );
		while (it2.hasNext( )) {
			Map.Entry entry2 = (Map.Entry) it2.next( );
			System.out.print("(Ű: " + entry2.getKey( ) + " , ��): ");
			System.out.println(entry2.getValue( ));
		}
	}
}