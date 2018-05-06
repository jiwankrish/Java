package corejava;

public class if_And_elseJAva {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 300;
		int j = 200;
		int a = 300;
		//operators in Java =<,>,=,<=,>=,!
		
		if (i<j) // condition
			
		System.out.println("I is less than J");
		else
		System.out.println("I is not Less Than J");
		
		if (i<a) // condition
			
		System.out.println("I is less than A");
		else
		System.out.println("I is not Less Than A");
		
	
		if (i==a)
			System.out.println("value of I and A are same");
		else
			System.out.println("Value of I and A are not same");
		
		if(j>a)
			System.out.println("J is Greater than A");
		
		if (j<a)
			{System.out.println("J is Greater than A");
			}
		if(!(i==a))// not equal example
		{System.out.println("value of I and A are not equal");
		
		}
		else
		{System.out.println("Value of i and a are equal"+"Value of i is "+i);
		}
		
		String name = "Kailash";
		String name1 = "Shan";
		if(name==name1)
		{
			System.out.println("Both of the names are same");	
		}
		else
		{
			System.out.println("Both of the nmes are not same ");
		}
		
	}
}


