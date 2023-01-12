import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("What number would you like a Fibonacci sequence for? ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println("\nFibonacci series to " + number + " numbers: ");

        //prints the numbers
        for(int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " "); //calls function
        } 
        input.close();
    }

    public static int fibonacci(int number)  {
        if(number == 1 || number == 2) {
            return 1;
        }
        //The meat
        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion
    }

  /*   public static int fibonacci2(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }
        int fib1 = 1, fib2 = 1, fibonacci = 1;
        for(int i = 3; i <= number; i++) {

            //the meat
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    } */
}
