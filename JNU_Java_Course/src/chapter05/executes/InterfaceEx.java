package chapter05.executes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chapter05.classes_interface.*;

public class InterfaceEx {
	public static void p00_Ex() {
		System.out.println("Hello world!");
	}
	void p49_Interface() {
	//인터페이스 = 설계도
		//클래스가 가질 메소드 표현
		//클래스가 제공할 기능을 압축해 표현
	//자바표준 라이브러리클래스 사용 위해 먼저 클래스 기능 파악 필요
		//클래스의 인터페이스 보고 기능 파악
	//클래스가 가져야할 기능을 메소드 헤더를 중심으로 구성
		//==기능==서비스==메소드==인터페이스
		
	//인터페이스 == 약속
		//What을 보고 사용하지, How는 불필요
	
	//클래스 헤더에 인터페이스를 implements와 함깨 표시
		
	//인터페이스 헤더: interface로 선언
	//인터페이스 몸체: 생성자 정의 X/몸체 없는 메소드 선언
		
	//인터페이스 메소드는 기본적으로 public abstract
		//키워드 생략해도 자동 선언됨
		//접근제한자 생략 시 자동으로 public 선언(default x)
		
		
	}
	public static void p56_Ex() {
		StudentA s1 = new StudentA(1, "Kim", 95);
		StudentA s2 = new StudentA(2, "Lee", 97);
		if(s1.greater(s2)){
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
	}
	void p60_Comparable() {
		//객체 크기 비교 위한 Java 표준 방법
		//java.lang 패키지에 속해있는 인터페이스
		
		//<T>: 매개변수의 타입
		//public interface Comparable<T> {
		//	public int compareTo(T t);
		//}
		
		//메소드명: compareTo()
		//this가 t보다 크면 양수, 같으면 0, 작으면 음수를 반환할 것을 주석으로 명시
		
	//사용 이유
		//자바의 표준을 따르는 형식
		//Comparable만 보고 compareTo()가 구현됨을 알 수 있음
		
	//참고
		//Comparable<T> 대신 Comparable도 사용가능하나
		//이때는 compareTo(Object)를 구현해야 하고 반드시 인자를 Casting해야 함
		
	}
	public static void p62_Ex() {
		Student s1 = new Student(1, "Kim", 95);
		Student s2 = new Student(2, "Lee", 97);
		if(s1.compareTo(s2) >= 0){
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
	}
	public static void p64_Ex() {
		Player p1 = new Player(21, "Kim");
		Player p2 = new Player(17, "Choi");
		if(p1.compareTo(p2) <= 0)
			System.out.println(p1 + " <= " + p2);
		else
			System.out.println(p2 + " <= " + p1);
	}
	public static void p64_Ex2() {
		Player[] p = new Player[] {
			new Player(40, "name"),
			new Player(20, "byte"),
			new Player(25, "quite"),
			new Player(30, "salt"),
			new Player(25, "boss"),
			new Player(27, "lose"),
			new Player(15, "toucha"),
			new Player(20, "mirah")
		};
		List<Player> li = Arrays.asList(p);
		Collections.sort(li);
		p = (Player[])li.toArray();
		for (Player e : p) {
			System.out.println(e);
		}
		
		
	}
	void p67_implInterfaceAtClass() {
		//인터페이스에 정의된 추상메소드 몸체를 모두 완성해 클래스 작성한다
		//implements 키워드 사용
		//여러 인터페이스 동시에 구현 가능
	}
	public static void p68_Ex() {
		  SamsungPhone phone = new SamsungPhone();
		  phone.printLogo();
		  phone.sendCall();
		  phone.receiveCall();
		  phone.flash();
	}
	void p87_variableInInterface() {
		//인터페이스에 변수 정의 가능
		//인터페이스 변수는 기본적으로 public static final
		//private-protected:에러
		//컴파일러가 자동으로 추가함
		//객채 없이도 접근 가능
	}
	void p91_InterfaceDefaultMethod() {
	//이미 존재하는 인터페이스에 새 메소드 추가하면 인터페이스 구현한 모든 클래스는
	//모두 다시 작성해야됨
	
	//추가가 필요한 메소드를 default 메소드 형태로 부가할 수 있음
	//구현클래스의 수정 필요 X
		
	//default 메소드
		//구현이 완성된 메소드
		//default가 붙은 메소드
		//인터페이스의 몸체가 완비된 구체적 메소드
		//인터페이스 구현하는 어떤 클래스에도 상속되는 메소드
		//필요에 따라 인터페이스 구현 클래스에서 재정의도 가능
		
		//몸체 없으면 에러
		//몸체 있으면 default 키워드 있어야됨(없으면 에러)
		//public이다
		//private, protected는 에러
		
		//접근제어 키워드 default와는 아무런 관련이 없음!!!
		
	//default 메소드에서 불가능한 것
		//1. static (구현클래스 객체에서 사용 불가능해짐)
		//2. final		(재정의가 가능해야되므로 불가능)
		//3. abstract	(재정의가 의무 아닌 선택이므로 불가능)		
	}
	void p97_Interface_Static() {
	//인터페이스 구현하는 클래스의 객체 생성하지 않고 사용 가능한 메서드
		//Local use는 메소드명만으로 호출
		//인터페이스 밖에서 참조할 때 인터페이스명 사용
		
	//Interface Static 메소드는 인터페이스 구현하는 클래스에 상속되지 않음
		//클래스에서 정의된 static 메소드는 클래스를 상속한 자손 클래스에 상속됨
		
	//기본적으로 public, private나 protected사용하면 에러
	}
	void p100_Interface_private() {
	//인터페이스의 static, default 메소드 내에서만 사용될 수 있는 보조용 메소드
		//몸체를 가져야됨
		//abstract X
		//static / non-static 모두 가능
		//인터페이스에 국한한 Local use 용도임
		//인터페이스 내 다른 static/default/private/abstract 호출가능
	}
	void p104_Abstract_vs_Interface() {
	//유사점
		//객체 생성 불가
		//상속 위한 수퍼 클래스로만 사용
		//다형성 실현 위한 도구
		
	//차이점
		//추상클래스 - 목적
			//하위클래스에서 공통으로 필요로 하는 기능을 추상클래스에서 완성
			//하위클래스에서 구현해야만 하는 기능은 추상메소드로 선언
		//추상클래스 - 구성
			//추상메소드와 구현완료 메소드를 모두 포함
			//객체 필드, 상수 포함
		
		//인터페이스 - 목적
			//객체 기능 규격화해 제시하는 표준 문서
			//인터페이스 구현하는 서브클래스 상황에 맞춰 모든 추상클래스 재정의를
			//개발자에게 위임
		//인터페이스 - 구성
			//객체 필드 불포함
			//abstract, default, static, private 메소드 포함
			//추상 메소드는 private, protected 불가
		
	//추상클래스 선택하는 경우
		//밀접하게 관련된 클래스끼리 메소드/필드 공유해야 할때
		//다양한 접근 제어 필요할 때
			//public 아닌 protected, private 같은게 필요할 경우
		//객체 필드 취급하는 메소드 정의할 때
		
	//인터페이스 선택하는 경우
		//연관성 없는 클래스들이 인터페이스만 공유하고자 할때
			//Ex: Comparable를 구현하는 많은 클래스들은 서로 연관성 X
			//추상클래스보다 자율성이 더 높음
		//다중 상속이 필요할 때
	}
	void p106_final_method_class() {
	//final 메소드
		//하위 클래스에게 오버라이딩 허용하지 않음
		//접근 제한과 관련 없음
		//표준 라이브러리 대부분 메소드는 public final
		//private 메소드는 결코 상속 불가 -> final의 의미 가짐
	//final 클래스
		//클래스 자체가 상속 불허
		//클래스 내 모든 메소드는 자동으로 final 메소드
	}
	
	
	
	
	
	
}
