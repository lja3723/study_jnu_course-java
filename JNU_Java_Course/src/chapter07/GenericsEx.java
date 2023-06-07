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
		chapter07.classes.generics.Store<String> s = new chapter07.classes.generics.Store<>();
		s.set(new String("jj"));
		System.out.println(s.get());
	}
	public static void p21_Ex() {
		String[] s = {"Spring", "Summer", "Autumn", "Winter"};
		Double[] d = {3.14, 8.9, -39.11};
		Character[] c = { '5', '7', '@' , '-'};
		Integer[] i = {2, -55, 0, 54};
		Printing<String> ps = new Printing<String>();
		ps.printArray(s);
		Printing<Double> pd = new Printing<Double>();
		pd.printArray(d);
		Printing<Character> pc = new Printing();
		pc.printArray(c);
		Printing<Integer> pi = new Printing<>();
		pi.printArray(i);		
	}
	public static void p23_Ex() {
		Pair<String, Integer> p1 = new Pair<>("year", 365);
		System.out.println(p1.getItem1() + " " + p1.getItem2());
		Pair<String, Integer> p2 = new Pair<>();
		p2.setItem1("Week");
		p2.setItem2(7);
		System.out.println(p2.getItem1() + " " + p2.getItem2());
	}
	public static void p31_Ex() {
		String[] language = { "C++", "C#", "Java" };
		System.out.println(GenericsEx.<String>getLast(language));
	}
	static <T> T getLast(T[] a) {
		return a[a.length-1];
	}
	public static void p35_Ex() {
		String[] s = {"Spring", "Summer", "Autumn", "Winter"};
		Double[] d = {3.14, 8.9, -39.11};
		Character[] c = { '5', '7', '@' , '-'};
		Integer[] i = {2, -55, 0, 54};
		PrintingAny p = new PrintingAny();
		p.printArray(s);
		p.<Double>printArray(d);
		p.printArray(c);
		p.printArray(i);
	}
	public static void p39_Ex() {
		String[] language = { "C++", "C#", "Java" };
		ArrayTest.reverse(language);
		System.out.println(language[0] + " " + language[1] + " " + language[2]);

	}
}
