package chapter05.executes;

import chapter05.classes_composition.Comp01;
import chapter05.classes_composition.Date;
import chapter05.classes_composition.P07_Ex;
import chapter05.classes_composition.Person;
import chapter05.classes_composition.Time;

public class CompositionEx {
	void p03_composition() {
	//클래스 정의 시 참조변수 타입으로 이미 존재하는 다른 클래스를 사용함
		
	//B is composed of A
		//B가 A로 구성된다.
		//A가 B의 부품 역할을 한다.
		
	//Aggregation(집합), Association(연관) 이라고도 함
		//클래스가 다른 클래스들을 모은다
		//둘 이상의 클래스가 관련된다
		
	//객체지향프로그램애서 상속보다 합성의 비중 높다
		
	}
	public static void p04_Ex() {
		Comp01.main(null);
		
	//Compute 클래스의 메소드
		//double add(double, double) 
		//double subtract(double, double) 
		//double multiply(double, double) 
		//double divide(double, double) 
	
		
	}
	void p06_forwarding() {
	//합성으로 기존 클래스 메소드 활용해 클래스 기능을 발휘
	//Ex:
		//Compute 클래스의 add() 작성시 AddSubtract의 add()를 사용
		//부픔 클래스 메소드 호출해 자신이 할 일을 대신하게 함
	}
	public static void p07_Ex() {
		P07_Ex.run();
		//합성 방식에서 멤버의 접근은 바람직 X
		//Compute 클래스 사용자는 .을 연이어 사용해 클래스 필드나 메소드 사용 가능
	//Ex
		//Compute cp = new Compute();
		//int result = cp.as.add(10, 20);
		
		//그러나 이런 방식은 캡슐화 포기하고 사용자에게 클래스 세부 구현 공개해 접근 허용하는 것임
		//바람직하지 X
		System.out.println("Hello worldq");
	}
	void p14_has_a_relation() {
	//Person과 BankAccount의 관계
		//둘은 서로에게 is-a 관계가 아님
		//서로 상속하는 것은 안좋음
		//has-a 관계로 설정해야 함
	}
	public static void p20_Time() {
		Time.main(null);
	}
	public static void p22_Date() {
		Date.main(null);
	}
	public static void p24_Person() {
		Person.main(null);
	}
	void p29_IMPORTANT_Privacy_Leak() {
	//private 접근 제한은 완벽하지 않다
		//private로 선언된 클래스 필드를 그냥 반환해버리면
		//외부에서 수정될 위험이 있다!!
		//private가 private가 아니게 되는 것이다.
	}
	void p31_object_copy() {
	//객체의 필드값 집합: 상태
		//객체는 생성된 후 상태가 변화 가능
		//객체 복사: 상태가 변한 객체와 동일한 상태의 객체를 하나 더 생성하는 것
		//객체를 다시 생성하는 것 -> 복사 X
		
	//사실은 복사가 아니고 복제(cloning) 이다.		
	}
	void p32_shallow_deep_copy() {
	//얕은 복사
		//그저 객체참조변수만 복사한다
	//깊은 복사
		//객체참조변수가 가리키는 객체 내용을 별도로 복사한 새 객체를 만든다
	}
	void p34_CopyConstructor() {
		//클래스와 동일한 타입의 매개변수 가진 생성자
		//널 체크가 필요
		//Time, Date, Person 복사 생성자 정의 필요
	}
	void p38_String_Is_Immutable_Class() {
		//String은
		//객체의 상태를 변환시키는 메소드를 가지고 있지 않는다.
		//즉 String은 변경될 수 없는 클래스(Immutable Class)이다.
		
		//참고: Mutable Class
		//클래스 자체에 Mutator 메소드나 입력 메소드 포함되어 있어
		//객체 상태를 변화시킬 수 있는 클래스(Data, Time 등)
		//메소드 정의 시 Mutable Object에 대한 참조변수를 반환해서는 안됨
		//반드시 복사 생성자 사용해 완전이 독립적인 복사본 객체 생성하고
		//이에 대한 참조변수를 반환해야 한다.
	}	
}
