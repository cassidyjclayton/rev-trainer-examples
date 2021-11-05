package primary;

public class Q5 {
	String Substring(String str, int idx){

		char[] charArray = str.toCharArray();
		char[] substringArray = new char[idx];

		for (int i = 0; i < idx; ++i) {
			sbstringArray[i] = charArray[i];
		}
		//Turn substring into String
		return new String(substringArray)
	}
}
//Driver Code
	public static void main(String[] args)