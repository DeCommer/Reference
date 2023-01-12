import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        int secretNum = (int)Math.random()*100;
        boolean condition = false;
        int numOfGuesses = 0;
        Scanner input = new Scanner(System.in);


        while(condition == false) {

            System.out.print("Try to guess my number, filthy human: ");
            int answer = input.nextInt();

            if(answer == secretNum) {
                System.out.println("\nYou got it right, damn dirty human!");
                System.out.println("It took you " + numOfGuesses + " guesses! Haha!");
                System.out.println("Good bye.");
                condition = true;
            } else {
                System.out.println("Keep trying smelly human.");
                condition = false;
                numOfGuesses++;
                System.out.println("Nuber of guesses: " + numOfGuesses);
            }
        }
        input.close();
    }
}