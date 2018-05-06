package corejava;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	NonStatic x = new NonStatic(); // instance of object
	x.car();
	x.flower();
	x.massaddition(10,15,20,25);
	

	}
	
	public void car() { // non static function
		
	System.out.println("Toyota");
	}

	public void flower() { // non static function
		
		System.out.println("I love rose");
		}
	
	public  void massaddition(int a, int b, int c, int d) {	
		int add=a+b+c+d;
		
		System.out.println(add);
	
	}
}
