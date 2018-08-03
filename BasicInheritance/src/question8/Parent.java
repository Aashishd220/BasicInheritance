//parent class having function with single argument
package question8;

public class Parent {

	int variable;

//function taking one argument
	public String display(int variable) {
		this.variable = variable;
		return "Single variable function " + variable;
	}
}
