import java.util.Arrays;

public class Misc {

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(reverseArray(320410)));
        System.out.println( isLeapYear(2012));
    }

/*
 * Changes a long to a string
 * changes n to int
 * itereates over array
 * and reverses output array
 */
    public static int[] reverseArray(long n) {
        String numStr = String.valueOf(n); 
        int digits[] = new int[numStr.length()];
        int counter = 0;
        for(int i = numStr.length() - 1; i >= 0; i--) {
          digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }
        return digits;
      }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
        if (year % 100 == 0) {
                if (year % 400 == 0) {
                return true;
            }else {
                return false;
            }
        }else {
            return true;
        }
        }
        else {
            return false;
        }
    }
}
