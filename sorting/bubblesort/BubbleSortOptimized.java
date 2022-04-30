package sorting.bubblesort;

public class BubbleSortOptimized {

	// An optimized version of Bubble Sort
	static void bubbleSort(int arr[]) {
		int arrLength = arr.length;
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < arrLength - 1; i++) {
			swapped = false;
			for (j = 0; j < arrLength - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// If no elements were swapped by inner loop, then break
			if (swapped == false) {
				break;
			}
		}
	}

	// Method for printing an array
	static void printArray(int arr[]) {
		int i;
		int arrLength = arr.length;
		for (i = 0; i < arrLength; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 4, 15, 12, 21, 2, 25, 10, 18, 0, 7, 9, 333 };

		System.out.println("Array before applying Bubble Sort: ");
		printArray(arr);

		bubbleSort(arr); // Applying Bubble Sort

		System.out.println("Array after applying Bubble Sort: ");
		printArray(arr);
	}
}
