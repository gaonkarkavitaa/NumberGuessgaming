import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int maxRounds = 3;
        int score = 0;

        for (int round = 1; round <= maxRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("\nRound " + round);
            System.out.println("Guess a number between 1 and 100.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You've reached the maximum number of attempts. The number was " + numberToGuess);
            }
        }

        System.out.println("\nGame Over! Your final score is: " + score + "/" + maxRounds);
        scanner.close();
}} 
