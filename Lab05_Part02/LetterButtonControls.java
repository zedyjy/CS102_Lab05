package CS102.Lab05.GUIHangman;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 * LetterButtonControls - keyboard for MVC demo of Hangman, but general.
 *
 * @author David
 * @version 1.00 2012/4/8
 */
public class LetterButtonControls extends JPanel
{
	public LetterButtonControls(String letters)
	{
		this( letters, 2, 13);
	}

	public LetterButtonControls( String letters, int rows, int cols)
	{
		setBorder( new TitledBorder("Choose a letter...") );
		setLayout( new GridLayout( rows, cols) );

		for( int i = 0; i < letters.length(); i++) {
			JButton b = new JButton( "" + letters.charAt(i) );
			b.setMargin( new Insets( 1, 2, 1, 2) );
			add( b);
		}
	}

	public void addActionListener( ActionListener l)
	{
		Component[] buttons = getComponents();
		for ( Component b : buttons )
		{
			( (JButton) b).addActionListener( l);
		}
	}

	public void setEnabledAll( boolean state)
	{
		for ( Component c : getComponents() ) {
			((JButton) c).setEnabled( state);
		}
	}

	public void setDisabled( String letters)
	{
		for ( Component c : getComponents() ) {
			char ch = ((JButton) c).getLabel().charAt(0);
			if ( letters.indexOf(ch) >= 0)
				((JButton) c).setEnabled( false);
		}
	}
}