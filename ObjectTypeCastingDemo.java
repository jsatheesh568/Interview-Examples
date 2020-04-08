package in.satheesh.demo;


class parenti
{
	public void methodone()
	{
		System.out.println("A");
	}
}
class childi extends parenti
{
	@Override
	public void methodone()
	{
		System.out.println("B");
	}
	public void methodtwo()
	{
		System.out.println("C");
	}
}
public class ObjectTypeCastingDemo {

	public static void main(String[] args) {
		childi c = new childi();
		c.methodone();
		c.methodtwo();
		((parenti)c).methodone();
		c.methodtwo();
		parenti p = new childi();
		((childi)p).methodone(); // class cast Exception if we created it for parenti
parenti p2 =new parenti();
p2.methodone();

	}

}
