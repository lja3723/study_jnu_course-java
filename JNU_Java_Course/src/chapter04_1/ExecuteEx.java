package chapter04_1;

import java.util.Scanner;

import chapter04_1.classes.*;

public class ExecuteEx {
	public static void p10_Ex() {
		Person kim = new Person();
		kim.age = 30;
		kim.name = "김미남";
		int i = kim.age;
		String s = kim.getName();
		System.out.println("김의 나이 = " + i);
		System.out.println("김의 이름 = " + s);
	}
	public static void p23_Ex() {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut;
		donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
	public static void p26_Ex() {
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		r.width = sc.nextInt();
		r.height = sc.nextInt();
		System.out.println(r.getArea());
	}
	public static void p30_Ex() {
		Point p = new Point();
		p.x = 2.5;
		p.y = 3.5;
		System.out.println(p.distance());
	}
	public static void p37_Ex() {
		Book b1 = new Book("어린왕자", "생텍쥐페리");
		Book b2 = new Book("춘향전");
		System.out.println(b1.title + " " + b1.author);
		System.out.println(b2.title + " " + b2.author);
	}
	public static void p39_Ex() {
		Point p = new Point(2.5, 3.5);
		System.out.println(p.distance());
	}
	public static void p68_Ex() {
		Circle[] circles = new Circle[5];
		for (int i = 0; i < circles.length; i++)
			circles[i] = new Circle(i);
		double sum = 0;
		for (int i = 0; i < circles.length; i++)
			sum += circles[i].getArea();
		System.out.println(sum);
	}
	public static void p74_Ex() {
		Book[] b = new Book[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("책 2개 정보를 입력하세요.");
		for (int i = 0; i < b.length; ++i) {
			String name, author;
			System.out.print(i + 1 + "번째 책 이름 입력: ");
			name = sc.next();
			System.out.print(i + 1 + "번째 책 저자 입력: ");
			author = sc.next();
			b[i] = new Book(name, author);
		}
		for (int i = 0; i < b.length; ++i) {
			System.out.print(i + 1 + "번째 책 정보: ");
			System.out.println("이름: " + b[i].title + ", 저자: " + b[i].author);
		}
		sc.close();
	}
	
	static int max(int m, int n) {
		return m > n ? m : n;
	}
	static int max(int m, int n, int k) {
		return max(max(m, n), k);
	}
	public static void p85_Ex() {
		System.out.println(max(4,15,8));
		System.out.println(max(14,5,8));
		System.out.println(max(4,5,18));
	}
}
