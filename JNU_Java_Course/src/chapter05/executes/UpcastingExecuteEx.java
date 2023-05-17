package chapter05.executes;

import chapter05.classes.*;

public class UpcastingExecuteEx {
	void p05_define_inheritance() {
		//부모 클래스(Perent, super, base class)
		//자식 클래스(child, sub, derived class)
		
		//상속은 아주 밀접한 관계가 있는 클래스를 패밀리로 묶기 위한 용도로만
		//사용해야됨, 코드 재사용이 목적이 되서는 안 됨
	}
	public static void p07_Ex() {
		ColorPoint_first cp = new ColorPoint_first();
		cp.set(3, 4);
		cp.setColor("Red");
		cp.showColorPoint();
	}
	void p11_inheritanceInfo( ) {
		//다중 상속 지원 X
		//상속 횟수는 무제한
		//모든 클래스는 자동으로 java.lang.Object 상속 받음
	}
	void p12_ViewAPI() {
		//https://docs.oracle.com/javase/10/docs/api/index.html
		//Eclipse에서는 확인하고 싶은 클래스에 커서를 놓고 Shift + F2
		Object object;
		//아래 용어는 모두 동치
		//상속한다, 상속받는다, 확장한다(extend), 확장된다(extended)
	}
	void p16_protected() {
		//private 딜레마
			//수퍼클래스에서 private로 선언되면 서브클래스에서도 접근불가
			//캡슐화처럼 접근하는 것은 불편함 -> 개선하자!
		//protected
			//상속한 클래스에게는 직접 접근 허용
			//같은 패키지 내의 모든 클래스에서도 접근 허용
	}
	public static void p20_Ex() {
		Student s = new Student();
		s.set();
	}
	public static void p24_constructor_rule() {
		//QnA 1
			//하위클래스 생성되면 하위클래스와 상위클래스 생성자 모두 실행됨
		//QnA 2
			//하위클래스 생성자가 먼저 호출된 후 상위클래스 생성자 호출됨
		
		//하위클래스 객체는 상위클래스 객체 없이 동작 불가능
			//하위클래스 객체 생성되려면 상위클래스 객체도 생성되야 함
			//상위클래스 생성자는 하위클래스에 상속 안됨
				//생성자 이름 = 클래스 이름
		//생성자 실행 순서
			//하위 -> 상위 -> 상위 종료 -> 하위 종료
		
		//상위클래스 생성자가 오버로딩 된 경우?
			//super() 이용해 상위클래스 생성자 중 하나 선택 가능
			//super() 사용 안하면 자동으로 상위클래스 기본생성자 호출함
		
		System.out.println("======c1======");
		C c1 = new C();
		System.out.println("======c1======");
		C c2 = new C(0);
	}
	public static void p34_Ex() {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showPoint();
	}
	void p36_isA_hasA() {
		//하위클래스 객체와 상위클래스 객체는 is-A 관계
		//상위클래스의 멤버를 모두 가짐
		//상위클래스 객체로 취급할 수 있음
	}
}
