package chapter02;
import java.util.Scanner;

public class Ch02_IfStatement {
	public static void p03_Block() {
		int i = 10;
		{
			int j = 20; //블록 내에서만 유효
		}
		//System.out.println(i * j);
		System.out.println(i * 20);
	}
	public static void p12_IfEx() {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int result = scan.nextInt();
		if (result >= 80)
			System.out.println("축하합니다! 합격입니다.");
		
		scan.close();
	}
	public static void p14_IfElseEx() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int x = sc.nextInt();
		
		System.out.print("3의 배수");
		if (x % 3 == 0)
			System.out.println("입니다");
		else
			System.out.println("가 아닙니다");
		
		sc.close();
	}
	public static void p17_MultiIfEx() {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90.0) // score가 90.0 이상인 경우
				grade = 'A';
			else if(score >= 80.0) // score가 80.0 이상이면서 90.0 미만인 경우
				grade = 'B';
			else if(score >= 70.0) // score가 70.0 이상이면서 80.0 이만인 경우
				grade = 'C';
			else if(score >= 60.0) // score가 60.0 이상이면서 70.0 이만인 경우
				grade = 'D';
			else // score가 60.0 이만인 경우
				grade = 'F';
			System.out.println("학점은 "+grade+"입니다");
		}
		a.close();
	}
	public static void p20_InnerIfEx() {
		Scanner s = new Scanner(System.in);
		System.out.println("점수와 학년 입력: ");
		int score = s.nextInt();
		int grade = s.nextInt();
		
		if (score >= 60) {
			if (grade == 4) {
				if (score >= 70)
					System.out.println("합격");
				else {
					System.out.println("불합격");
				}
			}
			else
				System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		//더 나은 버전
		int lim = grade == 4 ? 70 : 60;
		if (score >= lim)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		s.close();
	}
}
