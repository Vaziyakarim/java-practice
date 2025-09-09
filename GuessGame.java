import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int secretCode = 9;
        int guessCount = 0;
        int guessLimit = 3;
        Scanner scanner = new Scanner(System.in);
        boolean win = false;

        while (guessCount < guessLimit) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            guessCount++;

            if (guess == secretCode) {
                System.out.println("You Win");
                win = true;
                break;
            }
        }

        if (!win) {
            System.out.println("Sorry, Better Luck Next Time");
        }

        scanner.close();
    }
}
