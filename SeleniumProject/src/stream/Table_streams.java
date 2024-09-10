package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Table_streams {

	public static void main(String[] args) {
		
		ArrayList<Integer> test = new ArrayList<> ();
		
		test.add(20);
		test.add(30);
		test.add(50);
		test.add(30);
		
		
		System.out.println(test);
		
//		String che =	test.stream().map(i->i*10).collect(Collectors.toList());
		
	     List<Integer> multipliedList = (List<Integer>) test.stream().map(i-> i * 10).collect(Collectors.toList());
	     
	     System.out.println(multipliedList);
}
}