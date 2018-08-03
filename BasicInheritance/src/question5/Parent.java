//Multilevel Inheritance
package question5;

public class Parent {

	int variable;
	   //Constructor
		public Parent() {

			System.out.println("Constructor of parent class");
		}
			//printing function called using super
		public void display(int var) {
			variable = var;
			System.out.println("Variable=" + variable);
		}
}
