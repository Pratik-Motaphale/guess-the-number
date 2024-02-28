import java.util.Random;
import java.util.Scanner;
public class gammee
{          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int lowerBound = 1;
            int upperBound = 100;
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int numberOfGuesses = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfGuesses++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again!");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high. Try again!");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number in " + numberOfGuesses + " attempts.");
                }
            }

            scanner.close();
        }
    }


