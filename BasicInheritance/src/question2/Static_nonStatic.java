//Class with static and non-static data members
package question2;

public class Static_nonStatic {

	static int first = 1;
	int second = 2;

	// printing static data member
	public static void display() {
		System.out.println(first + " -Static data member");
		System.out.println("Static Function");

	}

	// printing non-static data member
	public void display1() {

		System.out.println(second + " -Static data member");
		System.out.println("Non-Static Function");
	}
}
