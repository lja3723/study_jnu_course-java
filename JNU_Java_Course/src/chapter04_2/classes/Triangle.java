package chapter04_2.classes;

public class Triangle {
	private double width;
	private double height;
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return width * height / 2;
	}
}
