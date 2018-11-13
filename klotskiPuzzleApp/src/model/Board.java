package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
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
	//public void moveSelectedPiece(int direction) { 
	//	
	//}
	
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
		//this.tileSet = tileSet;
		
		//Make the ten tiles with the correct sizes and positions
		Tile rectOne = new Tile(1, 2, Arrays.asList(new Point(0, 1)), 0, 0, false);
		Tile winningTile = new Tile(2, 2, Arrays.asList(new Point(1, 0), new Point (0, 1), new Point (1, 1)), 1, 0, false);
		Tile rectTwo = new Tile(1, 2, Arrays.asList(new Point(0, 1)), 3, 0, false); 
		Tile rectThree = new Tile(1, 2, Arrays.asList(new Point(0, 1)), 0, 2, false);
		Tile squareOne = new Tile (1, 1, new ArrayList<Point>(), 1, 2, false);
		Tile squareTwo = new Tile(1, 1, new ArrayList<Point>(), 2, 2, false);
		Tile rectFour = new Tile(1, 2, Arrays.asList(new Point(0, 1)), 3, 2, false);
		Tile squareThree = new Tile(1, 1, new ArrayList<Point>(), 1, 3, false);
		Tile squareFour = new Tile(1, 1, new ArrayList<Point>(), 2, 3, false);
		Tile rectFive = new Tile(2, 1, Arrays.asList(new Point(1, 0)), 1, 4, false);
		
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
	
	//If I need the getters later, I can write them here 
	public int getTopBoundary() {
		return topBoundary;
	}
	
	public int getBottomBoundary() {
		return bottomBoundary;
	}
	
	public int getLeftBoundary() {
		return leftBoundary;
	}
	
	public int getRightBoundary() {
		return rightBoundary;
	}
	
	public int getWinningRow() {
		return winningRow;
	}
	
	public int getWinningColumn() {
		return winningColumn;
	}
	
	//I don't need setters, because these values stay the same throughout this project.
	

}
