package com.myproject.showercalculator;

public class Main {

	public static void main(String[] args) {
		GUI gui = new GUI();
		// TODO add price and carton size for tiles
		if(gui.tileLength != 0 && gui.tileWidth != 0) {
			Tile tile = new Tile(gui.tileLength, gui.tileWidth, gui.tileThickness, 0.0, 0.0);
			
		}
	}

}
