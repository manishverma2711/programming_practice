package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream_loop {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(40);
		num.add(35);
		
	List<Integer> check = num.stream().filter(nu->nu % 2==0).collect(Collectors.toList());
				
		 System.out.println(check);
	}
	
	
}
