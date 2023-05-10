package chapter05.classes_object;

public class WrongPoint {
	int x, y;
	public WrongPoint() {}
	public WrongPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	//이 메서드는 오버라이딩이 아니고 오버로딩 !!
	//public boolean equals(WrongPoint param) {
	public boolean equals(Object param) {
		WrongPoint obj = (WrongPoint)param;
		System.out.println("실행됨");
		return x == obj.x && y == obj.y;
	}
}
