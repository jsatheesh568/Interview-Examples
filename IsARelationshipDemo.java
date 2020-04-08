package in.satheesh.demo;

class parent
{
	public void methodone()
	{
		System.out.println("Parent Method.....");
	}
	public void methodtwo()
	{
		System.out.println("Parent 2 Method....");
	}
}
class child extends parent
{
	@Override
	public void methodone()
	{
		System.out.println("Child1 Method.....");
	}
	@Override
	public void methodtwo()
	{
		System.out.println("child 2 Method.....");
	}
}
public class IsARelationshipDemo {

	public static void main(String[] args) {
		parent p = new parent();
		p.methodone();
		p.methodtwo();
		System.out.println(p.hashCode());
		
		child c = new child();
		c.methodone();
		c.methodtwo();
		System.out.println(c.hashCode());
		parent p1 = new child();
		p1.methodone(); // if we use static in the methods it could be act as a method hiding
		p1.methodtwo();  // Method type is undefined in parent if methodtwo is not in parent
		System.out.println(p1.hashCode());
		//child c1=new parent();   //cannot convert from parent to child
		

	}

}
