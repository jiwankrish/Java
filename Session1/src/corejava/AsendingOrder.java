package corejava;

import java.util.Scanner;

public class AsendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ask user for a number and then ask user for second number 
		//once you have it print out all numbers between them in ascending order.
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= input.nextInt();
		
		int[] a= new int [n];
		int i,j,temp=0;
		
		System.out.println("Enter " +n+" Array Elements:");
		for(i=0; i<n; i++);
		a[i]=input.nextInt();
		
		//Print all Array element.....
		System.out.println("\nArray Elements are: ");
		for(i=0; i<n; i++) {
			System.out.println("  " +a[i]);	
		}
		// Arrange Array in Ascending Order......
		for(i=0;i<n;i++);
			for(j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;				
					
				}
			}
	// Print Array in Ascending order..........................		
	System.out.println("\nArray Elements in Asending Order: " );
	for(i=0; i<n; i++) {
		System.out.println("  " +a[i] );
		
	}
	}

}
