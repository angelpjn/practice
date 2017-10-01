import java.util.*;

public class MapToList {
	public static void main(String[ ] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>( );
		HashMap<String, ArrayList<String>> multiMap = 
            new HashMap<String, ArrayList<String>>( );

		hashMap.put("C", 12); // 삽입, (key, value)
		hashMap.put("A", 88);
		hashMap.put("N", 55);
		System.out.println("HashMap: Key 'A'에 해당하는 값: " + hashMap.get("A"));

		ArrayList<String> list = new ArrayList<String>( );
		list.add("sun"); // 추가
		list.add("moon");
		multiMap.put("planet", list); // 추가 <key, value>

		// Entry Set, iterator
		Set<Entry<String, ArrayList<String>>> setMap = multiMap.entrySet( );
		Iterator<Entry<String, ArrayList<String>>> itMap = setMap.iterator( );

		System.out.println("다중값을 갖는 HashMap 요소");
		while (itMap.hasNext( )) {
			Map.Entry<String, ArrayList<String>> entry =
                  (Map.Entry<String, ArrayList<String>>) itMap.next( );
			String key = entry.getKey( );
			List<String> values = entry.getValue( );
			System.out.println("Key = '" + key + "' 값 : " + values);
		}

		// HashMap keys 를 ArrayList 로 변환
		Set<String> keySet = hashMap.keySet( );
		List<String> keyList = new ArrayList<String>(keySet);

		System.out.println("#1 HashMap 키로 list 변환한 요소 : ");
		for (String key : keyList) {
			System.out.println(key);
		}

		// HashMap Values 을 ArrayList로 변환
		Collection<Integer> values = hashMap.values( );
		List<Integer> valueList = new ArrayList<Integer>(values);

		System.out.println("#2 list로 변환한 HashMap 값 :");
		for (Integer value : valueList) {
			System.out.println(value);
		}

		// Entry Set을 사용하여 HashMap을 ArrayList로 변환
		Set<Entry<String, Integer>> set = hashMap.entrySet( );
		List<Entry<String, Integer>> hashMapList = new ArrayList<>(set);
		Iterator<Entry<String, Integer>> it = hashMapList.iterator( );
		System.out.println("#3 list로 변환한 Entry : ");
		while (it.hasNext( )) {
			Entry<String, Integer> entry = it.next( );
			System.out.println(entry);
		}
	}
}