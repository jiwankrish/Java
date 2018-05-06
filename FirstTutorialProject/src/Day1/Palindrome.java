package Day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str = input.nextLine();
		
		String reverse = "";
		for(int i= str.length()-1; i>=0; i--)
			reverse += str.charAt(i);
		
		if (reverse.equalsIgnoreCase(str))
			System.out.println(" Palindrome");
		else {
			System.out.println("NOT a Palindrome");
	}
		
		
	}

}
