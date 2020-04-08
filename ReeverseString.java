package in.satheesh.demo;

import java.util.Scanner;

public class ReeverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		System.out.println("Reverese String is : " + reverse);
	}

}
