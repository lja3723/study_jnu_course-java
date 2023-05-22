package chapter05;

import chapter05.classes_composition.Comp01;
import chapter05.classes_composition.P07_Ex;

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
		
	}
	
	
	
	
}
