package model;

import java.util.Arrays;

import junit.framework.TestCase;

public class TestTile {
	
	//public void testSetWidth() {
	//	Tile tile new Tile(2, 1, Arrays.asList(new Point(1, 0)), 2, 1);	
	//}
	
	public void testGetWidth() {
		Tile tile = new Tile(2, 2, Arrays.asList(new Point(0, 1)), 1, 1, false);
		
		assertEquals(2, tile.getWidth());
	}
	
	public void testGetLength() {
		Tile tile = new Tile(2, 1, Arrays.asList(new Point(1, 0)), 0, 1, false);
		
		assertEquals(1, tile.getLength());
	}
	
	public void testGetxPos() {
		Tile tile = new Tile(2, 1, Arrays.asList(new Point(1, 1)), 2, 1, false);
		
		assertEquals(2, tile.getxPos());
	}
	
	public void testGetyPos() {
		Tile tile = new Tile(2, 2, Arrays.asList(new Point(0, 1)), 3, 3, false);
		
		assertEquals(3, tile.getyPos());
	}
	
	public void testGetSelection() {
		Tile tile = new Tile(1, 2, Arrays.asList(new Point(1, 1)), 2, 1, false);
		
		assertFalse(tile.isSelected());
	}


}
