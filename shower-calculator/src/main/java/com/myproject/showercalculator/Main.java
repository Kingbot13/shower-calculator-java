package com.myproject.showercalculator;

public class Main {

	public static void main(String[] args) {
		GUI gui = new GUI();
		Tile tile;
		Shower shower;
		if(gui.tileLength != 0 && gui.tileWidth != 0) {
			tile = new Tile(gui.tileLength, gui.tileWidth, gui.tileThickness, gui.carton, gui.price);
		}
		if(gui.backLength != 0.0 && gui.sideLength != 0.0 && gui.height != 0.0) {
			shower = new Shower(gui.sideLength, gui.backLength, gui.height);
		}
	}

}
