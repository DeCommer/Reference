import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Program to check if a number is prime
        //A prime number is divisable by 1 and itself
        // the first few primes: 2, 3, 5, 7, 11, 13, 17...

        //if divisor == 2, number is prime. If divisor > 2 number is not prime

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int isPrime =  input.nextInt();
        int divisors = 0;

        for(int i = 1; i <= isPrime; i++) {
            if(isPrime % i == 0) {
                divisors++;
            }
        }

        if(divisors == 2) {
            System.out.println(isPrime + " is prime");
        } else {
            System.out.println(isPrime + " is not prime");
        }
        input.close();
    }
}