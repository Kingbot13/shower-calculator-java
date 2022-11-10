package com.myproject.showercalculator;

public class Calculator {
	public static double sf;
	public static double totalCartons;
	public static double squareFootage(double side, double back, double height) {
		return sf = side * height * 2 + back * height; 
	}
	
	public static double cartons(double carton) {
		return totalCartons = sf / carton;
	}
	
	public static double price(double p) {
		return totalCartons * p;
	}
}
