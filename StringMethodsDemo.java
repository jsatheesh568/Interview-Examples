package in.satheesh.strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s="             satheesh";
		System.out.println(s.trim());
		System.out.println(s.charAt(18  ));
		System.out.println(s.length());
		String s1=s.intern();
		System.out.println(s1+"kumar");
		String s2= new String("kumar");
		String s3=s2.intern();
		System.out.println(s3);
		String s4="kumar";
		String s5=s4.intern();
		System.out.println(s5 );
		
	}

}

