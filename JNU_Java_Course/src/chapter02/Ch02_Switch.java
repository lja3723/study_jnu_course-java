package chapter02;

import java.util.Scanner;

public class Ch02_Switch {
	// if-else와 대응됨
	public static void p34_Ex() {
		//switch(exp)
		//exp의 타입은 long을 제외한 정수타입, 문자열 타입
		//실수, 불린 불가능
		//case exp:
		//exp의 타입은 정수, 문자열 리터럴, 상수여야 함
		Scanner s = new Scanner(System.in);

		char grade;
		System.out.print("점수를 입력(0~100): ");
		int score = s.nextInt();
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점은 " + grade + " 입니다");
		s.close();
	}
	public static void p40_Ex() {
		Scanner s = new Scanner(System.in);

		
		System.out.print("커피 메뉴 입력(에스프레소, 카푸치노, 카페라떼): ");
		String str = s.next();
		switch (str) {
		case "에스프레소":
			break;
		case "카푸치노":
			break;
		case "카페라떼":
			break;
		default:
			break;
		}
		
		s.close();
	}
}
