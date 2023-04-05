package chapter03;

public class Ch03_Method_2 {
	public static void p094_Ex() {
		int[ ] q = {1, 2, 7, 13, 100};
		int cnt = 0;
		for (int e : q)
			if (Ch03_Method_1.p24_isPrime(e))
				cnt++;
		System.out.println(cnt);
	}
	static void p096_func(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void p096_Ex() {
		int[] a = {2, 3, 5, 7, 9, 11, 13};
		p096_func(a);
		p096_func(new int[] {4, 6, 10, 15});
	}
	
	static void p103_printArray(int[] a) {
		for (int e : a)
			System.out.printf("%3d", e);
		System.out.println();
	}
	static void p103_increase(int[] a) {
		for (int i = 0; i < a.length; i++)
			++a[i];
	}
	public static void p103_Ex() {
		int[] arr = new int[] {5, 8, -3, 0, -1, 9}; 
		p103_printArray(arr);
		p103_increase(arr);
		p103_printArray(arr);
	}
	
	static void p110_reverseArray(int[] a) {
		for (int i = 0; i < a.length - i - 1; i++) {
			int tmp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = tmp;
		}
	}
	public static void p110_Ex() {
		int[] arr = {2, 3, 4, 5, 8, 0, -4, -2, -1, 7};
		p103_printArray(arr);
		p110_reverseArray(arr);
		p103_printArray(arr);
	}

	static void p114_printArray(char[] a) {
		System.out.print("[ ");
		for (char e : a)
			System.out.print(e + " ");
		System.out.println("]");
	}
	static void p114_anotherArray(char[] a) {
		a[0] = 'K';
		a = new char[] {'J', 'a', 'p', 'a', 'n'};
		a[0] = 'Z';
	}
	public static void p114_Ex() {
		char[] arr = "Corea".toCharArray();
		p114_printArray(arr);
		p114_anotherArray(arr);
		p114_printArray(arr);;
	}
	
	static int[] p120_makeArray() {
		return new int[] {0, 1, 2, 3};
	}
	public static void p120_Ex() {
		for (int e : p120_makeArray())
			System.out.print(e + " ");
	}
	
	static int[] p122_getReversedArray(int[] a) {
		int[] ret = new int[a.length];
		for (int i = 0; i < a.length; i++)
			ret[a.length - i - 1] = a[i];
		return ret;
	}
	public static void p122_Ex() {
		int[] arr = {1, 2, 3, 4, 8};
		p103_printArray(arr);
		int[] reversed = p122_getReversedArray(arr);
		p103_printArray(reversed);
	}
	
	static void p124_print2d(int[][] arr) {
		for (int i = 0; i < arr.length; i++, System.out.println())
			for (int j = 0; j < arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
	}
	static int[] p124_rowMajor(int[][] matrix) {
		int length = 0;
		for (int i = 0; i < matrix.length; i++)
			length += matrix[i].length;
		
		int[] ret = new int[length];
		int k = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				ret[k++] = matrix[i][j];
		
		return ret;
	}
	public static void p124_Ex() {
		int[][] arr = new int[][] {
			{1, 2, 3}, {-3, 5, 6, 7, 13}, {-2, 0, -5}
		};
		int[] result = p124_rowMajor(arr);
		p124_print2d(arr);
		p103_printArray(result);
	}
	
	//가변길이 인자 메소드
	static int p128_largest(int... num) {
		if (num.length == 0) {
			System.out.println("배열 길이가 0; ");
			return -1;
		}
		int max = num[0];
		
		for (int i = 1; i < num.length; i++)
			if (max < num[i]) max = num[i];
		return max;
	}
	public static void p128_varargs() {
		System.out.println(p128_largest(5, 9, -4, 2, 19, 7, 0));
		System.out.println(p128_largest(10));
		System.out.println(p128_largest(10, 20));
		System.out.println(p128_largest(10, 20, 30));
	}
	
	static void p133_print(int head, int... num) {
		System.out.println(num.length);
	}
	public static void p133_Ex() {
		p133_print(10);
		p133_print(10, 20);
		p133_print(10, 20, 30);
		p133_print(0, new int[] {1, 2, 3});
		
	}
}
