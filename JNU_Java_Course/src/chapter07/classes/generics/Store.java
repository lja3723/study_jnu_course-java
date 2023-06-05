package chapter07.classes.generics;

public class Store<T> {
	T val;
	public void set(T a) {
		val = a;
	}
	public T get() {
		return val;
	}
}
