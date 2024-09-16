package practice;

public class Palindromealphabet {

	public static void main(String[] args) {
		
		String M="oko";

		
		StringBuffer ok = new StringBuffer( M);
	    ok.reverse();
	    
	    String data = ok.toString();
	    
	    if(data.equals(M)) {
	      
	    	System.out.println("Its palindrome");
	    	
	    }
	    else
	    {
	    	
	    	System.out.println("Its not palindrome");
	    }
	 
		
	}
}
