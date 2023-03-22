package chapter03;

import java.util.Scanner;

public class Ch03_While {
	public static void p42_Ex() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		for (i = 0; i < 10; i++)
			System.out.println(i);
			
		char ch = 'A';
		while (ch != 'Z' + 1)
			System.out.println(ch++);
	}
	
	public static void p46_Ex() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n ÀÔ·Â: ");
		int n = sc.nextInt();
		
		double sum = 0;
		int i = 0;
		while (i++ < n)
			sum += sc.nextInt() / (double)n;
		System.out.println(sum);
		
		sc.close();
	}
	
	public static void p49_Ex() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0, n = -1;
		
		while (input != -1) {
			sum += input;
			n++;
			input = sc.nextInt();
		}
		
		System.out.println(sum / (double)n);
		
		sc.close();
	}
	
	public static void p52_Ex() {
		double initRatio = 1.0;
		double endRatio = initRatio * 2;
		
		int year = 0;
		while (initRatio < endRatio) {
			initRatio *= 1.1;
			year++;
		}
		
		System.out.println(year + "³â");
		
	}
}
