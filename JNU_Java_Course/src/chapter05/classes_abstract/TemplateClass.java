package chapter05.classes_abstract;

public abstract class TemplateClass {
	abstract int questionedMethod(int n);
	public final long templateMethod() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5000; ++i)
			questionedMethod(i);
		return System.currentTimeMillis() - start; //소요 시간 측정
	}
}
