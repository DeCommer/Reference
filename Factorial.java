//import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        /*  A program to calculate factorials of a number entered by a user
        * A factorial is denoted as n!
        * An example is 4! = 1 * 2 * 3 * 4 = 24
        * 0! = 1
        *
        *n! = n(n-1)!
        * in this case the recursive algorithm uses more memory than the iterative one
        */

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number to calculate factorial: ");
        // int inputNumber = input.nextInt();
        
        int number = 9;

        System.out.println("\n" + number + "! = " + interativeFactorial(number));

        System.out.println("\n" + number + "! = " + recursiveFactorial(number));
        // input.close();
        // ----------------------------------------------------
    }

    public static int interativeFactorial(int number) {

        if (number == 0) { // this is because 0! = 1
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int number) {
        
        if(number == 0) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }


}
