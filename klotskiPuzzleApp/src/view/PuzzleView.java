package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

import model.Board;
import model.Model;
import model.Tile;

public class PuzzleView extends JPanel {
	Model model;
	
	/**
	 * Create the panel.
	 */
	public PuzzleView(Model model) {
		super();
		this.model = model;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		Board board = model.getBoard();
		
		for (Iterator<Tile> it = board.iterator(); it.hasNext(); ) {
			Tile t = it.next();
			
			// figure out way to draw things. CONVERT abstract details into real pixels
			
			//for each tile:
			//take its width and length and multiply them by 100ish (pixels)
			//take its x and y positions (which are basically rows and columns) and multiply by 100ish
			//print the rectangles in the panel(?) at the x and y pos 
			//print all the tiles one color except the winning tile, the 2x2 tile
			
			if(t.getSelection() == true) {
				g.setColor(Color.blue); //currently selected tile is another color, if there is one 
			}
			else if(t.getWidth() == 2 && t.getLength() == 2) {
				g.setColor(Color.red);  //winning tile
			}
			else {
				g.setColor(Color.white);  //other tiles
			}
			g.fillRect(((int)(100*t.getxPos())), (int) (100*t.getyPos()), (int) (90*t.getWidth()), (int) (90*t.getLength()));
			
		}
		
		//bottom line (visualization of bottom boundary of board)
		g.setColor(Color.black);
		g.fillRect(0, 500, 400, 6);

		//exit line
		g.setColor(Color.green);
		g.fillRect(90, 500, 180, 10);

	}

}
