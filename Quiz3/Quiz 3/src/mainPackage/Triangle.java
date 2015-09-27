package mainPackage;

public class Triangle {
	
	// Private attributes
	private double side1, side2, side3 = 1.0;
	
	// No-arg constructor
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0; 
		side3 = 1.0;
	}
	
	// Constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Public setters
	public double setSide1(double side1) {
		return this.side1 = side1;
	}
	public double setSide2(double side2) {
		return this.side2 = side2;
	}
	public double setSide3(double side3) {
		return this.side3 = side3;
	}
	
	// Public getters
	public double getSide1(double side1) {
		return this.side1;
	}
	public double getSide2(double side2) {
		return this.side2;
	}
	public double getSide3(double side3) {
		return this.side3;
	}
	
	// Area
	public double getArea() {
		// Heron's formula to calculate the area given 3 sides.
		double p = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}
	
	// Perimeter
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	// toString() method
	public String toString() {
		String sSide1 = String.valueOf(this.side1);
		String sSide2 = String.valueOf(this.side2);
		String sSide3 = String.valueOf(this.side3);
		return "Side 1: " + sSide1 + "\n" + "Side 2: " + sSide2 + "\n" + "Side 3: " + sSide3;
	}
}
