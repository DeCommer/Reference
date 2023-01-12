package SortingAlgorithms;

/*
 *  In place (No new array needed)
 * O(n^2) (Quadratic) Time complexity
 * 100 steps for 10 items, 10,000 for 100 items ...
 * Does not require as much swapping as bubble sort
 * Unstable
 */

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; // loop one
                lastUnsortedIndex--) {
                    int largest = 0;
                    for(int i = 1; i <= lastUnsortedIndex; i++) { //loop 2
                        if(intArray[i] > intArray[largest]) {
                            largest = i;
                        }
                    }
                    swap(intArray, largest, lastUnsortedIndex);
                }

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] +" ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
