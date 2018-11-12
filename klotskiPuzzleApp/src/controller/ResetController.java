package controller;

import model.Board;
import model.Model;
import view.KlotskiApp;

public class ResetController {
	
	KlotskiApp app;
	Board b;
	
	public ResetController(KlotskiApp app, Board b) {
		this.board = b;
		this.app = app;
	}
	
	public void resetBoard() {
		board.resetBoard();
	}

}
