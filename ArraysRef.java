// import java.util.Arrays;

public class ArraysRef {
    public static void main(String[] args) {
        int[] intArray = new int[3]; //cannot change size after being set
            intArray[0] = 20;
            intArray[1] = 35;
            intArray[2] = -15;

            //String strArr[] = {"Word", "Word", "Word"};

        int index = -1;
        for(int i=0; i < intArray.length; i++) {
            if(intArray[i] == 20) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);

        //Array methods


    }
}