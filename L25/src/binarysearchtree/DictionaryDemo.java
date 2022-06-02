package binarysearchtree;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary<Integer, String> dictionary = new DictionaryBST<>();
		System.out.println("true: " + dictionary.isEmpty());
		System.out.println("0: " + dictionary.size());

		dictionary.put(8, "hans");
		dictionary.put(3, "viggo");
		System.out.println("false: " + dictionary.isEmpty());
		System.out.println("2: " + dictionary.size());

		System.out.println("hans: " + dictionary.get(8));

		dictionary.put(7, "bent");
		dictionary.put(2, "lene");
		System.out.println("false: " + dictionary.isEmpty());
		System.out.println("4: " + dictionary.size());
		System.out.println("viggo: " + dictionary.remove(3));

		System.out.println("3: " + dictionary.size());

		System.out.println("hans: " + dictionary.put(8, "Ida"));
		System.out.println("Ida: " + dictionary.get(8));

	}
}
