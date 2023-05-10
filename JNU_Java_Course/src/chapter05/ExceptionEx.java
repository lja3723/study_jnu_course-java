package chapter05;

import java.util.Scanner;

import chapter05.classes_exception.P25_Ex;
import chapter05.classes_exception.P26_Ex;

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

}
