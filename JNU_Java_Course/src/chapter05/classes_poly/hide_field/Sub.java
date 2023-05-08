package chapter05.classes_poly.hide_field;

public class Sub extends Super {
	public String s = "SUB";
	
	public void method() {
		System.out.println("Super Method");
	}
	
	public void print() {
		System.out.println("하위 클래스 내에서 필드에 접근");
		System.out.println(s);
		System.out.println(super.s);
	}
}

