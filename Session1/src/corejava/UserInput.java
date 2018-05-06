package corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// For string	
	Scanner reader = new Scanner(System.in);
	System.out.println("What is your name");
	String name = reader.next();
	System.out.println("Your name is "+name);
	
		
  // For interger value
	Scanner reader1 = new Scanner(System.in);
	System.out.println("How old are you");
	String age = reader.next();
	System.out.println("Your age is "+age);
	
	}

}
