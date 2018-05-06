package corejava;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		country();
		state();
		 age();
		 addition(8,9);
		 massaddition(10,15,20,25);
		}

	
	public static void country() {
	
	System.out.println("i am from Mars");
}
	public static void state() {	
		System.out.println("i am from Texas");
}
	
	public static void age() {	
		int x=9;
	
		System.out.println(x);
	}
	public static void addition(int a, int b) {	
		int add=a+b;
	
		System.out.println(add);
}
	
	public static void massaddition(int a, int b, int c, int d) {	
		int add=a+b+c+d;
		
		System.out.println(add);
	
}
}
