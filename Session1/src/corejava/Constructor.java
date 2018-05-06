package corejava;

//Constructor is an instance method that usually has the same name as a class.
// and is used for assingned a new default value
// Constrctor sould always be  non static.
// Static variable cannot be used as constructor

public class Constructor {

	int age;
	int salary;
	int house;
	String name;
	
	Constructor(){
		
		int age= 30;
		int salary =65000;
		int house= 5075;
		String name ="John";

		System.out.println("The Age is "+age);
		System.out.println("The Annual Salary is "+salary);
		System.out.println("The House number is "+ house);
		System.out.println("The Name is " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor x= new Constructor ();
		
}
}