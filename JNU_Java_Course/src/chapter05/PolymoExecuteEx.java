package chapter05;

import chapter05.classes_poly.*;
import java.util.Scanner;

public class PolymoExecuteEx {
	void p00_Upcasting() {
		//upcasting
		//수퍼클래스 타입의 참조변수에 서브클래스 객체를 대입하는 것
		//다른말: 다형적 대입
		
		//업캐스팅으로 변하는것/변하지 않는것
		//변하지 않은 것
			//업캐스팅되도 객체는 그대로 존재: 매모리의 객체에는 아무 영향 X
		//변하는 것
			//접근 방법의 변화: 참조변수 타입의 멤버에만 접근 가능
			//하위 타입 객체가 상위 타입 객체로 취급받음
	}
	public static void p05_UpcastingEx() {
		Person p;
		Student s = new Student("김유리");
		p = s;
		
		System.out.println(p.name);
		
		//p.grade = "A";
		//p.department = "Computer Science";

		s.grade = "A";
		s.department = "Computer Science";
	}
	public static void p07_Downcasting() {
		//상위 객체를 하위 객체에 대입하는 것
		//명시적 다운캐스팅 가능
		
		Person p = new Student("name");
		Student s = (Student)p;
		s.grade = "grade1";
		System.out.println(s.grade);
		
		int input = new Scanner(System.in).nextInt();
		
				
		if (input == 0) {
			s = (Student)p;
		}
		
		if (input == 1) {
			s = (Student)(new Person("name"));
		}
		s.grade = "c+";
		

		System.out.println(s.grade);
	}
	public static void p12_Ex() {
		Animal.runEx2();
	}
	void p14_다형적대입_유형() {
		//변수에 값 대입
		//메소드 호출 시 실인자를 형식인자에 대입
		//메소드의 반환 타입에 반환값 대입
		//예외
			//throws로 선언되는 예외 타입과 throw로 던져지는 예외
			//catch 블록의 예외 타입과 try블록에서 발생하는 예외
		//배열
			//배열참조변수에 배열 객체를 대입
			//배열 객채의 콤포넌트(원소)에 객체를 대입
		
		//1.
		Float f = 12.f; 
		Object o = new String("Korea");
		
		//이외의 예시는 ppt 참고 ㄱㄱ (16페이지부터)
	}
	static void instanceofPrint(Person p) {
		//기본형 타입은 불가능
		//boolean b = 5 instanceof int;
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();

	}
	public static void p27_InstanceofEx() {
		System.out.print("new Student() ->\t"); instanceofPrint(new Student());
		System.out.print("new Researcher() ->\t"); instanceofPrint(new Researcher());
		System.out.print("new Professor() ->\t"); instanceofPrint(new Professor());
	}
	public static void p28_Ex() {
		Person p1 = new Professor();
		System.out.println(p1.getClass().getName());
		Person p2 = new Professor();
		System.out.println(p2.getClass().getName());
		
		//다형성(Polymorphism)
		//위 변수 p1은 다형적이다. 많은 형태를 가질 수 있기 때문이다.
	}
}
