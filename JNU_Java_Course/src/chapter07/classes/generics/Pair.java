package chapter07.classes.generics;

public class Pair<T1, T2> {
	private T1 item1;
	private T2 item2;

	public Pair() {
		this(null, null);
	}

	public Pair(T1 i1, T2 i2) {
		setItem1(i1);
		setItem2(i2);
	}

	public T1 getItem1() {
		return item1;
	}

	public void setItem1(T1 i) {
		item1 = i;
	}

	public T2 getItem2() {
		return item2;
	}

	public void setItem2(T2 i) {
		item2 = i;
	}
}

