package chapter05.classes_poly.hide_field;

public class Sub extends Super {
	public String s = "SUB";
	
	public void method() {
		System.out.println("Super Method");
	}
	
	public void print() {
		System.out.println("���� Ŭ���� ������ �ʵ忡 ����");
		System.out.println(s);
		System.out.println(super.s);
	}
}

