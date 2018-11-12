package controller;

import java.awt.Point;
import java.util.Iterator;

import model.Model;
import model.Tile;
import view.KlotskiApp;

public class SelectPieceController {
	Model model;
	KlotskiApp app;
	
	public SelectPieceController (KlotskiApp app, Model m) {
		this.model = m;
		this.app = app;
	}
	
	public void select (Point pt) {
		System.out.println(pt); 
		
		for (Iterator<Tile> it = model.getBoard().iterator(); it.hasNext(); ) {
			Tile t = it.next(); 
			boolean caseOne = pt.x > 100*t.getxPos();
			boolean caseTwo = pt.x < (100*t.getxPos() + 100*t.getWidth());
			boolean caseThree = pt.y > 100*t.getyPos();
			boolean caseFour = pt.y < (100*t.getyPos() + 100*t.getLength());
			if(caseOne && caseTwo && caseThree && caseFour) {
				t.setSelection(true);
				model.setSelectTile(t);
				app.repaint();
				System.out.println(t.getWidth());
				System.out.println(t.getLength());
				break;
			}
		}
	
	//take in application and puzzle, and in select piece method, 
	//figure out where mouse click is
	//take the x and y of the click
	//compare the x and y of the click to the x*100 and y*100 of each tile
	//when it finds the right tile, 
	//change the boolean in tile to be selected 
	//refresh display so that the color changes! repaint (same in mover)
	}
}
