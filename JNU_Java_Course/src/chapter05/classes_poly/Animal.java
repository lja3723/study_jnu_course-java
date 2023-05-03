package chapter05.classes_poly;

public class Animal {
	
	public static void runEx() {
		Bird b = new Bird();
		//Tiger t = (Tiger)b; 문법적으로 불가능
	}
	
	public static void runEx2() {
		Animal a1 = new Bird();
		Cock c = (Cock)a1;
		
		Animal a2 = new Bird();
		Tiger t = (Tiger)a2;
	}
}
class Tiger extends Animal { }
class Bird extends Animal { }
class Cock extends Bird { }
