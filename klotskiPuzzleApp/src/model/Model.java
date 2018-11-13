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
		double normalTileHorizMidline = (tile.length / 2) + tile.yPos; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.length / 2) + selectedTile.yPos; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.width / 2) + tile.xPos; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.width/ 2) + selectedTile.xPos; //the vertical midline of the selected tile
		
		if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectedTile.yPos -1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectedTile.yPos -1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == normalTileVertMidline && selectedTile.yPos -1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectTileHorizMidline -1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectTileHorizMidline -1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == normalTileVertMidline && selectTileHorizMidline -1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == tile.xPos && selectedTile.yPos -1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == tile.xPos && selectedTile.yPos -1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == normalTileVertMidline && selectedTile.yPos -1 == tile.yPos)
			return false;
				//&& selectedTile.yPos -1 >= 0
		else 
			return true;
	}
		
	public boolean validDown(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.length / 2) + tile.yPos; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.length / 2) + selectedTile.yPos; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.width / 2) + tile.xPos; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.width/ 2) + selectedTile.xPos; //the vertical midline of the selected tile
		
		if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectedTile.yPos +1 == tile.yPos)
				return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectedTile.yPos +1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == normalTileVertMidline && selectedTile.yPos +1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectTileHorizMidline +1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == tile.xPos && selectTileHorizMidline +1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos == normalTileVertMidline && selectTileHorizMidline +1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == tile.xPos && selectedTile.yPos +1 == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == tile.xPos && selectedTile.yPos +1 == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline == normalTileVertMidline && selectedTile.yPos +1 == tile.yPos)
			return false;
				//&& selectedTile.yPos +1 <= 4
		else 
			return true;
	}
	
	
	public boolean validLeft(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.length / 2) + tile.yPos; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.length / 2) + selectedTile.yPos; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.width / 2) + tile.xPos; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.width/ 2) + selectedTile.xPos; //the vertical midline of the selected tile
		
		if (tile.isSelected == false && selectedTile.xPos -1 == tile.xPos && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos -1 == tile.xPos && selectedTile.yPos == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos -1 == normalTileVertMidline && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos -1 == tile.xPos && selectTileHorizMidline == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos -1 == tile.xPos && selectTileHorizMidline == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos -1 == normalTileVertMidline && selectTileHorizMidline == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline -1 == tile.xPos && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline -1 == tile.xPos && selectedTile.yPos == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline -1 == normalTileVertMidline && selectedTile.yPos == tile.yPos)
			return false;
				//&& selectedTile.xPos -1 >= 0
		else 
			return true;
	}
	
	public boolean validRight(Tile selectedTile, Tile tile) {
		double normalTileHorizMidline = (tile.length / 2) + tile.yPos; //the horizontal midline of a tile
		double selectTileHorizMidline = (selectedTile.length / 2) + selectedTile.yPos; //the horizontal midline of the selected tile
		double normalTileVertMidline = (tile.width / 2) + tile.xPos; //the vertical midline of a tile
		double selectTileVertMidline = (selectedTile.width/ 2) + selectedTile.xPos; //the vertical midline of the selected tile
		
		if (tile.isSelected == false && selectedTile.xPos +1 == tile.xPos && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos +1 == tile.xPos && selectedTile.yPos == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos +1 == normalTileVertMidline && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos +1 == tile.xPos && selectTileHorizMidline == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos +1 == tile.xPos && selectTileHorizMidline == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectedTile.xPos +1 == normalTileVertMidline && selectTileHorizMidline == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline +1 == tile.xPos && selectedTile.yPos == tile.yPos)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline +1 == tile.xPos && selectedTile.yPos == normalTileHorizMidline)
			return false;
		else if (tile.isSelected == false && selectTileVertMidline +1 == normalTileVertMidline && selectedTile.yPos == tile.yPos)
			return false;
				//&& selectedTile.xPos +1 <= 3
		else 
			return true;
	}
	
}
