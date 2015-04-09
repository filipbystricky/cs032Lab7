package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
        for (int i = 1; i < unsortedArray.length; i++) {
            int temp = unsortedArray[i];
            int j;
            
            for (j = i - 1; j >= 0 && temp < unsortedArray[j]; j--) {
                unsortedArray [j + 1]  = unsortedArray [j];
            }
            unsortedArray[j + 1] = temp;
        }
        
        
		return unsortedArray;
	}
}
