class Tuple<K, V> {
	private final K k;
	private final V v;

	public Tuple(K key, V value) {
		k = key;
		v = value;
	}

	public String toString( ) {
		return "KEY: " + k + " , VALUE: " + v;
	}
}

public class E0804 {
	public static void main(String[ ] args) {
		Tuple<String, Integer> t = new Tuple<String, Integer>("can", 1);
		System.out.println(t);
	}
}