package in.satheesh.coreJbasics;

 class demo{
	
	private int a=10;
	protected void display()
	{
		System.out.println(" A value : "+a);
	}
	
	
}

public class AccessModifiersDemo {

	public static void main(String[] args) {


		demo ab = new sample();
		ab.display();
		
	}

}
class sample extends demo{
	//int b=a; //The field demo.a is not visible
	public void display()
	{
		System.out.println("sanple method");
	}
	
}