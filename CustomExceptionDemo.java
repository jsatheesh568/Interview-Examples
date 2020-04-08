package in.satheesh.demo;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class CustomExceptionDemo {
	static void validate(int age) throws InvalidAgeException
	{
		if (age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("Valid one for vote");
	}

	public static void main(String[] args) {
	try {
		validate(19);
	}catch(Exception e) {
	System.out.println(e);

	}
	}

}
