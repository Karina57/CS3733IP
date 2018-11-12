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
			
			if(t.getWidth() == 2 && t.getLength() == 2) {
				g.setColor(Color.red); 	//winning tile
			}
			else if(t.getSelection() == true) {
				g.setColor(Color.blue); //currently selected tile is another color, if there is one 
			}
			else {
				g.setColor(Color.white);  //other tiles
			}
			g.fillRect((5+(90*t.getxPos())), 5+(90*t.getyPos()), (85*t.getWidth()), (85*t.getLength()));
			
		}
		
		//bottom line (visualization of bottom boundary of board)
		g.setColor(Color.black);
		g.fillRect(0, 465, 400, 6);

		//exit line
		g.setColor(Color.green);
		g.fillRect(90, 465, 180, 10);

	}

}
