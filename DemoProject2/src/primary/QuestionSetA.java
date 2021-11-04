package primary;
// Questions 1-9
public class QuestionSetA {

	//
	static void bubbleSort(int arr[], int n)
	{
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; ++j)
		{
			swapped = false;
			for (j = 0; j < n - i - 1; ++j)
			{
				if (arr[j] > arr[j + 1])
				{ //swap arr[j] and arr[j + 1]
					temp = arr[j];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			//if no two elements wereswapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}
	
	
	//Function to Print Array	
	static void printArray(int arr[], int size)
	{
		int i;
		for (i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	//Driver Program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,5,6,3,2,3,7,9,8,4};
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Q1: Sorted array:");
		printArray(arr, n);
	}
	//Pulled from code on geeksforgeeks.org written by Nikita Tiwari

}
