package CS102.Lab05.GUIHangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView {

    JPanel panel;
    JLabel numOfTries, knownSoFar, usedLetters, lost;

    public LabelsHangmanView(){
        super();
        this.setPreferredSize(new Dimension(400,200));
        panel = new JPanel();
        numOfTries = new JLabel("");
        knownSoFar = new JLabel("");
        usedLetters = new JLabel("");
        lost = new JLabel("");
        this.add(numOfTries);
        this.add(knownSoFar);
        this.add(usedLetters);
        this.add(usedLetters);
        this.add(lost);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void updateView(Hangman hangman) {
        knownSoFar.setText("Known words so far:" + hangman.getKnownSoFar());
        numOfTries.setText("Number of tries:" + String.valueOf(hangman.getNumOfIncorrectTries()));
        usedLetters.setText("Used letters so far: " + hangman.getUsedLetters());
        if(hangman.hasLost()){
            lost.setText("You lost...");
        }
        else if(hangman.isGameOver()){
            lost.setText("You won!!!");
        }
    }
}
