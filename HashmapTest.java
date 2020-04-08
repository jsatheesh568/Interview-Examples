/**
 * 
 */
package in.satheesh.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Satheesh
 *
 */
public class HashmapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1= new Employee("ram", 1000);
        Employee e2= new Employee("sai", 1001);
        Employee e3= new Employee("krishna", 1002);
        
        Map<Employee, String> map= new HashMap<Employee, String>();
        
        map.put(e1, "employee1");
        map.put(e2, "employee2");
        map.put(e3, "employee3");        
    
        
        for (Entry<Employee, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey().getName() +"-"+entry.getKey().getid() + "-" + entry.getValue());
        }
        
        System.out.println(map.get(e3));        
        System.out.println(map.get(new Employee("krishna", 1002)));
        
    }
    
    
}
class Employee{    
 
    String name;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
 
