package SortingAlgorithms;

public class MergeSort {
    /*
    * start = 0, end = array.length or array.length + 1
    * modpoint = (start + end) / 2
    * Not in place (needs additional temporary arrays)
    * O(nlogn) (base 2) Time complexity
    * Stable
    *
    * The mergeSort method will not print output and I dont know why.
    */
    public static void main(String[] args) {

        int[] intArray = { 20, 43, -19, 7, 92, 1, -79 };

        mergeSort(intArray, 0, 0);
        
        for(int i = 0; i < intArray.length; i++) {
            mergeSort(intArray, 0, intArray.length);
        }

/*         for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        } */
       
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2; //partitions the array
        mergeSort(input, start, mid); //recursive call that stars the party with left array
        mergeSort(input, mid, end); // deals with right array
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) { // merges sorted partitioned arrays

        if (input[mid - 1] <= input[mid]) { //checks if left and right values are sorted
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++]; 
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
