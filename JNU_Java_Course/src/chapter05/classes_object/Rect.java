package chapter05.classes_object;

public class Rect {
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean equals(Object o) {
		return area() == ((Rect)o).area();
	}
	
}
