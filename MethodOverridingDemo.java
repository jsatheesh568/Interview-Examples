package in.satheesh.demo;


class parente
{
	public void property()
	{
		System.out.println("cash+ Land+gold");
	}
	public void marry()
	{
		System.out.println("XYZ");   //overridden method
	}
}
class childe extends parente
{
	@Override
	public void marry()
	{
		System.out.println("abcd /efgh / ijk");    //overriding method
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		parente p = new parente();
		p.marry();
		childe c = new childe();
		c.marry();
		parente p1 = new childe ();
		p1.marry();
		

	}

}
