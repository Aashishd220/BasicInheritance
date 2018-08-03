//Multilevel Inheritance
package question5;

public class Child extends Parent {
	
	//Constructor
		public Child() {
			super.display(5);      //super calling parent class function

			System.out.println("Constructor of child class");
		}
}
