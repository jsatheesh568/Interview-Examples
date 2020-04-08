/**
 * 
 */
package in.satheesh.strings;

/**
 * @author Satheesh
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="satheesh";
		String s2="satheesh";
		String s3="SATHEESH";
		String s4="sateesh";
		String s11= new String("satheesh");
		String s12=new String("SATHEESH");
		boolean s5 = s1.equals(s11); 
		System.out.println("s1.equals(s11)"+s5);
		boolean s6= s2.equals(s3);
		System.out.println("s2.equals(s3)"+s6); 
		boolean s7=s3.equals(s4);
		System.out.println("s3.equals(s4)"+s7);
		boolean s8 = (s1 == s11);
		System.out.println("(s1 == s11)"+s8);
		boolean s9 = (s2 == s3);
		System.out.println("(s2 == s3)"+s9);
		boolean s10 = (s3 == s4);
		System.out.println("(s3 == s4)"+s10);
		}

}
