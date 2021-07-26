package CS102.Lab05.GUIHangman;

import java.util.Scanner;

// ConsoleControl
// David, 7/4/2013

public class ConsoleControl
{
	public static void controlFor( Hangman hangman)
	{
		Scanner scan = new Scanner( System.in);

		char	letter;

		do
		{
			System.out.print( "Enter letter: ");
			letter = scan.next().charAt(0);

			System.out.println( "found " + hangman.tryThis( letter) + " occurances.");
			System.out.println();

		} while (!hangman.isGameOver());
	}
}
