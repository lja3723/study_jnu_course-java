package chapter03;

public class Ch03_Method_1 {
	/***********[메서드 선언부]***********/
	static void p07_printStar() {
		System.out.println("******");
	}
	static boolean p24_isPrime(int p) {
		if (p <= 1) return false;
		else if (p == 2) return true;
		else if (p % 2 == 0) return false;
		
		int n = 3;
		while (n * n <= p) {
			if (p % n == 0) 
				return false;
			n += 2;
		}

		return true;
	}
	
	/************[실습부]***************/
	public static void p07() {
		//메소드 정의: Method Definition 
		//메소드 호출: RMI (Remote Method Invocation)
		p07_printStar();
		
		//메소드 정의
		/*//반환타입 메소드이름 (형식인자1, 형식인자2)
		 * int add (int a, int b)	//메소드 헤더
		 * {
		 * 		return a + b;		//메소드 몸체
		 * }
		 */
		
		//메소드명
		//식별자 작성 규칙에 맞게 작성
		//관례적으로 소문자로 시작, 카멜 표기법 사용한다
		//volumeOfBox(), getDayOfMonth(), setSpeed()
		
		//메소드 종류  2가지: 값 반환 메서드, void 메서드
		//Side Effect: 
		//	void 메서드는 호출자(Caller)에게 영향을 미칠 수 있음
		//	반환값은 없지만 간접적으로 영향을 미친다	
		
		//2종류의 인자: 형식인자, 실인자
		//	형식인자:	메서드 정의에 들어 있는 인자
		//		(Formal Parameter, 형식 파라미터, 매개변수)
		//	실인자:	메서드 호출 시 호출자가 넘겨주는 데이터
		//		(Actual Argument, 인자, 아규먼트)	
		
		//return 문
		//	return expression;
		//	return문은 복수로 작성할 수 있다.
		//	단 반환값이 2개 이상일 수 없다.
	}
	public static void p24_Ex() {
		System.out.println("소수 목록: ");
		int newLine = 1;
		for (int i = 2; i <= 2000; i++) {
			if (p24_isPrime(i)) {
				System.out.printf("%6d", i);
				newLine++;
			}
			if (newLine == 15) {
				System.out.println();
				newLine = 1;
			}
		}
	}
}
