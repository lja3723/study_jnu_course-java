package chapter05.executes;

import chapter05.classes_abstract.*;

public class AbstractEx {
	void p01_Abstract() {
	//Abstract : 골격
	//Abstraction(추상화)
		//대상의 중요한 부분만 추려 간결하고 이해하기 쉽게 만듬
		//Information Hiding: 정보 은닉, 상세한 사항 전달 X
		//클래스 기능을 뼈대만 추려 표현
		
	//Abstract Class
		//구현되지 않은 0개 이상의 추상 메소드 포함한 클래스
		//외형적: abstract 키워드로 정의됨
		//완성되지 않아 객체 생성 불가
		//하위클래스에 표준 제시하는 것이 목적(설계용 클래스)
		
		//상속과 메소드 재정의를 전제로 함
		//추상클래스 접근제한자로 private, final 은 무의미, 불가능
		//오직 public, protected, default만 허용
		
		//추상클래스 == 타입
			//AbstractClass ac;
		//Upcasting 방식으로 대입, 다형성의 기초
		//메소드 매개변수 타입에도 사용함
		//배열타입 선언, 배열 객체 생성에 쓰임		
	}
	void p06_AbstractMethod() {
	//선언되었으나 구현되지 않음
		//오버라이딩이 전제됨
		//몸체는 서브클래스에서 구현
		//static은 재정의 불가능 -> 선언 X
		
	//외형
		//헤더에 abstract 표기
		//몸체 없고 끝에 세미콜론이 붙음
		//public abstract int getValue();
		
	//특징
		//추상클래스에서만 존재 가능
		//붙일수 없는 접근제어자: private, final
		//몸체를 가질 수 없음
		//하위클래스에서 추상메소드 구현 == 오버라이딩
		
	//추상클래스 메소드 2가지 유형
		//구현 완료된 메소드
		//추상 메소드
	}
	void p09_추상클래스특징() {
	//추상클래스 조건
		//1. 추상 메소드가 1개라도 있는 클래스
			//추상메소드를 1개라도 포함시기면 반드시 클래스 앞 abstract 선언 필요
		//2. 추상 메소드 없어도 클래스 앞에 abstract 붙인 클래스
		
	//선언
		//키워드 abstract 사용해 선언
		//구현되지 않은 메소드에 abstract 붙임
		//메소드 중 하나라도 추상메소드면 클래스도 abstract 붙여야 함
		
	}
	void p13_추상클래스와_상속() {
	//추상클래스 상속한 자식 클래스 특징
		//추상크래스를 모두 구현하면 그 클래스는 구체적 클래스가 됨
		//추상메소드를 하나라도 구현하지 않으면 여전히 추상클래스
			//자식클래스도 abstract 선언 필요
	
		//추상클래스의 생성자는 호출 불가능 (자명함 - 추상클래스는 객체생성 불가)
		
		
	}
	void p16_추상클래스_용도() {
	//설계와 구현 분리
		//추상 클래스 형태의 상위 클래스로 시스템 설계
		//자식 클래스가 지켜야할 표준을 정의(with 추상 메소드)
		//각 서브 클래스에서 구체적 행위 구현
		//서브 클래스마다 목적에 맞게 추상클래스 재정의
		//계층적 상속 관계를 갖는 클래스 패밀리의 정점 클래스를 만듬		
	}
	public static void p17_Ex() {
		Calculator gc = new GoodCalc();
		
		//pre-condition : 메소드가 정상적으로 동작하기 위해 지켜야할 조건
		//보텅 메소드 위에 주석으로 표시한다
		//사용 이유: 파라미터 타입에 모든 조건을 표시하기가 어렵기 때문
		//post-condition : -> 주석으로만 표시 가능
		//invariant : 메소드가 실행되는 동한 참으로 유지되어야 하는 조건
		
		
		System.out.println(gc.add(5, 12));
		System.out.println(gc.subtract(19, 8));
		System.out.println(gc.average(new int[] {5, 2, -3, 8}));
		
	}
	void p19_추상클래스와_생성자() {
		//추상클래스 생성자를 직접 호출은 불가능하다.
		//하지만 추상 클래스도 생성자를 가질 수 있음
		
		//하위클래스 생성자가 super()를 이용해 호출하게 됨
		//추상클래스 생성자도 자신의 상위클래스 생성자를 호출 가능
	}
	public static void p20_AbstractEx() {
	//Solid			: 입체 - 공통 행위와 속성 정의
		//Sphere	: 구
		//Cuboid	: 직육면체
		//Cylinder	: 원통	
		Solid s = new Sphere(2.0);
		s.show();
		new Cuboid(2.0, 3.0, 4.0).show();
		new Cylinder(2.0, 3.0).show();
	}
	public static void p24_Ex() {
	//Figure: 도형
		//Triangle: 이등변삼각형형
		//Square: 사각형
		//RightTriangle: 직각삼각형
		FigureTest.main(null);
	}
	void p31_protect_실제의미() {
		//하위클래스가 아닌 클래스에게는 default와 같은 의미
		//하위 클래스에게는 public 의미
		
		//추상클래스의 필드 정의
		//public abstract class Figure {
		//    protected String name = "Figure";
		//    protected char character = '-'; // 그릴 때 사용할 기본 문자
		//}
		
		//하위클래스에서 필드값 다시 설정		
	}
	void p33_추상클래스_3종류_메소드() {
	//abstrct
		//자식클래스가 의무적으로 구현해야 함
		
	//protected
		//선택적으로 오버라이딩 가능
		
	//public
		//구현이 완결된 메소드
		//그냥 사용만 하자
		
	//protected 멤버의 접근
		//하위 클래스가 protected 멤버에 접근할 수 있다 함은 매우 느슨한 정의
		//비록 protected 멤버라 하더라도
		//접근하고 있는 객체보다 상위 객체에속한 멤버에게는 접근 불가
		//접근하고 있는 객체보다 상위 타입의 참조변수로는 접근 불가
		
		//상위클래스와 하위클래스가 서로 다른 패키지에 속한 경우임
		
	}
	void p38_templete_method() {
		//디자인 패턴중 하나
		
		//추상클래스에서 큰 흐름 결정
		//하위 클래스에서 구체적인 내용을 결정
		
		//특수한 성질을 충분히 알아야 프로그래밍 가능한 경우는
		//추상메소드로 형식만 정의해 놓고 하위클래스에 넘겨 구현함
		
		//하위클래스에 공통되는 부분이 있을 경우 모두 상위클래스로 끌어올림
		//코드의 중복을 피함
		
	//템플릿 메소드 구성
		//1. 상위 클래스는 템플릿 역할을 하는 메소드 정의
			//템플릿 메소드가 추상 메소드 호출
			//템플릿 메소드 보면 추상 메소드가 어떻게 호출되는지 알지만 구현은 모름
		//2. 하위 클래스는 추상 메소드 구현을 완성
			//하위클래스마다 고유의 특성 가진 서로 다른 구현 이루어짐
			//하위클래스가 어떤 구현 가지더라도 처리 큰 흐름은 상위클래스가 결정한대로 이뤄짐
		
	//추상 클래스 역할
		//템플릿 메소드 구현
		//템플릿 메소드에서 사용하는 추상 메소드 선언
		//예제의 TemplateClass 클래스가 여기 해당
	//구체 클래스 역할
		//추상클래스에서 선언된 추상메소드를 재정의해 구현
		
	//추상 클래스 작성
		//중복 피하기 위해 하위클래스의 공통 부분을 상위 클래스로 끌어 올려 작성
		//구체적 사항이 결정되어야 구현 가능한 메소드는 상위 클래스에서 추상 메소드 형태로 구현
		
		//템플릿 메소드 작성
		//추상클래스에 위치해야 함
		//추상 메소드 호출하는 호출문 포함해 추상클래스와 하위클래스를 잇는 연결 고리가 됨
		//재정의되어서는 안되므로 final로 선언해 고정됨
		//템플릿 메소드를 사용자 클래스에서 호출해 동작하게 함
	}	
	public static void p46_TemplateMethodEx() {
		long time;
		time = new Loop().templateMethod();
		System.out.println("Loop: " + time);
		time = new Recursion().templateMethod();
		System.out.println("Recursion: " + time);
	}
	









}
