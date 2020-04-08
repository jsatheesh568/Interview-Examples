package in.satheesh.coreJbasics;
/*
 * this is a reserved keyword in java i.e, we can’t use it as an identifier.
 * this is used to refer current-class’s instance as well as static members
 */
public class This1demo {
	int first = 22; 
    int second = 33; 
  
    void garcia(int a, int b) 
    { 
        a = this.first; 
        b = this.second;
        System.out.println("Garia method");
        System.out.println("============");
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(a); 
        System.out.println(b); 
    } 
  
    void louis(int m, int n) 
    { 
        this.first = m; 
        this.second = n; 
        System.out.println("Louis Method");
        System.out.println("============");
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(m); 
        System.out.println(n); 
    } 
  

	public static void main(String[] args) {
		new This1demo().garcia(100, 200); 
        new This1demo().louis(1, 2); 

	}

}
