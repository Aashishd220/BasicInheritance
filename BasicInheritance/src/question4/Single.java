//Single Level Inheritance
package question4;

public class Single {

	int variable;

	// Constructor
	public Single() {

		System.out.println("Constructor of parent class");
	}

	// printing function called using super
	public void display(int var) {
		variable = var;
		System.out.println("Variable=" + variable);
	}
}
