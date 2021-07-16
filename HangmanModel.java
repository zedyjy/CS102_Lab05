package CS102.Lab05;

import java.util.ArrayList;

public class HangmanModel extends Hangman{

    ArrayList <IHangmanView> hangmanViews = new ArrayList <IHangmanView>();

    public HangmanModel(IHangmanSetup setup){
        super(setup);
    }

    public void addView(IHangmanView hangmanView){
        hangmanViews.add(hangmanView);
        hangmanView.updateView(this);
        update();
    }

    public void update(){
        for(IHangmanView i: hangmanViews) {
            i.updateView(this);
        }
    }

    @Override
    public int tryThis(char letter) {
        int tryThis = super.tryThis(letter);
        update();
        return tryThis;
    }
    /*
    @Override
    public void initNewGame(){
        super.initNewGame();
        update();
    }*/
}
