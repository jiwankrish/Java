package corejava;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);	
	    int value;
	    
		double Euro=.80;
		double USD;
		
		
		
		System.out.println("Enter the value  in Euro :");
		Euro=input.nextDouble();
		
		// 1Euro = 1.24 USD
		USD=Euro*1.24;
		System.out.println(Euro+ "EURO" + "is" +USD +"USD. (Conversion rate: 1 Euro = 1.24 USD)");
		
		
		
				
		
		
	}

}
