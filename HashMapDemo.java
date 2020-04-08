/**
 * 
 */
package in.satheesh.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Satheesh
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		String s1="fb";
		String s2="fb";
		Map<String,Integer> map = new HashMap<>();
		map.put("aaa",1);
		map.put("bbb",2);
		map.put(null, 3);
		map.put(s1,4);
		map.put(s2, 5);
		System.out.println(map);

	}

}
