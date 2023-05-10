package chapter05.classes_object;

public class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		return x == ((Point)obj).x & y == ((Point)obj).y;			
	}
}
