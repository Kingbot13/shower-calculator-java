package com.myproject.showercalculator;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Shower Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		JButton button = new JButton("Submit");
		frame.getContentPane().add(button); // adds button to frame
		frame.setVisible(true);
	}

}
