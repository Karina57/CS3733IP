package controller;

import java.util.Iterator;

import javax.swing.JButton;

import model.Model;
import model.Tile;
import view.KlotskiApp;

public class MovePieceController {
	Model model;  //needs the model because it needs the tiles to know which is selected
	KlotskiApp app; //needs to listen to the app to know when buttons are pressed
	JButton button;
	
	public MovePieceController (KlotskiApp app, Model m, JButton b) {
		this.model = m;
		this.app = app;
		this.button = b;
	}
	
	public void move (Tile selectedTile, JButton b) { 	
		for (Iterator<Tile> it = model.getBoard().iterator(); it.hasNext(); ) {
			Tile t = it.next();
			if (this.button.getText() == "^") {	
				if (model.validUp(selectedTile, t) == true);
					{moveUp(selectedTile);}
			} 
			else if (this.button.getText() == "V") {
				if (model.validDown(selectedTile, t) == true);
					{moveDown(selectedTile);}
			}
			else if(this.button.getText() == ">") {
				if (model.validRight(selectedTile, t) == true);
					{moveLeft(selectedTile);}
			}
			else if(this.button.getText() == "<") {
				if (model.validLeft(selectedTile, t) == true);
				{moveRight(selectedTile);}
			}
		}

		//check if there is a tile whose current values are where we want to move to (validity functions)
		
		//if button is up, set y value of the piece to current y value - 1
		//if button is down, set y value of the piece to current y value + 1
		//if button is left, set x value to current x value - 1
		//if button is right, set x value to current x value + 1
		

		//and increment the move counter 
		model.incrementMove(); 
		app.repaint();
		
		//at the end, setSelection(false) for the tile we just moved 
		//empty out the selected piece again, and reset the selected tile to not be selected anymore
		selectedTile.setSelection(false);
		model.setSelectTile(null);
		
	}

	//these functions do the actual moving
	public void moveUp(Tile selectedTile) {
		selectedTile.setyPos(selectedTile.getyPos() - 1);
	}
	
	public void moveDown(Tile selectedTile) {
		selectedTile.setyPos(selectedTile.getyPos() + 1);
	}
	
	public void moveLeft(Tile selectedTile) {
		selectedTile.setxPos(selectedTile.getxPos() - 1);
	}
	
	public void moveRight(Tile selectedTile) {
		selectedTile.setxPos(selectedTile.getxPos() + 1);
	}
}
	

