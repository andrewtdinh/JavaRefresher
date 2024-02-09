package Oops;

public class Circle extends Shape {

	public void displayShape() {
		System.out.println("Shape is Circle");
	}
	
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		
		c.displayShape();
		t.displayShape();
	}
	
}
