package chapter07;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GenericsEx2 {
	public static void p03_Ex() {
        Integer[] i = { 1, 2, 3, 4, 5};
        Double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] c = { 'ดิ', '\ub2d8', '\u0041', 'A', '\u0031', '1'};
        String[] s = { "Rio de Janeiro", "Peking", "Los Angels", "London"};
        System.out.println( max(i) ); 
        System.out.println( max(d) );
        System.out.println( max(c) );
        System.out.println( max(s) );
	}
	static <T extends Comparable<T>> T max(T[] t) {
        if(t == null || t.length == 0)
            return null;
       T maxT = t[0];
       for (int k = 1; k < t.length; k++){
           if(maxT.compareTo(t[k]) < 0)
               maxT = t[k];
       }
        return maxT;
	}
	public static void p09_Ex() {
		Store<Short> s1 = new Store<Short>(Short.valueOf((short)100));
		Store<Integer> s2 = new Store<>(200);
		Store<Double> s3 = new Store(3.14);
		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(s3.get());
		// Store<String> s4 = new Store("Korea"); // INAVLID
		// System.out.println(s4.get());
	}
	public static void p17_Ex() {
        List<Integer> list1 = Arrays.asList(2, 3, 5, 7, 11);
        System.out.println( sum(list1) ); // (X) Compile Error
        List<Double> list2 = Arrays.asList(2.4, 3.1, 5.5, 7.3, 11.0);
        System.out.println( sum(list2) ); // (X) Compile Error
	}
	static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list)
            sum += n.doubleValue();
        return sum;
    }	
	public static void p31_Ex() {
		ArrayList<Character> c = new ArrayList<Character>();
		c.add('A');
		addChar(c); System.out.println(c.size());
		ArrayList<Object> o = new ArrayList<Object>();
		o.add('A');
		addChar(o); System.out.println(o.size());
	}
	static void addChar(List<? super Character> list) {
		list.add('x');
		list.add('y');
		list.add('z');
		Character c = (Character)list.get(0);
		System.out.println("charVal" + c.charValue());
	}
	void p35_Ex() {
		List<? super RuntimeException> list = new ArrayList<Object>();
		//list.add(new Object()); 
		//list.add(new Exception());
		list.add(new RuntimeException());
		list.add(new ArithmeticException());
	}
}

class Store<T extends Number> {
	T val;
	public Store(T a) {
		val = a;
	}
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
}

