package corejava;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//If a=10 b=20, get me b=1= and a=20.
		int a, b, temp;
		a=10;
		b=20;
		
		System.out.println("Enter a and b");
		Scanner in=new Scanner(System.in);
		
		System.out.println("Before Swaping\na= "+a+"\nb= "+b);
		
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping\na =" +a+"\nb="+b);
				
	
	}

}
