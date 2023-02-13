package SortingAlgorithms;

public class BubbleSort {
    /*
     * In-place (same array) algorithm
     * O(n^2) (quadratic) time complexity
     * takes 100 steps to 10 items, 10,000 for 100 and so on
     * Algorithm degrades quickly (not efficient)
     * 
     *//* 
    public static void main(String[] args) {

        int[] intArray = {20, 43, -19, 7, 1, -79};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; 
                lastUnsortedIndex--) {

                    for (int i = 0; i < lastUnsortedIndex; i++) {
                        if(intArray[i] > intArray[i + 1]) {
                            swap(intArray, i, i + 1);
                        }
                    }
                }
                for(int i = 0; i < intArray.length; i++) {
                    System.out.print(intArray[i] + ", ");
                }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } */

    /********************A simpler way**********************/

    public static void main(String[] args) {
        int[] intArray = {20, 43, -19, 7, 1, -79};
        
        bs(intArray);

        for(int i : intArray) {
            System.out.print(i + " ");
        }
    }

    public static void bs(int array[]) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                
            }
        }
    }

}
