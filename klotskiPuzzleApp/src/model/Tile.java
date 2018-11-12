package model;

import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

public class Tile {
	double width; //the physical width of the tile
	double length; //the physical length of the tile
	List<Point> points;
	double xPos; //the x position of the upper left corner of the tile
	double yPos; //the y position of the upper left corner of the tile
	boolean isSelected; //true if selected piece 
	
	public Tile(int width, int length, List<Point> points, int xPos, int yPos, boolean isSelected) {
		this.width = width;
		this.length = length;
		this.points = points;
		this.xPos = xPos;
		this.yPos = yPos;
		this.isSelected = isSelected;
	}
	//setters for attributes
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	//public void setPoints() {
		//how do i write this setter?
	//}
	
	public void setxPos(double d) {
		this.xPos = d;
	}
	
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	
	public void setSelection(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	//getters for attributes
	public double getWidth() {
		return  width;
	}
	
	public double getLength() {
		return length;
	}
	
	//public List getPoints() {
		//
	//}
	
	public double getxPos() {
		return xPos;
	}
	
	public double getyPos() {
		return yPos;
	}
	
	public boolean getSelection() {
		return isSelected;
	}

}
