import java.util.Arrays;

public class Algorithms {
    //Basic array search
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int searchElement = 50;

        searchArr(arr, searchElement);

        // String greet = "hi";

        // for(int i = 0; i <= 10; i ++) {
        //     System.out.println(greet);
        // }
        
    }

    public static void searchArr(int[] arr, int searchElement) {

        String stArr = Arrays.toString(arr);
        System.out.println(searchElement);
        System.out.println(stArr);

        for(int i = 0; i < arr.length; i++) {
            if(searchElement == arr[i]){
                System.out.println("Element " + arr[i] + " is found at index: " + i);
                break;
            } else if(searchElement != arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}

