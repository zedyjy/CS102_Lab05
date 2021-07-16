package CS102.Lab05;

import java.util.Scanner;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		HangmanModel hangman= new HangmanModel(new BasicSetup());;

		// PROGRAM CODE
		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.

		hangman.addView(new ConsoleHangmanView());

		do{
			String letter = scan.nextLine();
			hangman.tryThis(letter.charAt(0));
		}while(!hangman.isGameOver());

		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
