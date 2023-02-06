import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] intArray = new int[3]; //cannot change size after being set
            intArray[0] = 20;
            intArray[1] = 35;
            intArray[2] = -15;

            String[] strArr = new String[3];
            strArr[0] = "Constance";
            strArr[1] = "Joseph";
            strArr[2] = "Spoons";


        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 20) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);

        //Array methods: sort, toString, 

        System.out.println("This is the original array " + Arrays.toString(intArray));
        Arrays.sort(intArray);        
        System.out.println("This is the soted array " + Arrays.toString(intArray));

        //reverse int array
        int[] intArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; //declare string
        System.out.println("Original array: " + Arrays.toString(intArr));
        int temp; //declare temp to hold reversed values
        for(int i = 0; i < intArr.length / 2; i++) { // for loop that is the length of initial array divided by 2
            temp = intArr[i]; //temp becomes 10, 20, 30, 40, and 50
            
            intArr[i] = intArr[intArr.length - i - 1]; // intArr[i] becomes 100, 90,80, 70, and 60
            intArr[intArr.length - i - 1] = temp; // putting temp and intArr together, but reversed
        }
        System.out.println("Reversed array: " + Arrays.toString(intArr));
    }
}