package in.satheesh.collections;

/*
 * Cloneable interface : Cloneable interface is present in java.lang package. There is a method clone() in Object class. 
 * A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class.
Invoking Object’s clone method on an instance of the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException being thrown. 
By convention, classes that implement this interface should override Object.clone() method.


 */

public class ClonableinterfaceDemo implements Cloneable   {

	private static ClonableinterfaceDemo  cid = new ClonableinterfaceDemo();
	
	private ClonableinterfaceDemo()
	{
		
	}
	private static ClonableinterfaceDemo getInstance()
	{
		return cid;
	}
	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// Overriding clone() method of Object class
	public Object clone() throws CloneNotSupportedException {
		return cid;
	}

	public static void main(String[] args) {
		ClonableinterfaceDemo obj1 = new ClonableinterfaceDemo();
	      try {
		obj1.setDname("Obj 1 value");
		//Cloning obj1 into obj2
		ClonableinterfaceDemo obj2 = (ClonableinterfaceDemo) obj1.clone();
				
		//Displaying both the objects content
		System.out.println("Obj 1 value: "+obj1.getDname());
		System.out.println("Obj 2 value: "+ obj2.getDname());
		ClonableinterfaceDemo ci = cid.getInstance();
		System.out.println("Obj 1 hashcode value: "+ci.hashCode());
		ClonableinterfaceDemo ci2 = (ClonableinterfaceDemo) ci.clone();
		System.out.println("Obj 2 hashcode value: "+ci2.hashCode());		
		//Setting up name in obj2
		obj2.setDname("obj2 value");
				
		//Displaying both the objects content
		System.out.println("Obj 1 value: "+obj1.getDname());
		System.out.println("Obj 2 value: "+obj2.getDname());
		System.out.println("Obj 1 hashcode value: "+obj1.hashCode());
		System.out.println("Obj 2 hashcode value: "+obj2.hashCode());
	      } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
		}

	}

}
