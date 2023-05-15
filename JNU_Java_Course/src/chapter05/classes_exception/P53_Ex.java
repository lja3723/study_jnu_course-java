package chapter05.classes_exception;

import java.util.Scanner;

public class P53_Ex {
	
	public void run() throws TooBigException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		//try {
			c = addSmall(a, b);
		//} catch(TooBigException e) {
		//	System.err.println(e.getMessage());
		//}
		
		System.out.println(c);
	}
	
	public int addSmall(int a, int b) throws TooBigException {
		if (a > 10000 | b > 10000) {
			throw new TooBigException("Your argument is too big!");
		}
		
		return a + b;		
	}
}

class TooBigException extends Exception {
	public TooBigException() {}
	public TooBigException(String msg) {
		super(msg);
	}
}


