package SortingAlgorithms;

/*
 * In place algorithm (Does not need additional arrays)
 * O(n^2) (Quadratic) time complexity
 * 100 steps qo items, 10,000 steps 100 items...
 * Stable (Works left to right / deals with equalities )
 * Too much shifting
 * 
 * fUIdx = firstUnsortedIndex
 */

public class InsertionSort {

    public static void main(String[] args) {
        
        int[] intArray = {20, 43, -19, 7, 1, -79};
        

        for (int fUIdx = 1; fUIdx < intArray.length; fUIdx++) { // Starts at one because algorithm assumes 0 is sorted
            int newEle = intArray[fUIdx];
            int i;

            for( i = fUIdx; i > 0 && intArray[i - 1] > newEle; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newEle;
        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}