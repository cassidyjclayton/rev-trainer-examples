package Driver;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		
		while(true){
			//declare two empty variables
			int a, b;


			//read into these #s
			Scanner scan = new Scanner(System.in);

			try{

			//assign value to variable a
			System.out.println("First number: "); 

			a = scan.nextInt();

			//assign value to var b
			System.out.println("Second number: ");

			b = scan.nextInt();			

			//add a and b, both of which now have values
			System.out.println("Sum: " + add(a, b));


			} catch (Exception e) {
				System.out.println("Feed me an integer, silly!" + e.getMessage());
			}

		}
	}
	public static int add(int a, int b) { 
		return a + b; 
	}
}
