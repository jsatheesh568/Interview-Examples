package in.satheesh.strings;
import in.satheesh.strings.Human;
public class Test {

	public static void main(String[] args) {
		Human satheesh = new Human(1001,"SATHEESH");
		Human Deepika = new Human(1001,"DEEPIKA");
		System.out.println(satheesh.equals(Deepika));
		System.out.println(satheesh.hashCode());
		System.out.println(Deepika.hashCode());

		
		String str1 = new String("SATHEESH");
		String str2 = new String("SATHEESH");
		String str5 = new String("Deepika");
		String str3 ="kumar";
		String str4="kumar";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str5));
		System.out.println(str3.equals(str4));
		
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
	}

}
