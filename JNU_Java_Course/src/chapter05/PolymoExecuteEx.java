package chapter05;

import chapter05.classes_poly.*;
import chapter05.classes_poly.shape.*;
import chapter05.classes_poly.super_ex.*;
import chapter05.classes_poly.hide_field.*;

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
	void p34_overriding() {
		//메소드 재정의
		//수퍼 클래스에 선언된 메소드를 서브 클래스에서 재정의함
		//인터페이스를 동일하게 작성함
		// = 단일 인터페이스와 클래스별 고유의 구현
		
		//바인딩
		//메소드 호출과 실행될 메소드의 연결
		//컴파일 시에 일찍 이루어짐(Early Binding)
		//ex
		//Line line = new Line();
		//line.draw();
		
		//동적 바인딩
		//상/하위클래스에서 오버라이딩된 메소드를 업캐스팅된
		//상위클래스 타입의 참조변수로 호출하면 동적 바인딩이 일어남
		//바인딩이 메소드가 실행될 때 이루어짐(Late Binding, Dynamic Binding)
		//객체별 행위의 차이점을 드러낸다.
		//ex
		//Person p = new Student("김유리");	
	}
	public static void p38_Ex() {
		Shape shape;
		
		shape = new Shape();
		shape.draw();
		
		shape = new Line();
		shape.draw();
		
		shape = new Rect();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
	}
	void p41_overridingConstraint() {
		//1. 재정의된 메서드는 상위클래스와 동일한 이름&인터페이스여야 함
		//2. 접근 제어를 상위클래스 메소드보다 강화 불가능
			// 강한 순서: private > default > protected > public
		//3. Covariant Return Type: 상위클래스 메소드와 같거나  하위의 반환 타입이어야 함
			//반환타입을 상위클래스 리턴타입보다 상위로 불가능
		//4. 상위클래스의 메소드보다 상위의 예외나 추가 예외 던지기 불가능
		//5. static, private, final 메소드 재정의 불가능
	}
	public static void p43_Ex() {
		Shape start, last, obj; //모든 참조변수는 Shape로 선언
		//순차적으로 도형 생성, 연결해 링크드 리스트 구성
		
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}			
	}
	public static void p49_superEx() {
		//super
		//상위클래스 생성자 호출하는 super()와 다름
		//super는 하위 객체에서 상위 객체는 가리키는 키워드
			//하위 객체와 상위객체에 동일한 이름의 멤버 존재 시 구분을 위해 사용
		
		//다형성을 실제로 사용하는것은 추상클래스, 인터페이스로 구현한다.
		
		//super를 통한 메소드 호출은 컴파일러가 정적 바인딩함
		
		new S().m(); //super는 바로 한계단이 아니고 가장 가까운 슈퍼클래스다.
	}
	void p51_필드_감추기() {
		//상,하위클래스에 같은 이름의 필드를 정의한 경우
		//재정의가 이뤄지지 않음
		//하위 객체는 동일한 이름의 필드 2개의 접근 가능
		
		//상위 필드를 대체하는 것이 아니고 감춘다.
		//하위클래스에서 필드명 사용시 하위 필드가 우선함
		//상위 필드에 접근하려면 super 키워드 사용해야 함
		//하위클래스 밖에서는 상위 타입의 참조변수 사용해 상위 필드에 접근
		//접근제한자가 똑같이 적용됨
		
		
	}
	public static void p55_Ex() {
		Super superClass = new Super();
		Sub subClass = new Sub();
		
		System.out.println(superClass.s);
		System.out.println(subClass.s);		
	}
	void p56_static메서드_감추기() {
		//재정의 안됨
		//재정의 되면 다형적으로 동작해 하위클래스의 메소드가 실행되지만(동적 바인딩),
		//감춰지면 호출자가 지정한 클래스의 메소드가 실행됨(정적 바인딩)
		//하위클래스 메소드명은 하위클래스 메소드가 우선함
		
		//이런 문법은 되도록 사용하지 말자(나쁜코딩, 헷갈림)
		
		//원칙
		//p41.오버라이딩 제약조건과 동일(5가지)
		//-> 일반 메소드 오버라이딩 : 동적 바인딩(참조변수 상관없이 객체의 메서드 호출)
		//-> static 메소드 오버라이딩: 정적 바인딩 (참조변수에 따른 메서드 호출)
	}
	void p66_static필드_감추기() {
		//상속관계에 있을 때 하위객체는 상위클래스의 static 필드에 접근이 허용됨
		//접근제한자는 인스턴스 필드와 동일하게 static 필드에도 적용됨
		//static 필드는 상속된다
			//is-A 상속이 아니라 has-A 상속
		//필드 감추기와 비슷하네?
	}
	void p71_객체배열() {
		//원시형 배열의 대입 가능성
		//배열 타입이 다른 경우 배열은 배열에 대입 불가능
		//ex
		int[] intArray = new int[5];
		float[] floatArray = new float[5];
		//floatArray = intArray;
		//intArray = (int[])floatArray; //캐스팅도 불가능
		
		//객체배열 배열원소의 Upcasting
		//상위 타입의 배열 원소에는 하위 타입의 객체 대입 가능
		//ex
		Object[] objectArr = new Object[3];
		objectArr[0] = new java.awt.Point();
		objectArr[1] = new int[2][3];
		objectArr[2] = objectArr;
		
		//객체 배열의 Upcasting
		//객체 배열은 타입이 다른 배열끼리 대입이 가능하다
		//객체 배열의 경우 큰 타입의 배열을 작은 타입의 배열에 대입할 수 있고 형변환도 가능
		//ex
		java.awt.Button[] buttonArr = new java.awt.Button[5];
		Object[] obj1 = new java.awt.Button[10];
		Object[] obj2 = buttonArr;
		buttonArr = (java.awt.Button[])obj1;
	}	
	void p76_ArrayStoreException() {
		//잘못된 다형적 대입은 예외 유발함
		//Bird[] bird = new Bird[10];
		//Animal[] animal = bird;
		//animal[0] = new Cock();		
		//animal[1] = new Duck();		
		//animal[2] = new Fish();	// INVALID
		//animal[3] = new Trout();	// INVALID
		
		//새로운 배열 객체를 생성한 후에는 가능
		//animal = new Fish[10]; // 다른 배열 객체 생성
		//animal[0] = new Fish();
		//animal[1] = new Trout();
	}
	void p77_ArrayIsObject() {
		//Object의 모든 메소드 호출 가능
		//Animal[] animals = new Animal[10];
		//Object o = animals;
		//System.out.println(o.getClass().getName());
	}
}
