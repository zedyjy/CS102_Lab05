package CS102.Lab05;

public class ConsoleHangmanView implements IHangmanView{
    @Override
    public void updateView(Hangman hangman) {

        if (!hangman.isGameOver()) {
            System.out.println("Known so far: " + hangman.getKnownSoFar());
            System.out.println("You have " + (hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries()) + " tries left.");
        }
        else if (hangman.isGameOver() && !hangman.hasLost()) {
            System.out.println("You won!");
        }
        else if (hangman.hasLost() && hangman.isGameOver()) {
            System.out.println("You lost! Secret word was : " + hangman.secretWord.toString());
        }
    }
}
