package chapter02;

import java.util.Formatter;

public class Ch02_Print {
	public static void p42_PrintStream() {
		//print, println, printf는 PrintStream의 메소드
		//System.out 이용해서 출력
	}
	
	public static void p44_StringPlus() {
		//"Str" + 1010 = "Str1010"
				//'A' + 1.0
				//'A' + 'Z'
				//"A" + "Z"
				//"A" + 'Z'
				//"My Father" + 5 + 2 
			//	"" + 3 – 4
			//	3 + 4 + ""
	}
	public static void p47_Print_Println() {
		//print, println은 인자 1개 받아들임
		//예시
		System.out.println( ((13 + (13 * 3 - 1) / 5
				+ 1988 % 100
				+ 1988 % 100 / 4
				+ 1988 / 400
				- 2 * (1988 / 100)) % 7 + 7) % 7 ); //5
		System.out.print( 'A' + 'B' + " is " + 1 + " example");
		
		//System.out.println("Korean", "Japan");
		//System.out.print() 불가능 (인자 있어야함)
	}
	public static void p51_printf() {
		//System.out.printf(formatString); 
		//System.out.printf(formatString, argumentList);
		//formatString: 출력 서식 문자열
		//argumentList: 인자 목록
		float inches = 40f;
		System.out.printf("There are %01f centimeters in %.2f inches", 2.54 * inches, inches);
		//tag가 인자보다 더 많으면 MissingFormatArgumentException 예외 발생
		//에러(예외)는 복잡해 객체로 표현
		//그것이 예외이며 예외는 체계가 있는 에러 메시지
	}
	public static void p53_FormatSpecifier() {
		//for general, character, and numeric types
		//%[argument_index$][flags][width][.precision]conversion

		//argument_index: 인자 인덱스, 인자 목록에서 지정할 인자의 위치를 나타내는 정수
		
		//flags: 출력 형식 바꾸는 문자 집합
		//+: 음양 부호 표시
		//-: 왼쪽 정렬
		//-가 없으면 기본으로 우측 정렬
		System.out.printf("%5d  ", 123); // ..123
		System.out.printf("%-5d  ", 123); // 123..
		//#: o, x/X 변환임을 확실히 하기 위해 앞에 0이나 0x/0X를 붙여 출력
		//0: width와 함께 사용하며 공백 대신 Leading Zero를 출력
		System.out.printf("%05d  ", 50); // 00050
		//(: 음수이면 괄호 속에 표시
		System.out.printf("%(d  ", -56789); // (56789)
		//,: 1000 단위마다 콤마로 분리
		System.out.printf("%,d  ", 123456789); // 123,456,789
		
		//width: 전체 출력 폭을 표시하는 정수(출력될 문자의 최소 길이)
		//.precision: 실수인 경우 소수점 이하 자릿수
		//%5.1f : 전체 폭을 5자리로 잡아 실수로 출력, 정수 부분 3자리 + 소수점 + 소수점 이하 1자리(소수점 이하 두 번째 자리에서 반올림)로 구성
		
		//conversion: 변환 문자B, b : boolean 값 출력
		//H, h : 해시값을 16진수로 출력
		//S, s : 문자열 출력
		//C, c:  문자 출력
		//d:  10진수로 출력
		//o : 8진수로 출력
		//x: 16진수로 출력, Hexadecimal Integer (소문자 a ~ f)
		//X: 16진수로 출력, Hexadecimal Integer (대문자 A ~ F)
		//f: Floating point , 실수로 출력
		//E, e: 실수를 과학표기법으로 출력
		//G, g: 실수를 일반적 과학표기법으로 출력
			// (Precision만큼 유효자리수를 잡아 반올림 후 
			// 10-4보다 작거나 10precision보다 크거나 같으면 과학표기법, 
			// 아니면 소수점 표기법)
		//n: 줄 바꿈 //%n은 printf에서만 가능; println은 안됨
		//%: % 출력
		
		System.out.println("%n예시:");
		//예시
		//정수 
		System.out.printf("%5d%n", 1234); // ⊔1234 
		System.out.printf("%d%n", 1234); // 1234 
		//실수 
		System.out.printf("%6.2f%n", 12345.67890); // 12345.68
		System.out.printf("%.2f%n", 12345.67890); // 12345.68
		//실수: E 표기법
		System.out.printf("%8.3e%n", 12345.67890); // 1.235e+04
		System.out.printf("%e%n", 12345.67890); // 1.234568e+04
		//문자열
		System.out.printf("%8s%n", "refrigeration"); // refrigeration
		System.out.printf("%s%n", "refrigeration"); // refrigeration
		//문자
		System.out.printf("%2c%n", '화'); // ⊔화
		System.out.printf("%c%n", '화'); // 화

		System.out.println();
		System.out.printf("%X%n", 32768); // 8000 인쇄하고 줄 바꿈
		System.out.printf(" %6X%n ", 32768); // ⌵⊔⊔8000⌵ 인쇄하고 줄 바꿈
		System.out.printf("%3$2s %2$2s %1$2s%n", "a", "b", "c"); // ⊔c⌵⊔b⌵⊔a 
		System.out.printf("e = %+10.4f%n", Math.E); // e =⌵⊔⊔⊔+2.7183
		System.out.printf("%1$.5g %1$.4g %1$.3g %1$.2g %n", Math.PI * 100);
		//여기에서 Precision은 소수점 이하 자리수가 아니라 유효자리수
		// 314.16⊔314.2⊔314⊔3.1e+02
	}
	public static void p58_printf_question() {
		double num = 1234567890.123456789;
		System.out.printf("%f %n", num);
		System.out.printf("%E %n", num);
		System.out.printf("%18.5f %n", num);
		System.out.printf("%+10.5f %n", num);
		System.out.printf("%10.2f %n", num);
		System.out.printf("$%f %n", num);
		System.out.printf("%10.2f microgram %n", num);
	}
	public static void p61_Formatter() {
		//java.util에 속한 클래스
		//Formatter의 출력 메소드 format()는 System.out.printf()와 동일한 기능
		//System.out에는 동일한 기능의 printf()와 format()가 정의되어 있어 다음 코드의 실행 결과는 동일하다
		System.out.printf("%5.1f", 12.5); 
		System.out.format("%5.1f", 12.5);
		
		//Formatter의 format()는 PrintStream인 콘솔 뿐만 아니라 String, File, OutputStream에도 기록할 수 있다
		//다음처럼 Formatter 생성자에게만 넘기면 된다
		try {

			//Formatter 객체만 생기면 기록할 수 있다
			Formatter formatter = new Formatter("angles.txt"); // 파일에 기록
			
			for(double degrees = 0.0; degrees < 360.0; degrees++) {
			    double radians  = Math.PI * degrees / 180.0;
			     formatter.format("%5.1f   %5.1f \n", degrees, radians);
			}
			formatter.flush();
			formatter.close();

		}
		catch (Exception e) { }
		
	}
}
