package in.satheesh.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet<String>();
		s.add("SATHEESH");
		s.add("KUMAR");
		s.add("satheesh");
		s.add("kumar");
		s.add("SATHEESH");
		System.out.println(s);

	}

}
