package in.satheesh.demo;

import java.util.Scanner;

public class ReverseAnArrayDemo {

	public static void main(String[] args) {
		int n, i , j=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		n= s.nextInt();
		int array[] = new int[n];
		int rev[] = new int[n];
		System.out.println("Enter "+n+"Elements :");
		for(i=0;i< n; i++)
		{
			array[i] = s.nextInt();	
		}
		System.out.println("Reverse of an array is :");
		for (i=n;i>0;i--,j++)
		{
			rev[j] = array[i-1];
			System.out.println(rev[j]);
		}

	}

}
