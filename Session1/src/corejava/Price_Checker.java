package corejava;

import java.util.Scanner;

public class Price_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		class Shop
		{
		    public int roll_no;
		    public String name;
		    public double price;
		    Shop(int roll_no, String name, double price)
		    {
		        this.roll_no = roll_no;
		        this.name = name;
		        this.price = price;
		    }
		}

		        
		        int proNum;
		         // declares an Array of integers.
		        Shop[] arr;
		 
		        // allocating memory for 5 objects of type Student.
		        arr = new Shop[5];
		 
		        // initialize the first elements of the array
		        arr[0] = new Shop(10023,"Apple", 50);
		 
		        // initialize the second elements of the array
		        arr[1] = new Shop(20065,"Apricot", 90.0);
		 
		        // so on...
		        arr[2] = new Shop(30096,"Avocado", 30.2 );
		        arr[3] = new Shop(40038,"Banana", 20.9);
		        arr[4] = new Shop(50078,"Bilberry", 31.60);
		 
		        System.out.print("Enter Product Number: ");
		        Scanner scan = new Scanner(System.in);
		        
		        proNum= scan.nextInt();
		        
		        // accessing the elements of the specified array
		        for (int i = 0; i < arr.length; i++)
		            //System.out.println("Element at " + i + " : " + // arr[i].roll_no +" "+ arr[i].name);
		            if(proNum == (arr[i].roll_no))
		            {
		                System.out.println("Product # " + i + " : Part Number# " +  arr[i].roll_no +"   Dis: "+ arr[i].name + "   Price: $" + arr[i].price) ;
		                
		            }
		    

	

		
		
	}

}
