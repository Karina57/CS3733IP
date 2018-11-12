package model;

import java.awt.Point;
import java.util.ArrayList;

import junit.framework.TestCase;

public class TestModel extends TestCase {

	public void testValidUp() {
		Tile t = new Tile(1, 1, new ArrayList<Point>(), 1, 1, false);
				//Tile tile = new Tile(2, 2, Arrays.asList(new Point(0, 1)), 1, 1, false);
		Tile selectedTile = new Tile(1, 1, new ArrayList<Point>(), 1, 1, true);
		
		assertFalse(model.validUp(selectedTile, t));
	}
}
