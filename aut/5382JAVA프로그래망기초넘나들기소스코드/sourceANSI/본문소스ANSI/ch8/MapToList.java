import java.util.*;

public class MapToList {
	public static void main(String[ ] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>( );
		HashMap<String, ArrayList<String>> multiMap = 
            new HashMap<String, ArrayList<String>>( );

		hashMap.put("C", 12); // ����, (key, value)
		hashMap.put("A", 88);
		hashMap.put("N", 55);
		System.out.println("HashMap: Key 'A'�� �ش��ϴ� ��: " + hashMap.get("A"));

		ArrayList<String> list = new ArrayList<String>( );
		list.add("sun"); // �߰�
		list.add("moon");
		multiMap.put("planet", list); // �߰� <key, value>

		// Entry Set, iterator
		Set<Entry<String, ArrayList<String>>> setMap = multiMap.entrySet( );
		Iterator<Entry<String, ArrayList<String>>> itMap = setMap.iterator( );

		System.out.println("���߰��� ���� HashMap ���");
		while (itMap.hasNext( )) {
			Map.Entry<String, ArrayList<String>> entry =
                  (Map.Entry<String, ArrayList<String>>) itMap.next( );
			String key = entry.getKey( );
			List<String> values = entry.getValue( );
			System.out.println("Key = '" + key + "' �� : " + values);
		}

		// HashMap keys �� ArrayList �� ��ȯ
		Set<String> keySet = hashMap.keySet( );
		List<String> keyList = new ArrayList<String>(keySet);

		System.out.println("#1 HashMap Ű�� list ��ȯ�� ��� : ");
		for (String key : keyList) {
			System.out.println(key);
		}

		// HashMap Values �� ArrayList�� ��ȯ
		Collection<Integer> values = hashMap.values( );
		List<Integer> valueList = new ArrayList<Integer>(values);

		System.out.println("#2 list�� ��ȯ�� HashMap �� :");
		for (Integer value : valueList) {
			System.out.println(value);
		}

		// Entry Set�� ����Ͽ� HashMap�� ArrayList�� ��ȯ
		Set<Entry<String, Integer>> set = hashMap.entrySet( );
		List<Entry<String, Integer>> hashMapList = new ArrayList<>(set);
		Iterator<Entry<String, Integer>> it = hashMapList.iterator( );
		System.out.println("#3 list�� ��ȯ�� Entry : ");
		while (it.hasNext( )) {
			Entry<String, Integer> entry = it.next( );
			System.out.println(entry);
		}
	}
}