package corejava;

import java.util.Scanner;

public class ArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create A String array with 10 items ask the user for a
		//String and let users know if that is your array or not.
		
		
		int length;
		Scanner input= new Scanner(System.in);
		

		System.out.println("How Many names you are entering");
		length= input.nextInt();
		
		String[] names= new String [length];
		for(int counter=0;counter<length; counter++)
		{
		System.out.println("Enter the names" + (counter+1));
		names[counter]=input.next();
				
		}
		
		input.close();
		
		System.out.println(" The Following names are");
		for(int counter=0;counter<length; counter++) 
		{
			System.out.println(names[counter]);
			
		
		
	}

}
}