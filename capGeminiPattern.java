package in.satheesh.coreJbasics;
/*
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 */

public class capGeminiPattern {

	public static void main(String[] args) {
		int number =1;
		for(int i=1;i<= 4 ; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+ " ");
				++number;
			}
			System.out.println();
		}

	}

}
