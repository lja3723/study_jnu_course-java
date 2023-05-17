package chapter05.executes;

import java.util.Scanner;

import chapter05.classes_exception.*;

public class ExceptionEx {
	static void p() {}
	static void q() throws Exception {}
	
	public static void p00_Ex() {}
	void p04_callee결과보고() {
		//예외는 Callee가 Caller에게 일의 결과를 보고하는 방법
		//메소드 반환값과 성격이 매우 흡사
		//정상적으로 작업을 마치면 반환값을 반환해 일의 처리 결과 보고(반환값 X)
		//비정상적인 상황이 발생한 경우 예외를 발생시켜 일의 처리 결과 보고됨
			//비정상 상황의 메소드 리턴값
			//예외는 비정상 상황을 표시하는 객체
		
		//예외처리의 2가지 유형
		//
	}
	public static void p08_Ex() {
		Scanner s = new Scanner(System.in);
		System.out.println("나눌 수를 입력하세요:");
		int dividend = s.nextInt();
		System.out.println("나누는 수를 입력하세요:");
		int divide = s.nextInt();
		System.out.println("결과는: " + (dividend / divide));
		s.close();
	}
	public static void p14_tryCatch() {
		try {
			q();
			// try 블록
			// 예외가 발생할 가능성이 있는 실행문
		} catch (Exception e) {
			// catch 블록
			// MyException 예외가 발생했을 때 처리할 명령
			// Exception Handler라고도 부름
		}
		// 다음에 이어지는 문장
	}
	public static void p15_TryCatchFinally() {
		try { // try 블록
			q();
			// 예외가 발생할 가능성이 있는 실행문
		} catch (Exception e) { // catch 블록		-> 여러개의 catch를 둘 수 있음
			// Exception Handler라고도 부름 
			// MyException 예외가 발생했을 때 처리할 명령
		} finally { // finally 블록
			//예외 발생 여부와 상관없이 무조건 실행되는 문장
			// finally 블록은 생략 가능
		}
		// 다음에 이어지는 문장

		//try-finally도 가능하다
	}
	public static void p19_ExceptionEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = s.next();
		try {
			int a = Integer.parseInt(str);
			System.out.println("Input value: " + a);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred. ");
			System.out.println("Please, enter an integer!");
		}
		System.out.println("End of try-catch.");
		s.close();
	}
	void p23_TryCatchFinallyDiscription() {
	//try
		//예외를 발생시키는 메소드를 호출하는 곳
		//예외와 관련 없는 문장 있어도 됨
	//catch
		//호출한 메소드가 발생시킨 예외를 받아 처리하는 곳
		//==Exception Handler라고도 함
		//여기에서는 잡아야 할 예외가 다음과 같은 형식으로 표시되어야 함
			//잡아야 할 예외 타입 + 변수명
		//catch 블록에서는 발생한 예외 발생 상황을 분석하기 위해
		//getMessage(), printStackTrace()를 호출하기도 함
			//printStackTrace(): 예외 발생상황의 스택을 출력해줌
	//finally (p29)
	}
	public static void p25_Ex() {
		try {
			P25_Ex.a();
		} catch (Exception e) {
			System.out.println(e.getMessage() + "caught in main");
			e.printStackTrace();
		}
	}
	public static void p26_Ex() {
		P26_Ex.a();
	}
	
	public static void p31_Ex() {
		showUpTo5();
	}
	static void showUpTo5(){
		int count = 0;
		try{
			int k = 5; //지역변수로 try에서만 사용 가능
			
			while(true){
				if(++count  > 5) 
					return;
				System.out.println((char)(64 + count));
			}
		} catch(Exception e){
		} finally {
			System.out.println( (count - 1) + " characters processed");
		}
	}
	public static void p34_Ex() {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+ dividend/divisor+"입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}		
	}
	public static void p35_Ex() {
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
	public static void p36_Ex() {
		String[] stringNumber = {"23", "12", "998", "3.141592"}; 
		try {
			for (int i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
	}
	void p43_ExceptionHierarchy() {
	//Throwable : 예외 최상위 크래스; 명칭이 인터페이스같지만(-able) 클래스임
		//Error	:자바 시스템 내부 연락방식
		//Exception	:프로그램 착오로 인한 예외  표시
			//RuntimeException
	}
	void p44_Throwable() {
		//public Throwable()
		//public Throwable(String  msg )
		//public String getMessage()
		//public void printStackTrace() 
			//: 예외가 발생한 메소드까지의 호출  순서(Call Stack)를 역으로 보여 준다
			//main() –  a – b – c 순으로 호출되었다면 c – b – a – main() 순
		//public String toString()
	}
	void p45_SelfDefinedException() {
		//Exception을 상속하자.
		
		//public Exception()
		//public Exception(String message)
		//msg는 예외를 설명하는 문자열
	}
	public static void p47_Ex() {
		try {
			excepMethod();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public static void excepMethod() throws Exception {
		throw new P45_MyException("Exception from excepMethod()" );
	}	
	public static void p48_Ex() {
		try {
			excepMethod2();
		} catch (P48_UserException e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println(e.getMsg());
		}
	}
	public static void excepMethod2() throws P48_UserException {
		throw new P48_UserException("msg via getMessage()", "I caught a Message");
	}
	void p49_예외던지는메소드정의() {
		//메소드 헤더에 던질 예외를 표시함
		//throws와 함께 던질 예외 타입 선언
		//메소드 몸체에서 예외를 던진다
			// 직접적인 방법: throw문으로 던짐
			// 간접적 방법: try문으로 감싸지 않고 예외를 발생시키는 메소드를 호출
	}
	public static void p53_Ex() {
		try {
			new P53_Ex().run();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void p56() {
		//throw가 되면 그 밑 코드는 실행X -> return과 똑같다
		//throw new Exception();
		
		try {
			System.out.println(1);
			int a = 4 / 0;
			System.out.println(2);
		}
		finally {
			System.out.println(3);
		}
		System.out.println(4);
	}
	void p77_비검증Exception() {
		//RuntimeException
		//Error
		//그 하위클래스
		
		//이들은 컴파일러가 검증하지 않음(컴파일 에러 X)
		//비검증 예외는 try로 감싸지 않아도 컴파일 에러 발생하지 않음
		//throws도 작성 안해도 됨
	}
	void p82_상속과생성자와Exception() {
		//메소드 오버라이딩 -> 상위 메소드보다 더 많은 예외 던지면 안됨
		//더 상위의 예외도 던지면 X
		
		//생성자와 예외
		//생성자에서 예외 선언 가능(반환 타입은 여전히 X)
	}
	
	
}
