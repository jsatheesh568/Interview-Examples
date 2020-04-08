package in.satheesh.excephandling;
// Below Example is for checked(compile time) or unchecked(Run time) Exception?  ---unchecked Exception
/*
 * java app is connected to outer resource is called checked exception
 * Few other checked exceptions are SQLException,IOException,ClassNotFoundException and InvocationTargetException.
 * 
 * java app is not connected to any outside resources is called unchecked exception
 * Few other uncheckedException(compiler wont handle, are not checked at compile time they occurs are runtime
 * like NullpointerException,ArrayIndexOutOfBoundException, ArithmeticException,IllegalArgumentException and NumberFormatException.
 */
public class Test {

	public static void main(String[] args) {
			doStuff();
	
		}
		public static void doStuff()
		{
			doMoreStuff();
		}
		public static void doMoreStuff()
		{
			System.out.println(10/0);
		}

}
