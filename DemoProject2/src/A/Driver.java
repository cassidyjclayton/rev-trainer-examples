package A;

public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello! :3 "; //aka String Literal, named for the manually-entered values
		int runIterations = 5;
		
		for (int i = 0; i <runIterations; ++i) {
			System.out.println(myMessage + ": " + i);
		} 
		// for loop s are great for lists (or for a certain # of times ! of course, arrays start with first position = 0
		int j = 0;
		while (j < runIterations)
		{
			System.out.println("J is still going! J = " + j);
			++j;
		}
		//boolean done = false;
		//while (!done) {
			//'!" = not; negates any boolean value (i.e. reverses it)
			//System.out.println("Still not done!");
			
			//if (j % 12 == 0)
				//done = true;
		//}
		// While loops useful for code that needs to run so long as something is true. 
		//while(true) is an infinite loop. Danger! 

	// Do-while loops always run enclosed code min 1 time; bc check for continuing is done @ end not beginning
	do {
		
	} while (true);

}}
