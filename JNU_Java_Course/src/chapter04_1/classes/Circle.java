package chapter04_1.classes;

public class Circle {
	public int radius;
	public String name;
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public Circle(int radius) {
		this(radius, "");
	}
	
	public Circle() {
		this(1);
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
