//Class checking how which variable can be called directly and indirectly
package question3;

public class Check {

	int defaultvar;
	public int publicvar;
	protected int protectedvar;
	private int privatevar;

	// printing which members can be accessed directly and indirectly
	void display() {
		System.out.println("Default var is directly accessible");

		System.out.println("Public var is directly accessible");

		System.out.println("Protected var is directly accessible");

		System.out.println("Private var is not directly accessible");
	}
}
