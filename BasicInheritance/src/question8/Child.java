//child class extends parent class with function taking two arguments
package question8;

public class Child extends Parent {

	int variable1, variable2;

//function taking two arguments
	public String display(int variable1, int variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
		return "Two variable function " + variable1 + variable2;
	}
}
