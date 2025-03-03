import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        boolean playAgain;

        do {
            System.out.print("Enter the secret word: ");
            String secretWord = scanner.nextLine();

            game game = new game(playerName, secretWord, 6);
            game.start();

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        } while (playAgain);

        System.out.println("Thanks for playing Hangman!");
        scanner.close();
    }
}