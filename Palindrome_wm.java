package Cpractice;

import java.util.Scanner;

public class Palindrome_wm {

	private void Syso() {
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev= rev+ str.charAt(i);
		}
	
		System.out.println("The reverse of the number is: "+rev);
		
		if(rev.equals(str)) {
			System.out.println("Its palindrome number: ");
		}
		else {
			
			System.out.println("its not palindrome number");
		}	
		
	} 
	
}
