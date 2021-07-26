package CS102.Lab05.GUIHangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton implements IHangmanView{

    Hangman hangman;

    public NewGameButtonControl(Hangman hangman){
        super("New Game");
        this.hangman = hangman;


        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hangman.initNewGame();
                setEnabled(false);
            }
        });
    }

    @Override
    public void updateView(Hangman hangmanModel) {
        if (hangman.isGameOver()){
            this.setEnabled(true);
        }
    }
}
