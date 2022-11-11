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
	private JTextField tCarton;
	private JTextField tPrice;
	private JTextField tsSide;
	private JTextField tsBack;
	private JTextField tsHeight;
	public int tileLength;
	public int tileWidth;
	public double tileThickness;
	public double carton;
	public double price;
	public double sideLength;
	public double backLength;
	public double height;
	
	
	public GUI() {
		// create frame
		frame = new JFrame("Shower Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		// create components
		JLabel lLength = new JLabel("Tile Length");
		tLength = new JTextField(2); // tile length text field
		JLabel lWidth = new JLabel("Tile Width");
		tWidth = new JTextField(2); // tile width text field
		JLabel lThickness = new JLabel("Tile Thickness");
		tThickness = new JTextField(4); // tile thickness text field
		JLabel lCarton = new JLabel("Carton Size");
		tCarton = new JTextField(4);
		JLabel lPrice = new JLabel("Price");
		tPrice = new JTextField(4);
		JLabel lSide = new JLabel("Side");
		tsSide = new JTextField(4);
		JLabel lBack = new JLabel("Back");
		tsBack = new JTextField(4);
		JLabel lHeight = new JLabel("Height");
		tsHeight = new JTextField(4);
		button = new JButton("Submit");
		
		// add components to frame
		frame.add(button); 
		frame.add(lLength);
		frame.add(tLength);
		frame.add(lWidth);
		frame.add(tWidth);
		frame.add(lThickness);
		frame.add(tThickness);
		frame.add(lCarton);
		frame.add(tCarton);
		frame.add(lPrice);
		frame.add(tPrice);
		frame.add(lSide);
		frame.add(tsSide);
		frame.add(lBack);
		frame.add(tsBack);
		frame.add(lHeight);
		frame.add(tsHeight);
		frame.pack();
		frame.setVisible(true);
		
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		tileLength = Integer.parseInt(tLength.getText());
		tileWidth = Integer.parseInt(tWidth.getText());
		tileThickness = Double.parseDouble(tThickness.getText());
		carton = Double.parseDouble(tCarton.getText());
		price = Double.parseDouble(tPrice.getText());
		sideLength = Double.parseDouble(tsSide.getText());
		backLength = Double.parseDouble(tsBack.getText());
		height = Double.parseDouble(tsHeight.getText());
		
		
	}
}
