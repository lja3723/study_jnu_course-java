package chapter04_2.classes;

class Tree {
	Tree(String c) {
		System.out.println("new Tree " + c);
	}
}

public class FieldInitTimeEx {
	Tree t1;
	Tree t2 = new Tree("t2 (�ʵ� �ʱ�ȭ)");
	
	static Tree static_t1 = new Tree("static_t1 (static �ʱ�ȭ)");
	static Tree static_t2;
	static {
		static_t2 = new Tree("static_t2 (static ���)");
	}
	
	public FieldInitTimeEx() {
		t1 = new Tree("t1 (������)");
	}
	
	Tree t3;
	Tree t4;
	{
		t3 = new Tree("t3 (�ʱ�ȭ ���)");
		t4 = new Tree("t4 (�ʱ�ȭ ���)");
	}
	Tree t5 = new Tree("t5 (�ʵ� �ʱ�ȭ)");
}
