package Cpractice;

public class programprac {

	public static void main(String[] args) {
		
		int a=0, b=1;
		int c;
		System.out.print(a+ " "+ b);
		for(int i=1;i<10;i++)
		{
			c=a+b;	  
			a=b;
			b=c;
			
	    System.out.print( " "+ c +" ");
			
			
		}
		
		
		
		
	}
}
