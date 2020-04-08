package in.satheesh.demo;

import java.util.Scanner;

public class ThirdVariableSwapDemo {

	public static void main(String[] args)
	
	{
		int x,y,temp;
		System.out.println("Enter X and Y value : ");
		Scanner in =new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		System.out.println("Before Swapping : \n"+x+"\ny = " +y);
		
		temp = x;
		x =y ;
		y = temp;
		
		System.out.println("After Swapping : \n"+x+"\ny = "+y);
	}

}
