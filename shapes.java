package com.jdbc;
		
	//Drawable interface
	interface Drawable {
		void draw();
	}

	//Circle class implementing Drawable interface
	class Circle implements Drawable {
		public void draw() {
			System.out.println("Drawing a circle");
     // Add actual drawing logic for a circle here
		}
	}

	//Rectangle class implementing Drawable interface
	class Rectangle implements Drawable {
		public void draw() {
     System.out.println("Drawing a rectangle");
     // Add actual drawing logic for a rectangle here
		}
	}

	//Triangle class implementing Drawable interface
	class Triangle implements Drawable {
		public void draw() {
     System.out.println("Drawing a triangle");
     // Add actual drawing logic for a triangle here
		}
	}

	//Main class
	public class shapes {
		public static void main(String[] args) {
			// Create objects of different shapes
			Drawable circle = new Circle();
			Drawable rectangle = new Rectangle();
			Drawable triangle = new Triangle();

			// Draw each shape
			circle.draw();
			rectangle.draw();
			triangle.draw();
		}
}
