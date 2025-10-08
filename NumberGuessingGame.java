import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int score = 0;

        for (int round = 1; round <= 3; round++) {
            int num = r.nextInt(100) + 1, tries = 0;
            System.out.println("\nRound " + round + " - Guess a number (1–100):");
            while (tries++ < 5) {
                System.out.print("Try " + tries + ": ");
                int guess = sc.nextInt();
                if (guess == num) {
                    System.out.println("🎉 Correct in " + tries + " tries!");
                    score++;
                    break;
                }
                System.out.println(guess < num ? "Too low!" : "Too high!");
            }
            if (tries > 5) System.out.println("❌ Out of tries! Number was " + num);
        }
        System.out.println("\n🏁 Game Over! Final Score: " + score + "/3");
        sc.close();
    }
}
