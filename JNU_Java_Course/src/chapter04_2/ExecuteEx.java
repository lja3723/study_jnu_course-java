package chapter04_2;

import chapter04_2.classes.Triangle;

class Sample {
	public int a;
	private int b;
	int c;
	protected int d;
	
	void defaultTestFunc() {
		System.out.println("Hello");
	}
}
class SampleFixed {
	public int a;
	private int b;
	int c;
	
	void defaultTestFunc() {
		System.out.println("Hello");
	}
	public int getB() {
		return b;
	}
	public void setB(int value) {
		b = value;
	}
}

public class ExecuteEx {
	void p01_delete() {
		/*
		 * 객체 소멸
		 * :new에 의해 생성된 객체 메모리를 jvm에 돌려주는 것
		 * 자바는 delete 기능이 없다 (자동 수행)
		 * 가비지: 자신을 가리키는 레퍼런스가 없는 객체 (메모리 누수)
		 * 가비지 컬렉션: JVM 가비지 컬렉터가 자동으로 가비지 수집해 메모리 누수 방지
		 */
	}
	void p06_occurGarbageEx() {
		String a = new String("a"); // <-가비지
		String b = new String("b"); 
		String c = new String("c");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
	void p07_GarbageCollection() {
		//자바에서 가비지를 자동으로 회수하는 과정
		//가비지 컬렉션 스래드를 통해 자동으로 가비지를 회수함
		//강제로 할 수도 있다. 다음 코드를 보자.
		System.gc();
	}
	void p10_classFile() {
		//확장자가 .class인 파일
		//.java인 소스파일을 컴파일하면 생겨남
	}
	void p11_package() {
		//연관된 클래스 파일을 저장하는 디렉터리
	}
	void p12_accessSpecfier() {
		//private	:비공개
		//default	:기본값
		//protected	:상속받은 자손 클래스에서는 public, 이외는 private
		//public	:완전 공개
		
		//공개 여부			클래스 내부		패키지 내부		모든 영역
		//private		O			X			X
		//default		O			O			X
		//protected		O			O			X
		//public		O			O			O
	}
	void p13_classAccess() {
		//public class
		//:모든 패키지에서 접근 가능
		
		//default class
		//같은 패키지의 클래스에만 접근 허용
		
		//private class 는 존재 불가
	}
	void p17_memberAccess() {
		//private: 
		//	클래스 내에서만 접근 허용
		//default:
		//	같은 패키지 내에서는 public
		//	그 외에는 private
		//protected:
		//	같은 패키지 내 모든 클래스에게 접근 허용
		//	상속 받은 자손 클래스에서는 다른 패키지에 속해도 접근 허용
		//public:
		//	모두 허용
	}
	public static void p23_Ex() {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; => 액세스 오류 발생
		aClass.c = 10; //이거는 같은 패키지는 접근 되는구나...
		aClass.defaultTestFunc();//이렇게도 되네
		aClass.d = 15;
	}
	public static void p25_Ex() {
		//오류 수정된 소스
		SampleFixed aClass = new SampleFixed();
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10; //이거는 같은 패키지는 접근 되는구나...
	}
	void p26_Encapsulation() {
		/*	넓은 의미의 캡슐화
		 * 		필드와 필드를 취급하는 메소드를 동일한 클래스 내에 두는 것
		 * 좁은 의미의 캡슐화
		 * 		- 클래스 필드를 private로 선언, 다른 클래스의 직접 접근 막음
		 * 		- 필드 취급하는 메소드를 public으로 선언, 메소드 통해 간접적으로
		 * 		필드 수정하는 것
		 */
		//캡슐화 이점: 클래스가 제공하는 API 유지하면서 프로그램 변경하거나 기능 추가 가능
	}
	void p27_set_get_method() {
		/* 접근 메소드: 필드에 접근함
		 *		public getField()
		 * 변경 메소드: 필드를 변경함
		 * 		public setField() 
		 */
	}
	public static void p30_EnCapsuleEx() {
		Triangle t = new Triangle(2.5, 2.0);
		System.out.println("Height = " + t.getHeight());
		System.out.println("Width = " + t.getWidth());
		System.out.println("Area = " + t.area());
	}

	//32페이지까지 시험범위!!!!
	//다음주 월요일은 휴강!!
	//시험은 과제에서만 나옴 (무조건! 다른거는 공부할 필요 X)
	//시험 장소: 19일 11시 이전에 메시지로 공지예정
}
