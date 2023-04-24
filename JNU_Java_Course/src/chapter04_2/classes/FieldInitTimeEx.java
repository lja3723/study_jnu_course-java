package chapter04_2.classes;

class Tree {
	Tree(String c) {
		System.out.println("new Tree " + c);
	}
}

public class FieldInitTimeEx {
	Tree t1;
	Tree t2 = new Tree("t2 (필드 초기화)");
	
	static Tree static_t1 = new Tree("static_t1 (static 초기화)");
	static Tree static_t2;
	static {
		static_t2 = new Tree("static_t2 (static 블록)");
	}
	
	public FieldInitTimeEx() {
		t1 = new Tree("t1 (생성자)");
	}
	
	Tree t3;
	Tree t4;
	{
		t3 = new Tree("t3 (초기화 블록)");
		t4 = new Tree("t4 (초기화 블록)");
	}
	Tree t5 = new Tree("t5 (필드 초기화)");
}
