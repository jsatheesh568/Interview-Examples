package in.satheesh.strings;

public class StringLiteralDemo {

	public static void main(String[] args) {
	String s="satheesh";
	String s4="satheesh";
	String s1="kumar";
	String s2="SATHEESH";
	String joinstring = String.join("-", "SATHEESH","KUMAR","SUBRAMANIAN");
	System.out.println(joinstring);
	String date=String.join("/", "01","08","2020");
	System.out.println(date);
	String s3 = new String("satheesh");
	System.out.println("S value : "+s+"   Hashcode : "+s.hashCode() );
	System.out.println("S1 value : "+s1+"  Hashcode : "+s1.hashCode() );
	System.out.println("S2 value : "+s2+"  Hashcode : "+s2.hashCode() );
	System.out.println("S3 value : "+s3+"  Hashcode : "+s3.hashCode() );
	System.out.println("S4 value : "+s4+"  Hashcode : "+s4.hashCode() );
	System.out.println(s.equals(s2)); //false
	System.out.println(s.equals(s3));   // true checking value alone
	
	System.out.println(s == s2);  //false
	System.out.println(s == s3);  // false checking value and address
	
	System.out.println(s.equals(s4));  // true
	System.out.println(s == s4);      //true
	System.out.println(s4 == s3);   //false
	}
	
	

}
