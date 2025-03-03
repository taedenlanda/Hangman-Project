import java.util.Scanner;

public class game {
    private player player;
    private secret secret;
    private int maxIncorrectGuesses;

    public game(String playerName, String secretWord, int maxIncorrectGuesses) {
        this.player = new player(playerName);
        this.secret = new secret(secretWord);
        this.maxIncorrectGuesses = maxIncorrectGuesses;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman, " + player.getName() + "!");
        System.out.println("Try to guess the word before you run out of chances!");

        while (player.getIncorrectGuesses() < maxIncorrectGuesses && !secret.isWordGuessed()) {
            System.out.println("Current word: " + secret.getGuessedWord());
            System.out.println("Incorrect guesses: " + player.getIncorrectGuesses() + "/" + maxIncorrectGuesses);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            if (secret.updateGuessedWord(guess)) {
                System.out.println("Good guess!");
            } else {
                player.incrementIncorrectGuesses();
                System.out.println("Wrong guess!");
            }
        }

        if (secret.isWordGuessed()) {
            System.out.println(
                    "Congratulations, " + player.getName() + "! You guessed the word: " + secret.getSecretWord());
        } else {
            System.out.println("Game over! The word was: " + secret.getSecretWord());
        }
    }
}