//Class with main function
package question18;

public class Demo {
	//Taking reference as parameter
	static void perform(Game a)
	{
		a.play();
	}
	public static void main(String[] args) {
	
		Cricket cricket=new Cricket();
		perform(cricket);						//object creation
		Football football=new Football();		//passing reference to perform function
		perform(football);
		Tennis tennis=new Tennis();
		perform(tennis);
		
	}

}
