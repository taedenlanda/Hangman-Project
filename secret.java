public class secret {
    private String secretWord;
    private char[] guessedWord;

    public secret(String secretWord) {
        this.secretWord = secretWord.toLowerCase();
        this.guessedWord = new char[secretWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getGuessedWord() {
        return new String(guessedWord);
    }

    public boolean updateGuessedWord(char guessedLetter) {
        boolean isCorrect = false;
        guessedLetter = Character.toLowerCase(guessedLetter);

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guessedLetter) {
                guessedWord[i] = guessedLetter;
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    public boolean isWordGuessed() {
        return secretWord.equals(new String(guessedWord));
    }
}