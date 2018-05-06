package corejava;
// When you have an abstract method in any class, it becoms abstract class.
//Abstract means you know your function but dont know the action of that
public abstract class Abstract {

	public static void color() {
	
		System.out.println("My favorite color is purple");
	}
	
	public static void food() {
		
		System.out.println("My favorite color is Pizza");
		
	}
	
	public static void addition(int a, int b) {
	int add= a+b;
	System.out.println(add);
	
	}
	public abstract void dinner();
	
	public abstract void country();
}
