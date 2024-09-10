package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collection_evenndodd {
	
	public static void main(String[] args) {
		ArrayList<Integer> id = new ArrayList<>();
		
		id.add(20);
		id.add(30);
		id.add(42);
		id.add(51);
		id.add(63);
		
		Iterator<Integer> li = id.iterator();
		
		while (li.hasNext()) {
			Integer num = li.next();
			
			if(num %2==0) {
				System.out.println("Its even number" + num);
			}
			else
			{
				System.out.println("Its odd number" + num);
			}
			
		}
		}

}
