package Cpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Prac_7day {
	
	public static void main(String[] args) {
		ArrayList<Integer> id = new ArrayList<>();
		
		id.add(20);
		id.add(30);
		id.add(42);
		id.add(51);
		
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


