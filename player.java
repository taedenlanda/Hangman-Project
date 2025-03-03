public class player {
    private String name;
    private int incorrectGuesses;

    public player(String name) {
        this.name = name;
        this.incorrectGuesses = 0;
    }

    public String getName() {
        return name;
    }

    public int getIncorrectGuesses() {
        return incorrectGuesses;
    }

    public void incrementIncorrectGuesses() {
        incorrectGuesses++;
    }

    public void resetIncorrectGuesses() {
        incorrectGuesses = 0;
    }
}