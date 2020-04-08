/**
 * 
 */
package in.satheesh.strings;

import java.util.HashMap;

/**
 * @author Satheesh
 *
 */
public class DuplicateString {

static void findDuplicateWord(String str)
{
	HashMap<String,Integer> hm =new HashMap<>();
String[] s = str.split(" ");
for (String temp :s)
{
	if(hm.get(temp) !=null)
	{
		hm.put(temp,hm.get(temp)+1);
	}
	else
	{
		hm.put(temp,1);
	}
}
System.out.println(hm);
}
 static void findDuplicateCharacters(String str) {
	 HashMap<Character,Integer> hm = new HashMap<>();
	for(int i=0;i< str.length();i++)
	{
		char c=str.charAt(i);
		if (hm.get(c) != null)
		{
			hm.put(c, hm.get(c)+1);
		}
		else
		{
			hm.put(c, 1);
		}
	}
	System.out.println("WORDS : "+hm);
	
}
public static void main(String[] args) {
	findDuplicateWord("This is Satheesh, I am am am learning java j2ee java");
	findDuplicateCharacters("SATHEESHKUMARDEEPIKA");
	}



}
