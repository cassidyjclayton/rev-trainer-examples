package primary;
public class Q2 {
	/* 
	Write a program to display the first 25 Fibonacci 
	numbers beginning at 0.
	A Fibonacci series sets the next nyumber as the
	sum of the previous two numbers. THe first two
	numbers are always 1 and 0.
	*/
	//Function to print Fibonacci sequence to N numbers
	static void Fibonacci(int N) 
	{
		int num1 = 0; //set 1st starting # to 0
		int num2 = 1; //set 2nd starting # to 1
		int counter = 0; //set counter to start @ 0.
		System.out.print("The starting numbers of a Fibonacci sequence are " 
		+ num1 + " and " + num2 + ".\n"); //prints 0 and 1

		// Iterate till counter is N
		while (counter < N) {
			//print #
			System.out.print(num1 + "\n");
			//change num1 and num2 to the next
			//numbers in the sequence
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1; //increase counter


		}
	}

	//Driver Code
	public static void main(String[] args)
	{
		  // Given Number N
        int N = 25; //sets # of fibonacci series ints to find
  
        // Function Call
        Fibonacci(N);
        // Optional: don't bother w/ naming variable, pop int right into 
        // the function. IT still runs.
	}

}  
            