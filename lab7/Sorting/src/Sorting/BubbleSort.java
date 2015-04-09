package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < unsortedArray.length - 1; i++) {
				if(unsortedArray[i + 1] < unsortedArray[i]) {
					swap(unsortedArray, i, i + 1);
					isSorted = false;
				}
			}
		}

		for (int i = 0; i < unsortedArray.length - 1; i++) {
			assert unsortedArray[i] <= unsortedArray[i + 1];
		}

		return unsortedArray;
	}

	private static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}
