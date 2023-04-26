package chapter05.classes;

public class B extends A {
	public B() {
		System.out.println("Default Constructor B");
	}
	
	public B(int a) {
		super(a);
		System.out.println("Prameter Constructor B");
	}
}
