package chapter05.classes;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		this("White");
	}
	
	public ColorPoint(String color) {
		this(0, 0, color);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		setColor(color);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void showPoint() {
		System.out.print(color);
		super.showPoint();
	}
}