package chapter04_1.classes;

public class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void printMe() {
		System.out.println(width + " x "  + height);
	}
	double getArea() {
		return width * height;
	}
	public Rect larger(Rect another) {
		if (getArea() > another.getArea())
			return this;
		else
			return another;
	}
}
