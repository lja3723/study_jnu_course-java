package chapter05.classes_object;

public class WrongPoint {
	int x, y;
	public WrongPoint() {}
	public WrongPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	//�� �޼���� �������̵��� �ƴϰ� �����ε� !!
	//public boolean equals(WrongPoint param) {
	public boolean equals(Object param) {
		WrongPoint obj = (WrongPoint)param;
		System.out.println("�����");
		return x == obj.x && y == obj.y;
	}
}
