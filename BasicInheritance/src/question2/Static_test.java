//Class with main function
package question2;

public class Static_test {
	public static void main(String args[]) {
		Static_nonStatic obj = new Static_nonStatic(); // object creation

		Static_nonStatic.display(); // invoking display from Static_nonStatic class
		obj.display1();// invoking display through object

	}
}
