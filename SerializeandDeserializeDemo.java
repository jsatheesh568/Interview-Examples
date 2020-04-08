/**
 * 
 */
package in.satheesh.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Satheesh
 * Only the objects of those classes can be serialized which are implementing java.io.Serializable interface.
Serializable is a marker interface (has no data member and method). It is used to “mark” java classes so that objects of these classes may get certain capability. Other examples of marker interfaces are:- Cloneable and Remote.

Points to remember
1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
4. Constructor of object is never called when an object is deserialized.
5. Associated objects must be implementing Serializable interface.
 * 
 *In case of transient variables:- A variable defined with transient keyword is not serialized during serialization process.
 *This variable will be initialized with default value during deserialization. (e.g: for objects it is null, for int it is 0).
In case of static Variables:- A variable defined with static keyword is not serialized during serialization process.
This variable will be loaded with current value defined in the class during deserialization.

SerialVersionUID
The Serialization runtime associates a version number with each Serializable class called a SerialVersionUID, which is used during Deserialization to verify that sender and reciever of a serialized object have loaded classes for that object which are compatible with respect to serialization. 
If the reciever has loaded a class for the object that has different UID than that of corresponding sender’s class, the Deserialization will result in an InvalidClassException
 */


class Demos implements java.io.Serializable
{
	private static final long serialversionUID = 129348938L; 
	public int a;
	public String b;
	/**
	 * @param a
	 * @param b
	 */
	public Demos(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public String getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(String b) {
		this.b = b;
	}
	
}
public class SerializeandDeserializeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demos obj =new Demos(1,"satheesh");
		String filename = "C://Satheesh/File.ser";
		try {
			 //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(obj); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
		} catch(IOException e)
		{
			System.out.println(e);
		}
		

        Demos object1 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (Demos)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }

	}

}
