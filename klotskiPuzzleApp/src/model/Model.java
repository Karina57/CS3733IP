package model;

public class Model {
	int numberOfMoves;
	Board board; 
	Tile selectedTile;

	
	public Model() {
		board = new Board();
		resetMoves();
		selectedTile = null;
	}

	//functions relating to number of moves
	public int getNumMoves() { return numberOfMoves; }
	public void resetMoves() { numberOfMoves = 0; }
	public void incrementMove() { numberOfMoves++; }
	 
	//functions relating to board
	public Board getBoard() { return board; }

	//functions relating to selected tile
	public void setSelectTile(Tile tile) { this.selectedTile = tile; }
	public Tile getSelectedTile() {	return selectedTile; }
	
	//functions to check if a move in a direction is valid (ie if a tile is occupying the space where the tile is trying to move)
	
	//public boolean validUp(Tile selectedTile, Tile tile) {
	//	tile.points.forEach(Point pt) {
	//		if (selectedTile.getxPos() == tile.getxPos() 
	//				|| selectedTile.getxPos() == tile.getxPos() + Point.x 
	//				|| selectedTile.getyPos() - 1 == tile.getyPos()
	//				|| selectedTile.getyPos() - 1 == tile.getyPos() + Point.y
	//				|| selectedTile.getyPos() - 1 <= 0 
	//				|| selectedTile)
	//			return false;
	//		else 
	//			return true;
	//	}
	//}	
	
	public boolean validUp(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.yPos + tile.length) / 2; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.yPos + selectedTile.length) / 2; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.xPos + tile.width) /2; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.xPos + selectedTile.width) /2; //the vertical midline of a tile 
		
		if (selectedTile.yPos - 1 != tile.yPos 
				&& selectedTile.yPos - 1 != normalTileHorizMidline 
				&& selectTileHorizMidline - 1 != tile.yPos 
				&& selectTileHorizMidline - 1 != normalTileHorizMidline
				&& selectedTile.xPos != tile.xPos 
				&& selectedTile.xPos != normalTileVertMidline 
				&& selectTileVertMidline != tile.xPos 
				&& selectTileVertMidline != normalTileVertMidline
				&& selectedTile.yPos - 1 >= 0) //not going to go above the board boundary
			return true;
		else 
			return false;
	}
	
	public boolean validDown(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.yPos + tile.length) / 2; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.yPos + selectedTile.length) / 2; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.xPos + tile.width) / 2; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.xPos + selectedTile.width) / 2; //the vertical midline of a tile 
		
		if (selectedTile.yPos + 1 != tile.yPos 
				&& selectedTile.yPos + 1 != normalTileHorizMidline 
				&& selectTileHorizMidline + 1 != tile.yPos 
				&& selectTileHorizMidline + 1 != normalTileHorizMidline
				&& selectedTile.xPos != tile.xPos 
				&& selectedTile.xPos != normalTileVertMidline 
				&& selectTileVertMidline != tile.xPos 
				&& selectTileVertMidline != normalTileVertMidline
				&& selectedTile.yPos <= 4) //not going to go below the board boundary
			return true;
		else 
			return false;
	}
	
	public boolean validLeft(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.yPos + tile.length) / 2; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.yPos + selectedTile.length) / 2; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.xPos + tile.width) / 2; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.xPos + selectedTile.width)/ 2; //the vertical midline of the selected tile
		
		if (selectedTile.xPos - 1 != tile.xPos 
				&& selectedTile.xPos - 1 != normalTileVertMidline 
				&& selectTileVertMidline - 1 != tile.xPos 
				&& selectTileVertMidline - 1 != normalTileVertMidline 
				&& selectedTile.yPos != tile.yPos 
				&& selectedTile.yPos != normalTileHorizMidline
				&& selectTileHorizMidline != tile.yPos 
				&& selectTileHorizMidline != normalTileHorizMidline
				&& selectedTile.xPos >= 0) //not going to go to the left of the board boundary
			return true;
		else 
			return false;
	}
	
	public boolean validRight(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.yPos + tile.length) / 2; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.yPos + selectedTile.length) / 2; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.xPos + tile.width) / 2; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.xPos + selectedTile.width)/ 2; //the vertical midline of the selected tile
		
		if (selectedTile.xPos + 1 != tile.xPos 
				&& selectedTile.xPos + 1 != normalTileVertMidline 
				&& selectTileVertMidline + 1 != tile.xPos 
				&& selectTileVertMidline + 1 != normalTileVertMidline 
				&& selectedTile.yPos != tile.yPos 
				&& selectedTile.yPos != normalTileHorizMidline
				&& selectTileHorizMidline != tile.yPos 
				&& selectTileHorizMidline != normalTileHorizMidline
				&& selectedTile.xPos <= 3) //not going to go to the right of the board boundary  
			return true;
		else 
			return false;
	}
	
}
