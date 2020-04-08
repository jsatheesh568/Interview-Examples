package in.satheesh.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); 
		//CopyOnWriteArrayList<Integer>al= new CopyOnWriteArrayList<Integer>(new Integer[] {1,2,3,4,5,6});
		
		  al.add(1); al.add(2); al.add(3); al.add(4); al.add(5);
		 
  
        Iterator<Integer> itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 2) { 
                // will not throw Exception 
                itr.remove(); 
            } 
        } 
  
        System.out.println(al); 
  
        itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 3) { 
                // will throw Exception on 
                // next call of next() method 
                al.remove(3); 
            } 
        } 

	}

}
