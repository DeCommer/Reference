import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int answer = num1 + num2;

        System.out.println("Number 1 plus number 2 = " + answer );

        input.close();
    }
}
