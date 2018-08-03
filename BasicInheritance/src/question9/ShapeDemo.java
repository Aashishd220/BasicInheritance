//class with main function showing different draw functions
package question9;

public class ShapeDemo {
	public static void main(String args[]) {
		Shape shape_obj = new Circle();
		shape_obj.draw();
		shape_obj = new Rectangle();
		shape_obj.draw();
		shape_obj = new Polygon();
		shape_obj.draw();

	}
}
