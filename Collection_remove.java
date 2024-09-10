package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_remove {

	public static void main(String[] args) {
		ArrayList<Integer> id = new ArrayList<>();
		
		id.add(20);
		id.add(30);
		id.add(42);
		id.add(51);
		id.add(63);
		
		Iterator<Integer> li = id.iterator();
	
		while (li.hasNext()) {
			
			Integer check = li.next();
			
			if(check %2==0) {
				
				li.remove();
			
			}			
		}
		System.out.println(id);
	}
	
}
