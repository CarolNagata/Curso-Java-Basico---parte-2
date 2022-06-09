package entities;


public class Rectangle {

	public double whidth;
	public double height;
	
	public double area() {
		return whidth * height;		
	}
	
	public double perimetro() {
		return 2 * (whidth + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(whidth, 2));
	}
	
	public String toString() {
		return "AREA: " + area()
				+ "\nPERÍMETRO: " + perimetro()
				+ "\nDIAGONAL: " + diagonal();
	}
}
