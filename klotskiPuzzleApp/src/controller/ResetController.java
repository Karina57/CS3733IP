package controller;

import model.Board;
import model.Model;
import view.KlotskiApp;

public class ResetController {
	
	Board board;
	Model model;
	KlotskiApp app;

	public ResetController(KlotskiApp app, Model model, Board board) {
		this.board = board;
		this.model = model;
		this.app = app;
	}
	
	public void resetBoard() {
		board.resetBoard();
		model.resetMoves();
		app.repaint();
	}

}
