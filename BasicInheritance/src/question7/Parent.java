//parent class with disp function which gets override and display function which do not gets override
package question7;

public class Parent {

	int variable = 5;

	public void disp() {
		System.out.println("This function is not overridden by child class fuction ");
	}

	public void display() {
		System.out.println("Parent class function");
	}
}
