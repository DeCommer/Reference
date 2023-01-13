package SortingAlgorithms;

public class MergeSort {
    /*
    * start = 0, end = array.length or array.length + 1
    * modpoint = (start + end) / 2
    * Not in place (needs additional temporary arrays)
    * O(nlogn) (base 2) Time complexity
    * Stable algorithm
    *
    */
        public static void main(String args[]){
        int a[] = { 19, 30, 79, -7, 31, 2, 39, -42 };
        int n = a.length;
        MergeSort m1 = new MergeSort();
        System.out.print("\nBefore sorting array elements are: ");
        m1.printArray(a, n);
        m1.mergeSort(a, 0, n - 1);
        System.out.print("\nAfter sorting array elements are: ");
        m1.printArray(a, n);
        System.out.print("");
    }

    // Function to merge the subarrays of a[]
    void merge(int a[], int beg, int mid, int end)
    {    
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

    //temporary Arrays
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

    //copy data to temp arrays
        for (i = 0; i < n1; i++) LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++) RightArray[j] = a[mid + 1 + j];
        i = 0; //initial index of first sub-array
        j = 0; //initial index of second sub-array
        k = beg;  //initial index of merged sub-array
        while (i < n1 && j < n2) {
            if(LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            }else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j<n2){
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int a[], int beg, int end) {
        if (beg < end){
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}