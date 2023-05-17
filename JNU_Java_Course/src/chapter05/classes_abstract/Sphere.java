package chapter05.classes_abstract;

public class Sphere extends Solid {
	private double radius;
	
	public Sphere() {
		this.radius = 0.0;
	}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double volume() {		
		return 4.0 / 3.0 * Math.PI * radius * radius * radius;
	}
	
	public double surfaceArea() {		
		return 4.0 * Math.PI * radius * radius;
	}
	
	public String toString() {
		return new String("Sphere: radius = " + radius);
	}
}
