package primary;
/*
Find the minimum of two numbers using ternary operators.
*/
import java.io*;

public class Q10{
	public void Compare (int a, int b) {
		String result = (a >= b)? a + " is greater than " + b : b + " is greater than " + a;
		System.out.println("Which number is bigger? " + result);
	}
}
// Code from Merve Kirali
