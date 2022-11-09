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
	public GUI() {
		frame = new JFrame("Shower Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		tLength = new JTextField(); // tile length text field
		tWidth = new JTextField(); // tile width text field
		button = new JButton("Submit");
		frame.getContentPane().add(button); // adds button to frame
		frame.setVisible(true);
		
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
