package primary;
/*
Find the minimum of two numbers using ternary operators.
*/
import java.io*;

public class Q10{
	public static void main(String[] args) {
		Minimum(int i, int j, int k) {
			//declare variables in
			i, j, min;

			System.out.println("First number: " + i);
			System.out.println("Second number: " + j);

			// find larger # via ternary operators
			min = (i < j) ? i : j;

			// print largest #
			System.out.println("The minimum # is: " + min);

		}
	}
}
