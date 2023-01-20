import java.util.Arrays;
import java.util.Scanner;

public class Misc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner
        
/*         System.out.print("Enter a year: ");
        int nYear = input.nextInt();

        if(isLeapYear(nYear) == true) {
            System.out.println(nYear + " is a leap year");
        } else {
            System.out.println(nYear + " is not a leap year");
        } */
        
        System.out.println(Arrays.toString(reverseArray(320410)));

        System.out.println(reverseString("Joseph DeCommer"));
        input.close();
    }
/*
 * Changes a long to a string
 * changes n to int
 * itereates over array
 * and reverses output array
 */
    public static int[] reverseArray(long n) { //reverses array
        String numStr = String.valueOf(n); 
        int digits[] = new int[numStr.length()];
        int counter = 0;
        for(int i = numStr.length() - 1; i >= 0; i--) {
          digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }
        return digits;
      }

    public static String reverseString(String s) {
        char ch;
        String newStr = "";
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            newStr = ch+newStr;
        }
        return newStr;
    }
//Checks is a given year is a leap year
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
