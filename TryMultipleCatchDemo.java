package in.satheesh.demo;

public class TryMultipleCatchDemo {
	void method1() throws ArithmeticException{  
		int r=6/0;
		System.out.println(r);
		throw new ArithmeticException("Calculation error"); 
	   }  
	   void method2() throws ArithmeticException{  
		   System.out.println("method2..");
		method1();  
	   }  
	   void method3(){  
		try{  
			System.out.println("method 3..");
		   method2();  
		}
		catch(ArithmeticException e){
		   System.out.println("ArithmeticException handled");
		}  
	   }  
	   public static void main(String args[]){  
		   TryMultipleCatchDemo obj=new TryMultipleCatchDemo();  
		obj.method3();  
		System.out.println("End Of Program");  
	   }  
	}