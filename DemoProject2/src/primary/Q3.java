package primary;
public class Q3{
/*
Requirements: Reverse a string without using a
temporary variable. Do NOT use reverse()
in the StringBuffer or the StringBuilder APIs.
*/
//Method Code: recursion i guesss
public static String reverse(String str)
{
	//return if string is null or empty
	if (str == null || str.equals(""))
	{
		return str;
	}
	//isolate 1st char and recur for remaining str
	return reverse(str.substring(1)) + str.charAt(0);
	System.out.println("Original String: " + str); //print initial str
	//strings are immutable, so we run the reverse function we set up
	str = reverse(str);
	System.out.println("Reversed String: " + str);

}


//Driver Code
	//public static void main(String[] args){



	}
}
