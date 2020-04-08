package in.satheesh.coreJbasics;

/*
 * private constructor is accessible in its own class where defined. A class with private constructor cannot be inherited by other classes. Used in Singleton design pattern. Used for extra security provision not to allow the instantiation in other classes.
Default constructor is accessible within the same class and also for all the classes within the same package.
protected constructor can be accessed from its own class, its subclasses, all other classes belonging to the same package and subclasses of other packages.
public constructor can be accessible from anywhere.
EJB3 specification says the entities should have either a no-argument protected or private constructor.
A class with both private and protected constructors available can be inherited; but subclass has the accessibility for protected constructors only.
 */
public class SuperConstructorcall {
	protected SuperConstructorcall()
	{
		System.out.println("This is protected constructor call");
	}

}
