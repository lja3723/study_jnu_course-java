package chapter05.classes;

public class Student extends Person {
	public void set() {
		age = 30;            // 수퍼클래스의 default 멤버에 접근
		name = "홍길동"; // 수퍼클래스의 public 멤버에 접근
		height = 175;       // 수퍼클래스의 protected 멤버에 접근
		// weight = 99;     // 오류. 수퍼클래스의 private 멤버에는 접근 불가
		setWeight(99);      // private 멤버 weight은 setWeight()으로 간접 접근
	}
	
}

