package controller;

import java.util.Iterator;

import javax.swing.JButton;

import model.Model;
import model.Tile;
import view.KlotskiApp;

public class MovePieceController {
	Model model;  //needs the model because it needs the tiles to know which is selected
	KlotskiApp app; //needs to listen to the app to know when buttons are pressed
	
	public MovePieceController (KlotskiApp app, Model m) {
		this.model = m;
		this.app = app;
	}
	
	public void move (Tile selectedTile, JButton button) { 	
		for (Iterator<Tile> it = model.getBoard().iterator(); it.hasNext(); ) {
			Tile t = it.next();
			if (button.getText() == "^") {	
				if (model.validUp(selectedTile, t) == true);
					{
						moveUp(selectedTile);
						app.repaint();
					}
			} 
			else if (button.getText() == "V") {
				if (model.validDown(selectedTile, t) == true);
					{if (selectedTile.getWidth() == 2 && selectedTile.getLength() == 2 && selectedTile.getyPos() == 4) {
						this.app.setWinLabel("Yay! You win!");
					}
					else 
						moveDown(selectedTile);
						app.repaint();	
					}
			}
			else if(button.getText() == ">") {
				if (model.validRight(selectedTile, t) == true);
					{
						moveLeft(selectedTile);
						app.repaint();
					}
			}
			else if(button.getText() == "<") {
				if (model.validLeft(selectedTile, t) == true);
					{
						moveRight(selectedTile);
						app.repaint();
					}
			}
		}

		//check if there is a tile whose current values are where we want to move to (validity functions)
		
		//if button is up, set y value of the piece to current y value - 1
		//if button is down, set y value of the piece to current y value + 1
		//if button is left, set x value to current x value - 1
		//if button is right, set x value to current x value + 1
		

		//and increment the move counter 
		model.incrementMove(); 
		
		//at the end, setSelection(false) for the tile we just moved 
		//empty out the selected piece again, and reset the selected tile to not be selected anymore
		selectedTile.setSelection(false);
		model.setSelectTile(null);
		app.repaint();
		
	}

	//these functions do the actual moving
	public void moveUp(Tile selectedTile) {
		selectedTile.setyPos(selectedTile.getyPos() - 0.1);
	}
	
	public void moveDown(Tile selectedTile) {
		selectedTile.setyPos(selectedTile.getyPos() + 0.1);
	}
	
	public void moveLeft(Tile selectedTile) {
		selectedTile.setxPos(selectedTile.getxPos() + 0.1);
	}
	
	public void moveRight(Tile selectedTile) {
		selectedTile.setxPos(selectedTile.getxPos() - 0.1);
	}
}
	

