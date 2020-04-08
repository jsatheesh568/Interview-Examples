   package in.satheesh.demo;

import java.util.HashMap;
import java.util.Map;

public class StringOccurenceDemo {
	static void charactercount(String InputString) {
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		char[] strArray = InputString.toCharArray();
		for (char c : strArray) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			} else {
				charcount.put(c, 1);
			}
		}
		for (Map.Entry entry : charcount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "SATHEESHKUMAR";
		charactercount(str);

	}

}
