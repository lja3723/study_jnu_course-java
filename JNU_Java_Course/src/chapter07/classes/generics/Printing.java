package chapter07.classes.generics;

public class Printing<T> {
	public void printArray(T[] arr) {
		System.out.println();
		for (T i : arr)
			System.out.print(i + " ");
	}
}
