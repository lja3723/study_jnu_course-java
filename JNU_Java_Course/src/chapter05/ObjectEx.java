package chapter05;

import chapter05.classes_object.*;

public class ObjectEx {
	public static void p00_Ex() {}
	void p02_object_class() {
		//java.lang 패키지에 포함
		//모든 클래스의 수퍼 클래스
		
		//메소드
		//protected Object clone()
		//public boolean equals(Object obj)
		//Class getClass()
		//int hashCode()	:map에 쓰는 해시코드를 만든다.
		//String toString()
		
		//쓰레드 프로그래밍시 충돌을 방지하기 위해, 쓰레드 동기화 위해 사용
		//한 쓰레드가 사용중이면 다른 쓰레드는 멈춰야 됨
		//두 쓰레드가 동시에 일하는것: 동기화
		//void notify()
		//void notifyAll()
		//void wait()
	}
	public static void p06_CompareObject() {
	//==
		//두 객체의 동일성(Identity)를 비교
		//두 참조변수가 동일한 객체를 비교하는가?
	//equals()
		//두 객체의 동등성(Equlity)을 비교
		//두 객체의 필드값이 동일한가?
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
	//Object.equals()
		//==처럼 동일성을 검사함
		//재정의하지 않으면 동일성을 검사하게 됨
		//자바 표준 라이브러리 클래스 중에서는 String처럼 동등성 검사를 하는 것도 있고
		//재정의를 생략해 동일성을 검사하는 것도 있음
	}
	public static void p09_StringEquals() {
		//String 클래스는 equals()를 동등성 검사로 재정의함
		//==을 사용해 문자열 동일성 검사
		
		String str1 = new String("Korea");
		String str2 = str1;
		System.out.println(str1 == str2); //true
		
		str2 = new String("Korea");
		System.out.println(str1 == str2); //false (다른 객체)
		
		Person a = new Person(1, "Kim");
		Person b = new Person(1, "Kim");
		System.out.println(a.equals(b));
	}
	public static void p15_Ex() {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
	}
	public static void p24_Problem() {
		Object a = new WrongPoint(3, 4);
		Object b = new WrongPoint(3, 4);
		System.out.println(a.equals(b));
		//equals가 오버로딩되었으므로 동적 바인딩 적용 X
		//Object의 equals가 호출된다.
	}
	public static void p26_CompleteEquals() {
		Triangle t = new Triangle(2.0, 3.0);
		Triangle t2 = new Triangle(2.0, 3.0);
		System.out.println(t.equals(t2));
	}
}
