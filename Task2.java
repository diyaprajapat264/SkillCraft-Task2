import java.util.Random;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;  // random number between 1–100
        int guess = -1, attempts = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");

        // Loop until the user guesses correctly
        while (guess != number) {
            System.out.print("Enter your guess: ");

            // If no more input is available, break to avoid NoSuchElementException
            if (!sc.hasNext()) {
                System.out.println("\no more input detected. Exiting the game.");
                break;
            }

            // Check if input is an integer
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } else {
                System.out.println("nvalid input! Please enter a number.");
                sc.next(); // clear invalid input safely  }
        }

        sc.close();
    }
}
}