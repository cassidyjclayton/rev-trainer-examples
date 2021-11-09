package primary;


public class Driver{
	public static void main(String...args){

		/*
		Q1. Perform a bubble sort on the following integer array:
		1,0,5,6,3,2,3,7,9,8,4
		*/
		Q1.BubbleSort();

		/*
		Q2. Write a program to display the first 25 Fibonacci
		numbers beginning at 0.
		A Fibonacci series sets the next nyumber as the
		sum of the previous two numbers. THe first two
		numbers are always 1 and 0.
		*/
		Q2 q2 = new Q2()
		q2.Fibonacci(25);

		/*
		Q3. Requirements: Reverse a string without using a
		temporary variable. Do NOT use reverse()
		in the StringBuffer or the StringBuilder APIs.
		*/
		Q3 q3 = new Q()
		q3.reverse("Dungeons & Dragons");

		// Q4. Write a program to compute N factorial.
		Q4 q4 = new Q4();
		q4.Factorial(15);

		/*
		Q5. Write a substring method that accepts a string str and an
		integer idx and returns the substring contained between
		0 and idx-1 inclusive. Do NOT use any of the existing
		substring methods in the String, StringBuilder, or
		StringBuffer APIs.
		*/
		Q5 subStr = new Q5;
		subStr.SubString("Critical Role", 7);
		subStr.subString("SpaceX", 5);

		/*
		Q6. Write a program to determine if an integer is even
		without using the modulus operator (%)
		*/
		Q6 even = new Q6();
		even.isEven(26);

		/*
		Q7. Sort two employees based on their name, department, and age
		using the Comparator interface.
		*/
		Q7 q7 = new Q7();
		q7.Compare();

		/*
		Q8. Write a program that stores the following strings in an
		ArrayList and saves all the palindromes in another ArrayList.
		“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”,
		“john”, “refer”, “billy”, “did”
		*/
		Q8 q8 = new Q8();
		q8.Palindrome();

		/*
		Q9. Create an ArrayList which stores numbers from 1 to 100 and
		prints out all the prime numbers to the console.
		*/
		Q9.Prime();

		/*
		Q10. Find the minimum of two numbers using ternary operators.
		*/
		Q10 q10 = new Q10();
		q10.Compare(8,9)

		/*
		 Q11. Write a program that would access two float-variables from a class that
		 exists in another package. Note, you will need to create two packages
		 to demonstrate the solution.
		 */
		Q11;

		/*
		Q12. Write a program to store numbers from 1 to 100 in an array.
		Print out all the even numbers from the array. Use the
		enhanced FOR loop for printing out the numbers.
		*/
		Q12;

		/*
		Q13. 	Display the triangle on the console as follows using
		any type of loop. Do NOT use a simple group of print
		statements to accomplish this.
		      0
		      1 0
		      1 0 1
		      0 1 0 1
		*/
		Q13;

		/*
		Q14. Write a program that demonstrates the switch case. Implement
		the following functionalities in the cases:java
		Case 1: Find the square root of a number using the Math class method.
		Case 2: Display today’s date.
		Case 3: Split the following string and store it in a string array.
		 “I am learning Core Java”
		 */
		Q14;

		/*
		Q15. Write a program that defines an interface having the following
		methods: addition, subtraction, multiplication, and division.
		Create a class that implements this interface and provides
		appropriate functionality to carry out the required operations.
		Hard code two operands in a test class having a main method
		that calls the implementing class.
		*/
		Q15;

		/*
		Q16. Write a program to display the number of characters
		for a string input. The string should be entered as
		a command line argument using (String [ ] args).
		*/
		Q16;

		/*
		Q17. Write a program that calculates the simple interest on
		the principal, rate of interest and number of years
		provided by the user. Enter principal, rate and time
		through the console using the Scanner class.

		Interest = Principal* Rate* Time
		*/
		Q17;

		/*
		Q18. Write a program having a concrete ;subclass that inherits three
		abstract methods from a superclass. Provide the following three
		implementations in the subclass corresponding to the abstract
		methods in the superclass:

		1. Check for uppercase characters in a string, and return ‘true’
		or ‘false’ depending if any are found.

		2. Convert all of the lower case characters to uppercase in the
		input string, and return the result.

		3. Convert the input string to integer and add 10, output the
		result to the console. Create an appropriate class having a
		main method to test the above setup.
		*/
		Q18;

		/*
		Q19. Create an ArrayList and insert integers 1 through 10.
		Display the ArrayList. Add all the even numbers up and
		display the result. Add all the odd numbers up and
		display the result. Remove the prime numbers from the
		ArrayList and print out the remaining ArrayList.
		*/
		Q19;

		/*
		Create a notepad file called Data.txt and enter the following:

		Mickey:Mouse:35:Arizona
		Hulk:Hogan:50:Virginia
		Roger:Rabbit:22:California
		Wonder:Woman:18:Montana

		Write a program that would read from the file and print it out
		to the screen in the following format:

		Name: Mickey Mouse
		Age: 35 years
		State: Arizona State		
		*/
		Q20;




}
