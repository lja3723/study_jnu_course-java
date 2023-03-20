package chapter02;

public class Ch02_Operator {
	
	public static void p18_RealNumModOp() {
		/*
		 * n, d가 실수일 떄 n % d는 n - (d * q) (q는 n/d의 정수부)
		 * 몫 부호는 n/d 부호와 동일
		 * 나머지 부호는 n의 부호와 동일
		 */
		
		System.out.println(7.5 % 2.0);
		System.out.println(-7.5 % 2.0);
		System.out.println(7.5 % -2.0);
		System.out.println(-7.5 % -2.0);
	}
	public static void p23_IncDecOp() {
		int p = 16;
		System.out.println(++p + " " + p++ + " " + p);
		
		char b = 65; // ‘A’를 의미
		b += 5;
		System.out.println("b = " + b);
		System.out.println("b = " + b++);
		System.out.println("b = " + ++b);
//		b = b + 1;
		System.out.println("b = " + b);

		//!!!!//
		int x = 3;
		x = x++;
		System.out.println(x);
		//!!!!//
		
		int x2 = -100;
		System.out.println(++x2);
		System.out.println(x2);
	}
	public static void p34_AssignOp() {
		int i = 8;
		i += (i = 4);
		int j = 8;
		j = j + (j = 4);
		int three = 3;
		three = -three++ * 5;
		System.out.println("three = " + three);
	}
	public static void p45_LogicOp() {
		//논리연산자는 피연산자로 boolean 타입을 취하며 연산 결과 역시 boolean이다
		//논리연산자의 종류
		// &	Logical AND
		// |	Logical OR
		// ^	Logical XOR(Exclusive OR)
		// !	Not
		//논리연산자는 비트 연산자와 자주 혼동된다
		//비트 연산자는 피연산자로 정수를 취하고 연산 결과는 비트가 바뀐 정수이다
		// &,|,^,! 연산자는 피연산자가 boolean이면 논리연산자, 정수이면 비트연산자로 기능함
		
		//조건부 논리연산자
		// && 	Conditinal AND
		// || 	Conditinal OR
		//연산 처리
		// &&는 &와 같다. 단, 왼쪽 피연산자의 값이 true일 때만 오른쪽 피연산자의 값을 처리한다.
		// ||는 |와 같다. 단, 왼쪽 피연산자의 값이 false일 때만 오른쪽 피연산자의 값을 처리한다.
		//우선순위
		// 논리연산자 &, |가 조건부 논리연산자 &&, ||보다 높다

		int a = 1, b = 2, c = 0;
		boolean f = false & (9 == (c = 9)); 
		// -> & 연산자는 좌변이 false라도 우변을 평가한다
		
		System.out.println(c);
	}
	public static void p58_BitOp() {
		//피연산자가 정수!!
		
		int a = 0b0110_1010;
		int b = 0b1100_1101;
		
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println(Integer.toBinaryString(a ^ b));
		System.out.println(Integer.toBinaryString(~a));
		
		int sa = 0x55ff;
		int sb = 0x00ff;

		System.out.printf("a: %08x\n", sa);
		System.out.printf("b: %08x\n", sb);
		System.out.printf("a ^ b: %08x\n", sa ^ sb);
		System.out.printf("a ^ 0x0000: %08x\n", sa ^ 0x0000);
		System.out.printf("a ^ 0xffff: %08x\n", sa ^ 0xffff);
		System.out.printf("~a: %08x\n", ~sa);
		System.out.printf("0x1234abcd ^ 0x00ff00ff: %08x\n", 0x1234abcd ^ 0x00ff00ff);
	}
	public static void p65_Diff() {
		int num = 65671; // 65671 = 65536 +135
		System.out.printf("%d\n", (byte) num); 
			//부호를 가지는 8비트, 첫비트를 부호로 처리
		System.out.printf("%d\n", num & 0xff); 
			//int형, 부호가 없음
		System.out.println(Integer.toHexString((byte)num));
		System.out.println(Integer.toHexString(num & 0xff));
	}
	public static void p66_XorEx() {
		int move = 0;
		for (int i = 0; i < 10; i++)
			System.out.println(move ^= 1);
	}
	public static void p67_q() {
		int a = 0b10101010;
		for (int i = 0; i < 4; i++) {
			System.out.print("bits: " + Integer.bitCount(a) + ", ");
			System.out.println(Integer.toBinaryString(a &= a - 1));
		}
	}
	public static void p70_ShiftOp() {
		// >> << >>>
		// 비트 연산자의 피연산자는 정수, char (실수 불가능)
		// 연산 결과 타입은 왼쪽 피연산자를 따름(단 최소 결과는 int임)
		// byte << long -> int
		// >>, <<: 결과는 부호 유지, >>>: 결과는 항상 양수
		
		int a = -128;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(a));
			a >>>= 1;
		}
 	}
	public static void p85_복합대입연산자() {
		//이향 연산자와 대입 연산자의 결합 (단항 연산자 불가능)
		// a (op)= b  <==>  a = a (op) b
		//왼쪽 피연산자는 미리 선언된(초기화된) !변수! 여야 함
		//오른쪽 피연산자는 값 있는 어떤 식도 가능
	}
}
