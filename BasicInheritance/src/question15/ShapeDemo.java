package question15;

public class ShapeDemo {
	public static void main(String args[]) {
		
		Shape[] shape=new Shape[3];
		shape[0]=new Circle();
		shape[1]=new Triangle();
		shape[2]=new Polygon();
		
		for(int i=0;i<3;i++)
		{
			shape[i].draw();
		}
		
		

	}
}
