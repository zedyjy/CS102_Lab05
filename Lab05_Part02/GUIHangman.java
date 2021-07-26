package CS102.Lab05.GUIHangman;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel hangman;
		IHangmanSetup basicSetup;
		ConsoleHangmanView consoleView;
		TextFieldControlPanel textPanelControl;
		NewGameButtonControl buttonControl;
		LabelsHangmanView labelsHangmanView;
		GallowsHangmanView gallowView;
		LetterButtonControls buttonControls;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);

		textPanelControl = new TextFieldControlPanel(hangman);
		buttonControl = new NewGameButtonControl(hangman);
		labelsHangmanView = new LabelsHangmanView();
		gallowView = new GallowsHangmanView(hangman);
		hangman.addView( labelsHangmanView );
		hangman.addView( buttonControl );
		buttonControls = new LetterButtonControls("abcdefghijklmnopqrstuvwxyz");


		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);

		new SimpleJFrame( "GUIHangman", 	// title
							gallowView,			// center
							textPanelControl, buttonControl,		// north, south
							buttonControls, labelsHangmanView );	// east, west

		// this is an infinite loop reading from the console... not clever!
		ConsoleControl.controlFor(hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();
	}
} // end of class GUIHangman
