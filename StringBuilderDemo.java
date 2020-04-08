package in.satheesh.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("SATHEESH");
		System.out.println(sb);

		sb.insert(0, "Subramanian");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb  );
	}

}
