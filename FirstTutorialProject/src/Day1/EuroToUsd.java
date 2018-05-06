package Day1;

import java.util.Scanner;

public class EuroToUsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
		double Euro;
		double USD;
		
		Scanner input = new Scanner(System.in);	
	    
		System.out.println("Enter the Amount  in Euro :");
		Euro=input.nextDouble();
		
		// 1Euro = 1.2 USD
		USD=Euro*1.2;
		System.out.println(Euro+ "EURO" + "is" +USD +"USD. (Conversion rate: 1 Euro = 1.2 USD)");
		
		
		
		
	}

}
