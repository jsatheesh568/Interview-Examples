package in.satheesh.demo;

public class MethodOverloadingDemo {
	public void methodone(int i) {
		System.out.println("Int - arg Method....");
	}

	public void methodone(float f) {
		System.out.println("float-arg method....");
	}
	
	public void methodone(String s)
	{
		System.out.println("String Argument.....");
	}
	
	public void methodone(Object obj)
	{
		System.out.println("Objec Method.....");
	}

	public void methodone(StringBuffer stb)
	{
		System.out.println("String Buffer Method");
	}
	public static void main(String[] args) {

		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.methodone('a');
		mod.methodone(1);
		mod.methodone(10.5f);
		
		mod.methodone("SATHEESH");
		mod.methodone(new Object());
		//mod.methodone(null);  //methodone(String) shows ambiguity after we declared string buffer
		mod.methodone(new StringBuffer("SATHEESH"));
	}

}
