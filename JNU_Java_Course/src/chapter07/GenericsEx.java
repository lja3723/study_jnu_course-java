package chapter07;

import chapter07.classes.generics.*;

public class GenericsEx {
	public static void p00() {
		System.out.println("GenericsEx");
	}
	public static void p06() {
		P06_Store.main(null);
	}
	public static void p14() {
		Store<String> s = new Store<>();
		s.set(new String("jj"));
		System.out.println(s.get());
	}
	public static void p21_Ex() {
		String[] s = {"Spring", "Summer", "Autumn", "Winter"};
		Double[] d = {3.14, 8.9, -39.11};
		Character[] c = { '5', '7', 'R', '@'};
		Integer[] i = {2, -55, 0, 54};
		Printing<String> ps = new Printing<>();
		ps.printArray(s);
		Printing<Double> pd = new Printing<>();
		pd.printArray(d);
		Printing<Character> pc = new Printing<>();
		pc.printArray(c);
		Printing<Integer> pi = new Printing<>();
		pi.printArray(i);
		
	}
}
