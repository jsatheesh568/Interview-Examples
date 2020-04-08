package in.satheesh.coreJbasics;
/*
 * super is a reserved keyword in java i.e, we can’t use it as an identifier.
 *  super is used to refer super-class’s instance as well as static members
 */

 
  
class Base extends Superdemo { 
    void rr() 
    { 
        // referring parent class(i.e, class Parent) 
        // instance variable(i.e, a) 
        System.out.println(super.a); 
  
        // referring parent class(i.e, class Parent) 
        // static variable(i.e, b) 
        System.out.println(super.b); 
    } 
}
public class Superdemo {
	int a = 10; 
	  
    // static variable 
    static int b = 20; 
	public static void main(String[] args) {
		 // Uncomment this and see here you get  
        // Compile Time Error since cannot use 'super'  
        // in static context. 
        // super.a = 700; 
        new Base().rr(); 

	}
}


