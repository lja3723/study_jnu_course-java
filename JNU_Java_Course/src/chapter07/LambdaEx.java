package chapter07;

import java.awt.Point;
import java.util.*;
import java.util.function.*;

public class LambdaEx {
	public static void run() {
		p66_메소드_참조();
	}
	
	static void p09_Predicate() {
		Predicate<Integer> pred = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i / 2 * 2== i;
			}
		};
		System.out.println(pred.test(123));
		System.out.println(pred.test(Integer.valueOf(346)));

	}
	
	static void p11_Ex() {
		Integer[] numbers = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(numbers));
		Predicate<Integer> isPositive = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i > 2;
			}
		};
		/* 조건에 맞는 양수의 합 */
		int sum = 0;
		for (Integer num : numbers) {
			if (isPositive.test(num)) {
				sum += num;
			}
		}
		System.out.println("Sum of Positive Integers greater than 2: " + sum);

	}

	static void p14_Consumer() {
		//side-effect다
		Consumer<Integer> consumer = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.print(" " + i);
			}
		};

		Integer[] ints = { 5, 7, 11, 13 };
		printArr(ints, consumer);
		System.out.println();

		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		printList(list, consumer);
		System.out.println();
		// Another try
		list.forEach(consumer);
	}
	public static void printList(List<Integer> list, Consumer<Integer> consumer) {
		for (Integer integer : list) {
			consumer.accept(integer);
		}
	}
	public static void printArr(Integer[] arr, Consumer<Integer> consumer) {
		for (Integer i : arr) {
			consumer.accept(i);
		}
	}
	static void p23_Ex() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(-1);

		list.forEach(new Consumer<Integer>() {
		  public void accept(Integer i) {
		    System.out.print(i + " ");
		  }
		});
		System.out.println();

		Consumer<Object> consumer = new Consumer<Object>() {
		 public void accept(Object o) {
		   System.out.print(o + " ");
		 }
		};
		list.forEach(consumer);
		System.out.println();	
	}
	static void p27_Function() {
		Function<String, Double> func = new Function<String, Double>(){
			public Double apply(String s) {
				return Double.parseDouble(s);
			}
		};
		System.out.println(func.apply("3.141592"));
	}
	static void p29_Ex() {
		Function<Integer, Double> inverse = new Function<Integer, Double>(){
			public Double apply(Integer i) {
				return 1.0 / i;
			}
		};
		System.out.println(inverse.apply(8));
	}
	static void p32_Ex() {
		Function<List<String>, Integer> func = new Function<List<String>, Integer>(){
			public Integer apply(List<String> list) {
				return list.size();
			}
		};
		List<String> list = Arrays.asList("Seoul", "Peking", "Paris", "Tokyo");
		System.out.println(func.apply(list));
	}
	
	static ArrayList<Point> pointList = new ArrayList<Point>();
	static {
		pointList.add(new Point(1, 2));
		pointList.add(new Point(-1, -1));
		pointList.add(new Point(2, 3));
	}
	static void p38_Ex_Function() {
		//모든 점을 이동시키는 코드 (람다식 사용 X)
		class Printing implements Consumer<Point>{
			public void accept(Point p) {
				System.out.print(" " + p);
			}
		}
		pointList.forEach( new Printing() );
		System.out.println();
		pointList.forEach( new Consumer<Point>() {
			public void accept(Point p) {
				p.translate(1, 1);
			}
		});
		pointList.forEach( new Consumer<Point>() {
			public void accept(Point p) {
				System.out.print(" " + p);
			}
		});
	}
	static void p44_Ex_Lambda() {
		//모든 점을 이동시키는 코드 (람다식 사용 O)
		pointList.forEach( p -> System.out.print(" " + p) );
		System.out.println();
		pointList.forEach( p -> p.translate(1, 1));
		pointList.forEach( p -> System.out.print(" " + p));
	}

	static void p66_메소드_참조() {
		// s -> Integer.parseInt(s) 가
		// Integer::parseInt 로 간단해진다
		Function<String, Integer> func = s -> Integer.parseInt(s);
		//func = Integer::parseInt();
		System.out.println(func.apply("12345"));
	}
	
	
	
}
	
