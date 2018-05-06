package corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter the input String");
		    String name = input.nextLine();
			
			String reverse = "";
			
			for(int i= name.length()-1; i>=0; i--)
				reverse =reverse+name.charAt(i);
			
			if (name.equals(reverse))
		
				System.out.println(" Palindrome");
			else {
				System.out.println("NOT a Palindrome");
		 
		  
		    } 	
		

	}

}
