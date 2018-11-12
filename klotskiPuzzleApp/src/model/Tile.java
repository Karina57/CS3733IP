package model;

public class Tile {
	int width; //the physical width of the tile
	int length; //the physical length of the tile
	int xPos; //the x position of the upper left corner of the tile
	int yPos; //the y position of the upper left corner of the tile
	boolean isSelected; //true if selected piece 
	
	public Tile(int width, int length, int xPos, int yPos, boolean isSelected) {
		this.width = width;
		this.length = length;
		this.xPos = xPos;
		this.yPos = yPos;
		this.isSelected = isSelected;
	}
	
	//setters for attributes
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public void setSelection(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	//getters for attributes
	public int getWidth() {
		return  width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getxPos() {
		return xPos;
	}
	
	public int getyPos() {
		return yPos;
	}
	
	public boolean getSelection() {
		return isSelected;
	}

}
