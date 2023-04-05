package chapter04_1;

import chapter04_1.p10.*;

public class ExecuteEx {
	public static void p10_Ex() {
		Person kim = new Person();
		kim.age = 30;
		kim.name = "±è¹Ì³²";
		int i = kim.age;
		String s = kim.getName();
		System.out.println("±èÀÇ ³ªÀÌ = " + i);
	}
}
