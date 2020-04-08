package in.satheesh.strings;

public class InstanceTest{  
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode()+""+str);  
        str=str+"tpoint";  
        System.out.println(str.hashCode()+""+str); 
        String str1=new String("SATHEESH");
        System.out.println(str1.hashCode()+""+str1);
        
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode()+""+sb);
        sb.append("tpoint");  
        System.out.println(sb.hashCode()+""+sb);  
        
        System.out.println("Hashcode test of StringBuilder:");  
        StringBuilder sba=new StringBuilder("java");  
        System.out.println(sba.hashCode() +""+sba);  
        sba.append("tpoint");  
        System.out.println(sba.hashCode()+""+sba);  
    }  
}  