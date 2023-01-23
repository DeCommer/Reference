package SortingAlgorithms;

import java.util.Arrays;
import java.util.SortedSet;

/*
 *  In place (No new array needed)
 * O(n^2) (Quadratic) Time complexity
 * 100 steps for 10 items, 10,000 for 100 items ...
 * Does not require as much swapping as bubble sort
 * Unstable
 */

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {4, 19, -10, -43, 79};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; // loop one
                lastUnsortedIndex--) {
                    int largest = 0;
                    for(int i = 1; i <= lastUnsortedIndex; i++) { //loop 2
                        if(arr[i] > arr[largest]) {
                            largest = i;
                        }
                    }
                    swap(arr, largest, lastUnsortedIndex);
                }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
