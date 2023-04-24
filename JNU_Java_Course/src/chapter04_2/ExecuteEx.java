package chapter04_2;

import java.util.Scanner;

import chapter04_2.classes.*;

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
		
		ExecuteEx e = new ExecuteEx();
	}	
	public static void midterm_problem00() {
		int count = 0;
		
		OUTER:
		for (int i = 1; i < 5; i++) {
			INNER:
			for (int j = 1; j < 4; j++) {
				if (j % 2 == 0)
					continue INNER;
				count += j;
				if (i > 2)
					break;
			}
		}
		System.out.println(count);
	}
	
	static private int static_field;
	public static void p34_static() {
		//static: 필드 or 메서드 소속을 클래스로 제한
		//객체와 무관한이라는 의미로 해석 가능
		
		//non-static:
		//	객체마다 별도 존재(개인공간)
		//static:
		//	클래스당 1개만 생성(공유공간)
		
		//클래스 작성하면 디스크에 저장됨
		//프로그램이 실행되면 클래스가 메인메모리에 로드(클래스 로더)
		//new를 진행하면 클래스로부터 객체가 새롭게 생성됨
		
		//non-static -> static O 접근 가능
		//static -> non-static X 접근 불가
		//static은 this 키워드 사용 불가
		
		//접근법 1:
		ExecuteEx.static_field = 0;
		//접근법 2: (비권장)
		ExecuteEx obj = new ExecuteEx();
		obj.static_field = 0;
	}
	public static void p42_Ex() {
		Scanner s = new Scanner(System.in);
		System.out.println("환율(1달러 가격?)$ ");
		double rate = s.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("100만원은 $" + CurrencyConverter.toDollar(1_000_000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		s.close();
	}
	void p44_variable_type() {
		//유효범위 따른 분류:
			//클래스 단위
			//메소드 단위
			//문장 단위(블록)
		//변수의 타입에 따른 분류:
			//원시형
			//참조형
		//객체 생성 시에 포함되는가에 따른 분류:
			//필드(객체 필드, 객체 변수)
			//클래스 필드(정적 필드 (static))
		
		//필드
			//클래스로부터 생성되는 객체마다 포함되는 변수
			//static이 안붙음
			//다른이름: Field, Instance Variable, Property, Attribute
		
		//클래스 필드
			//크래스로부터 객체 생성될때 생성되는 객체에 포함되지 않는 변수
			//static 붙음 (=정적 필드라고도 함)
			//객체수 상관 없이 클래스당 한개만 존재, 모든 객체에 의해 공유됨
			//객체 생성하지 않아도 사용가능
	}
	public static void p47_Ex() {
		p47_Triangle[] triangle = new p47_Triangle[3];
		triangle[0] = new p47_Triangle(2.5, 2.0);
		triangle[1] = new p47_Triangle(3.5, 4.0);
		triangle[2] = new p47_Triangle(2.0, 1.0);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Serial Number: " + triangle[i].getSerialNo());
			System.out.println(", Area: " + triangle[i].area());
		}
	}
	public static void p51_InitField() {
		//1: 초기화하지 않으면 타입의 기본값으로 자동 초기화
		//2: 필드 선언문에서 초기화
		//3: 생성자를 통한 값 설정으로 초기화
		//4: 초기화 블록(Initialization Block)을 이용한 초기화
		//5: 클래스 필드 초기화, 정적 초기화 블록(Static Initialization Block) 
		
		FieldInitEx ex = new FieldInitEx(1.0, 1);
	}
	public static void p54_FieldInitTimeEx() {
		FieldInitTimeEx ex = new FieldInitTimeEx();
	}
	public static void p59_Ex() {
		System.out.println(FieldInitEx.specialValue);
	}
	public static void p61_FieldInitTimeEx() {
		System.out.println("=====객체 1 생성=====");
		FieldInitTimeEx ex1 = new FieldInitTimeEx();
		System.out.println("=====객체 2 생성=====");
		FieldInitTimeEx ex2 = new FieldInitTimeEx();
	}
	void p63_static_import() {
		//ppt 참고
	}
	void p66_final_class_field() {
		//final class:
			//클래스 앞에 붙임
			//더 이상 클래스 상속이 불가능함을 표시
		
		//final field:
			//초기화 방법:
			//1: 변수 선언과 동시에 초기화
			//2: 초기화 블록으로 초기화:
			//3: 생성자에서 초기화
	}
	void p70_black_final_field() {
		//선언할 때 값 대입 안하고 비워 둔 final 필드
		//초기화 블록 or 생성자에서 값 대입해야 함
	}
	public void p75_toString() {
		//Object 클래스에 정의, 어떤 클래스에서도 자동으로 포함됨
		//객체를 String 형태로 반환
		//기본값: 클래스이름@객체 -> hash code의 16진수 표현
		String s = getClass().getName() + '@' + Integer.toHexString(hashCode());
		System.out.println(s);
		
		//재정의 가능함
		//pulic String toString(); 으로 정의하면 됨
		
		//println 메서드는 toString()을 자동으로 수행한다.
	}
	public static void p79_Ex() {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");
		
		//toString 주의사항
			//객체를 String형태로 고의적으로 바꿔야할 특별한 경우가 아니면
			//toString을 직접 호출하지 말 것
			//toString 재정의시 println()을 포함할 필요 없음
			//return String.format("%d", this.field); 같은 방법도 가능
	}
	
	
	
	
	
	
	
	
}
