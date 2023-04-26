package chapter05.classes;

public class C extends B {
	public C() {
		System.out.println("Default Constructor C");
	}
	
	public C(int a) {
		super(a);
		System.out.println("Prameter Constructor C");
	}
}
