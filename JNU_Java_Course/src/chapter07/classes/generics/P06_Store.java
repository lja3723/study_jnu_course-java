package chapter07.classes.generics;

public class P06_Store {
	Object val;
	void set(Object a) {
		val = a;
	}
	Object get() {
		return val;
	}
	public static void main(String[] args){
		P06_Store s = new P06_Store();
		s.set("Beautiful May!"); 
		System.out.println((String)s.get());
		s.set(Integer.valueOf(15)); 
		System.out.println((Integer)s.get());
	}
}
