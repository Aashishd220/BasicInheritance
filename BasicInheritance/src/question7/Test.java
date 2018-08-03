//class with main function creating object of child class
package question7;

public class Test {
public static void main(String args[])
{
	Child obj=new Child(); //object creation	
	obj.disp();				//function calling
	obj.display();
	
	obj.display();			//overrides function
}
}
