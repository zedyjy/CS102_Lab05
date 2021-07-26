package CS102.Lab05.GUIHangman;

import javax.swing.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView {

    Hangman game;

    public GallowsHangmanView(Hangman game) {
        this.game = game;
        setBackground(Color.PINK );
        setPreferredSize( new Dimension( 400, 400) );
    }

    public void updateView( Hangman hangman){
        repaint();
    }

    public void paintComponent( Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        int guessNum = game.getNumOfIncorrectTries();

        g.fillRect(10, 190, 170, 20);
        g.fillRect(40, 20, 10, 190);
        g.fillRect(40, 20, 80, 10);
        g.fillRect(120, 20, 3, 25);

        if (guessNum >= 1) {
            g.drawOval(107, 45, 30, 30);
        }

        if (guessNum >= 2) {
            g.drawLine(125, 75, 125, 120);
        }
        if (guessNum >= 3) {
            g.drawLine(125, 120, 148, 143);
        }
        if (guessNum >= 4) {
            g.drawLine(125, 120, 100, 143);
        }
        if (guessNum >= 5) {
            g.drawLine(125, 82, 148, 95);
        }
        if (guessNum >= 6) {
            g.drawLine(125, 82, 100, 95);
        }
    }
}

