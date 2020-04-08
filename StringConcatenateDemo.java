package in.satheesh.strings;

public class StringConcatenateDemo {

	public static void main(String[] args) {
		int value=20;
		String s1=String.valueOf(value);
		System.out.println(s1+10);
		
		String s="satheeshkumar";
		System.out.println("value :  "+s+"   hashcode : "+s.hashCode());
		s=s.concat("Subramanian");
		System.out.println(s+"============="+s.hashCode());

	}

}
