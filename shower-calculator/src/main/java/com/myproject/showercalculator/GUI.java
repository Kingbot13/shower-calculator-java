package com.myproject.showercalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
	private JFrame frame;
	private JTextField tLength;
	private JTextField tWidth;
	private JButton button;
	private JTextField tThickness;
	public int tileLength;
	public int tileWidth;
	public double tileThickness;
	
	public GUI() {
		frame = new JFrame("Shower Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		tLength = new JTextField(2); // tile length text field
		tWidth = new JTextField(2); // tile width text field
		tThickness = new JTextField(4); // tile thickness text field
		button = new JButton("Submit");
		
		// add components to frame
		frame.getContentPane().add(button); // adds button to frame
		frame.getContentPane().add(tLength);
		frame.getContentPane().add(tWidth);
		frame.getContentPane().add(tThickness);
		frame.setVisible(true);
		
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		tileLength = Integer.parseInt(tLength.getText());
		tileWidth = Integer.parseInt(tWidth.getText());
		tileThickness = Double.parseDouble(tThickness.getText());
		
	}
}
