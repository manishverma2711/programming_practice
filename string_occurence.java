package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class string_occurence {

	public static void main(String[] args) {
		
		ArrayList<String> oc= new ArrayList<String>();
		
		oc.add("pen");
		oc.add("pencil");
		oc.add("pen");
		oc.add("scale");
		
		String check = "pen";
		int count=0;
	
		Iterator<String> str = oc.iterator();
		
		while(str.hasNext()) {
			
			if(str.next().equals(check)) {
				
				count++;
			}
		}
		
		System.out.println(oc);
		System.out.println(count);
	}
}
