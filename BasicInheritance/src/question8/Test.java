//class with main function passing arguments to two different functions
package question8;

public class Test {
	public static void main(String args[]) {
		Child obj = new Child(); // object creation
		System.out.println(obj.display(5)); // passing single argument to function
		System.out.println(obj.display(5, 7)); // passing two argument to function
	}
}
