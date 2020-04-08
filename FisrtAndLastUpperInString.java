package in.satheesh.demo;

public class FisrtAndLastUpperInString {

	static String FirstAndLast(String str)
	{
		char[] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i] != ' ')
			{
				i++;
				ch[k]=(char)(ch[k] >='a' && ch[k] <='z' ? (ch[k] -32) : (int)ch[k]);
				ch[i-1]=(char)(ch[i-1] >='a' && ch[i-1] <='z' ? (ch[i-1] -32) : (int)ch[i-1]);
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s="hello java is very easy";
		System.out.println(s);
		System.out.println(FirstAndLast(s));
		}
}
