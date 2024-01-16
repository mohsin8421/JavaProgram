package com.jdbc;



//Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


	//Shape class
	class Shapes {
		// Method to get the area (placeholder implementation)
		public double getArea() {
			return 0.0;
		}
	}



	//Rectangle class, subclass of Shape
	class Rectangle extends Shapes {
		// Attributes specific to Rectangle
		private double length;
		private double width;

		// Constructor for Rectangle
		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
		}

		// Override the getArea() method to calculate the area of a rectangle
		@Override
		public double getArea() {
			return length * width;
		}
	}

	public class AreaOfRectangle {

	public static void main(String[] args) {
		 // Create a Rectangle object
	     Rectangle rectangle = new Rectangle(7, 3);

	     // Get and print the area of the rectangle
	     System.out.println("Area of the rectangle: " + rectangle.getArea());

	}

}



