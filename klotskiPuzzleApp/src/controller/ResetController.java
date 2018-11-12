package controller;

import model.Board;
import view.KlotskiApp;

public class ResetController {
	
	KlotskiApp app;
	Board board;
	
	public ResetController(KlotskiApp app, Board board) {
		this.board = board;
		this.app = app;
	}
	
	public void resetBoard() {
		board.resetBoard();
	}

}
