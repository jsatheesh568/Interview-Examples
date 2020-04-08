package in.satheesh.excephandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkedExceptionDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		try {
		FileReader file = new FileReader("c:\\satheesh\\test\\a.txt");
		BufferedReader br= new BufferedReader(file);
		for (int counter=0 ; counter <3; counter++)
		{
			System.out.println(br.readLine());
			
		}
		br.close(); 
		}catch(IOException e)
		{
			System.out.println(e);
		}catch (Exception ie)
		{
			System.out.println(ie);
		}
		
		 
	}

}
