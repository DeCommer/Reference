package SortingAlgorithms;
import java.util.Arrays;
import java.util.Collections;


public class GeneralSorting {
    public static void main(String[] args) {


        
        final int num =  1979;
        System.out.println(sortDesc(num));

        int arr[] = {678, 102, 275, 45, 96, 57};
        System.out.println(smallest(arr));
        
    }

    public static int sortDesc(final int num) { //does not work - fix!
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
      }

      public static int  smallest(int[] arr) {
        int temp, size;
        size = arr.length;
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        return arr[0];
    }    
}
