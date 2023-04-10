package chapter04_1.classes;

public class Point {
	public double x;
	public double y;
	
	public Point() {
		x = y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
}
