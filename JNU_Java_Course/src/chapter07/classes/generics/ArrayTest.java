package chapter07.classes.generics;

public class ArrayTest {
	public static <T> T getLast(T[] a) {
		return a[a.length-1];
	}
	public static <T> void reverse(T[] a) {
		for (int i = 0; i  < a.length / 2; i++) {
			T temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
	}
}
