package chapter05.classes_poly.shape;

public class Shape {
	public Shape next; 
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}
