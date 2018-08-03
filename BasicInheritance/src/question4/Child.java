//Single level Inheritance
package question4;

public class Child extends Single {
	// Constructor
	public Child() {
		super.display(5); // super calling parent class function

		System.out.println("Constructor of child class");
	}
}
