package chapter02;
import java.util.Scanner;

public class Ch02 {
	public static void EscapeSequence() {
		System.out.println("What\'s the escape code \nThis is a new line");
		System.out.println("a\tb\tc\td");
		System.out.println("abc\rdef\rghi\rjkl");
		System.out.println("\\\\ reverse slash");
		System.out.println("\101 8진수 101로 표시된 문자");
	}	
	public static void Unicode() {
		int[] name = {'이', '장', '안'};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("유니코드값" + name[i] + ", 16진수 유니코드값 = " + Integer.toHexString(name[i]));
		}
		
		System.out.println("\uc774\uc7a5\uc548");
	}	
	public static void Casting() {
		short var;
		int n = 855638017;
		var = (short)n;
		System.out.println(Integer.toHexString(n));
		System.out.println(var);
		
		double d = 1.9;
		n = (int)d;
		System.out.println(n);
		
		d = -3.9;
		n = (int)d;
		System.out.println(n);
		
		int k = 32768 + 130;
		byte b = (byte)k;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(k & 0xff));
	}
	public static void RealNumOperation() {
		double number = 0.0;
		for (int x = 0; x < 10000; x++)
			number += 0.0001;
		System.out.println(number);
		
		double x = 2.0, y = 3.14, z = -7.0;
		System.out.println(z + y + x + 1.86);
		System.out.println(x + y + z + + 1.86);
		System.out.println(x + 1.86 + y + z);
		
		double x1 = 1.0 + 2.0 + 3.0;
		double y1 = 1.0 + 1.0 + 1.0 + 1.0 + 1.0;
		if(x1 == y1); // (X)
		if(Math.abs(x1 - y1) < 0.000001); // (O)

		x = 0;
		while (Math.abs(x - 1.0) > 0.00001) {
			x = x + 0.1;
		}
	}
	public static void ScannerTest() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정보 입력$ ");
		String name = scanner.next();
		String addr = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		
		System.out.println("이름: " + name + ", 주소: " + addr + ", 나이: " + age
				+ ", 몸무게: " + weight + ", 결혼 여부: " + single);
		scanner.close();
	}
	public static void ScannerNextLine() {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		String m1 = s.nextLine();
		String m2 = s.nextLine();
		
		System.out.println("num: " + num);
		System.out.println("m1: " + m1);
		System.out.println("m2: " + m2);

		s.close();
	}
}