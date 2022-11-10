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
		frame = new JFrame("Shower Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		tLength = new JTextField(2); // tile length text field
		tWidth = new JTextField(2); // tile width text field
		tThickness = new JTextField(4); // tile thickness text field
		tCarton = new JTextField(4);
		tPrice = new JTextField(4);
		tsSide = new JTextField(4);
		tsBack = new JTextField(4);
		tsHeight = new JTextField(4);
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
		carton = Double.parseDouble(tCarton.getText());
		price = Double.parseDouble(tPrice.getText());
		sideLength = Double.parseDouble(tsSide.getText());
		backLength = Double.parseDouble(tsBack.getText());
		height = Double.parseDouble(tsHeight.getText());
		
		
	}
}
