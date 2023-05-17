package chapter05.classes_abstract;

public class GoodCalc extends Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public double average(int[] a) {
		int sum = 0;
		for (int e : a) sum += e;
		return (double)sum / a.length;
	}
}
