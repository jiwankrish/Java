package Day1;

import java.util.Scanner;

public class PriceAfterDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		double  dis,amount,markedprice,s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter markedprice ");	
	               
		markedprice=sc.nextDouble();
	 
	        System.out.println("Enter discount percentage ");	
	               
		dis=sc.nextDouble();			
		
	        s=100-dis;
	 
		amount= (s*markedprice)/100;
	 
		System.out.println("Amount after discount="+amount);
	}

}
