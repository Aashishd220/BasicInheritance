//class with main function showing functionalities
package question1;

public class Two {

	public static void main(String[] args) {
		First first = new First(); // creating object
		Second second = new Second();

		System.out.println(first.a); // invoking instance member
		first.firstFunction();
		System.out.println(second.b);// invoking instance member
		second.secondFunction();

	}

}
