package CS102.Lab05.GUIHangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldControlPanel extends JPanel {

    Hangman hangman;
    JTextField textField;

    public TextFieldControlPanel(Hangman hangman){
        this.hangman = hangman;
        textField = new JTextField(15);
        this.add(textField);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = textField.getText();

                for (int i = 0; i < word.length(); i++)
                {
                    hangman.tryThis(word.charAt(i));
                }
                textField.setText("");
            }
        });
    }
}
