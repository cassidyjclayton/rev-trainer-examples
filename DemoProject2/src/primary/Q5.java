package primary;
/*

Write a substring method that accepts a string str and an
integer idx and returns the substring contained between
0 and idx-1 inclusive. Do NOT use any of the existing
substring methods in the String, StringBuilder, or
StringBuffer APIs.

*/
public class Q5 {

	public void subString(String str, int idx) {

		String newString = "";

		for (int i = 0; i < idx; i++) {

			newString += str.charAt(i);

		}

		System.out.println(newString);

	}
}
//code adapted from Merve Kirali
