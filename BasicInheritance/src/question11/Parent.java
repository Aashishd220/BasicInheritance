package question11;

public class Parent {

	int variable;
	   //Constructor
		public Parent() {

			System.out.println("Constructor of parent class");
		}
			//display function called using super
		public void display(int var) {
			variable = var;
			System.out.println("Variable=" + variable);
		}
}
