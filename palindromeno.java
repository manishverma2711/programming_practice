package Cpractice;

public class palindromeno {
 
	public static void main(String[] args) {
		 
		String name = "HAAH";
		
		
		StringBuffer rev = new StringBuffer(name);
	    rev.reverse();
	    String ok = rev.toString();
	    
	   if( name.equals(ok))
	   {
		   System.out.println("The string is a palindrome");
	   }
	   else
	   {
		   System.out.println("The string is not a palindrome number");
	   }
		  
	
	}
	
}
