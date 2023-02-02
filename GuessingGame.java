import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        int secretNum = (int)Math.floor(Math.random()*10) + 1;
        boolean condition = false;
        int numOfGuesses = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("The secret numbers is: " + secretNum);

        while(condition == false)
        {

            System.out.print("Try to guess my number, filthy human: ");
            int answer = input.nextInt();

            if(answer == secretNum) 
            {
                System.out.println("\nYou got it right, in " + numOfGuesses + " guesses. Damn dirty human!");
                System.out.println("Good bye.");
                condition = true;
            } else 
            {
                System.out.println("Keep trying smelly human.");
                condition = false;
                numOfGuesses++;
                System.out.println("Number of guesses: " + numOfGuesses);
            }
        }
        input.close();

    }
}