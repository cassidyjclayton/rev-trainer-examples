package primary;
/*
Create an ArrayList which stores numbers from 1 to 100 and
prints out all the prime numbers to the console.
*/
public class Q9 {
	public void Prime(){
		int[] numArray = new int[100];

		System.out.println("Q9");

		for ( int i = 1; i <= 100; ++i){
			numArray[i - 1] = i;
			if (i == 1 || i == 2 || i ==3) {
				System.out.println(i);
			} else {
				int a = i / 2;

				int c = 0;
				for (int j = 2; j <= a; ++j) {
					int (i % j == 0  && c == 0) {
						c = 1
					}
					if (c == 0) {
						System.out.println(i);
					}
				}
			}
		}
	} //code from Josephy 'Joey' Revay
}
