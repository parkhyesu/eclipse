package edu.bit.ex;

public class Rectangle {
	double width, height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
}
