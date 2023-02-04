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
        for(int i=0; i < intArray.length; i++) {
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
        
    }
}