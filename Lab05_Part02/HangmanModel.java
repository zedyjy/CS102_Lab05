package CS102.Lab05.GUIHangman;

import java.util.ArrayList;

// HangmanModel - extends hangman adding support for single/multiple views & controllers
// David, 2012/4/8

public class HangmanModel extends Hangman
{
	ArrayList<IHangmanView> views;
	// IHangmanView	view;

	public HangmanModel( IHangmanSetup setup)
	{
		super(setup);
		views = new ArrayList<IHangmanView>();
		// view = null;
	}

	@Override
	public int tryThis( char letter)
	{
		int result = super.tryThis( letter);
		notifyViews();
		return result;
	}

	@Override
	public void initNewGame()
	{
		super.initNewGame();
		notifyViews();
	}


	// **********************************************************
	// * Single View Support
	// **********************************************************
//	public void addView( IHangmanView view)
//	{
//		this.view = view;
//		notifyViews();
//	}
//
//	public void notifyViews()
//	{
//		if ( view != null)
//			view.updateView( this);
//	}


	// **********************************************************
	// * Multiple View Support
	// **********************************************************
	public void addView( IHangmanView view)
	{
		views.add( view);
		// notifyViews();
		if ( view != null)
			view.updateView( this);
	}

	public void notifyViews()
	{
		if ( views != null)
			for ( IHangmanView view : views)
				view.updateView( this);
	}

	public void removeView( IHangmanView view)
	{
		views.remove( view);
	}

} // end class HangmanModel