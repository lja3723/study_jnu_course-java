package main;

public class Main {
	public static void main(String[] args) {
		int called = 500;
		int bitts = called-50;
		int answer = 0;
		for (int i = 5; i < 2000; i++) {
			answer += (called + bitts) * (double)i/2000;
		}
		System.out.println(answer);
		
	}
}
