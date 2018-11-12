package model;

import java.util.Iterator;
import java.util.LinkedList;

public class Board {
	int topBoundary;
	int bottomBoundary; 
	int leftBoundary; 
	int rightBoundary;
	int winningRow;
	int winningColumn; 
	LinkedList<Tile> tileSet;
	

	// must provide:
	//    move piece in direction
	public void moveSelectedPiece(int direction) { 
		
	}
	
	// make tiles available
	public Iterator<Tile> iterator() { 
		return tileSet.iterator();
	}
	
	public Board() {
		resetBoard();   //COME BACK AND LOOK AT THIS
	}
	
	public void resetBoard() {
		//Set the boundaries of the board, and the tile location to win
		this.topBoundary = 0;
		this.bottomBoundary = 5;
		this.leftBoundary = 0;
		this.rightBoundary = 4; 
		this.winningRow = 5;
		this.winningColumn = 1;
		
		//Make the ten tiles with the correct sizes and positions
		Tile rectOne = new Tile(1, 2, 0, 0, false);
		Tile winningTile = new Tile(2, 2, 1, 0, false);
		Tile rectTwo = new Tile(1, 2, 3, 0, false); 
		Tile rectThree = new Tile(1, 2, 0, 2, false);
		Tile squareOne = new Tile (1, 1, 1, 2, false);
		Tile squareTwo = new Tile(1, 1, 2, 2, false);
		Tile rectFour = new Tile(1, 2, 3, 2, false);
		Tile squareThree = new Tile(1, 1, 1, 3, false);
		Tile squareFour = new Tile(1, 1, 2, 3, false);
		Tile rectFive = new Tile(2, 1, 1, 4, false);
		
		//Put the ten tiles in a linked list
		tileSet = new LinkedList<Tile>();
		tileSet.add(rectOne);
		tileSet.add(winningTile);
		tileSet.add(rectTwo);
		tileSet.add(rectThree);
		tileSet.add(squareOne);
		tileSet.add(squareTwo);
		tileSet.add(rectFour);
		tileSet.add(squareThree);
		tileSet.add(squareFour);
		tileSet.add(rectFive);
	} 
	
	//If I need the getters later, I can write them here. 
	//I don't need setters, because these values stay the same throughout this project.
	

}