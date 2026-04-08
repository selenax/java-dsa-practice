package sorting;

/*
Approach:
1. outer loop keep tracks of current index to swap
2. inner loop finds next smallest value to swap with

Time: O(n^2)
Space: O(1) - sort in place
*/

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {   // skips last index, already sorted, nothing to swap with
           int minIndex = getMinIndex(array, i);
           if(i != minIndex) {
               swap(array, i, minIndex);
           }
        }
    }
    // find next small value
    private static int getMinIndex(int[] array, int start) {
        int min = start;
        for (int j = start + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
