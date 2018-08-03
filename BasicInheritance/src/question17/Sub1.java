package question17;

public class Sub1 extends Base1 {

	public Sub1() {
		super(10);
		System.out.println("No-Argument Constructor");
	}

	public Sub1(int variable1) {
		super(10);

		System.out.println("Single Argument Constructor");
	}

	public Sub1(int variable1, int variable2) {
		super(10);

		System.out.println("Double Argument Constructor");
	}
}
