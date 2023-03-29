package chapter03;

import java.util.Scanner;

public class Ch03_Array {
	public static void p07_DeclareAndUse() {
		int[] arr = new int[10];
		char[] season = new char[12];
		float weight[] = new float[7];
		
		//8가지 원시값 배열 생성시 각 원소는 기본값으로 초기화됨
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		//대입 하는 또다른 방법
		int[] square = {0, 1, 4, 9, 16};
		
		//초기화 후 새로운 배열을 다시 대입(동적 배열 초기화)
		//동적이란 말은 컴파일 타임이 아닌 런타임에 메모리가 결정된다는 뜻임
		square = new int[]{1, 2, 3, 4, 5};
		//square = {1,1,1,0,1};	//오류
	}
	public static void p25_ArrayLength() {
		int[] arr = new int[10];
		System.out.println(arr.length);

		char[] gender = { 'M', 'F' };
		System.out.println(gender.length);
		//gender.length = 3;
		
		System.out.println("Christmas".getBytes().length);
		
		//둘의 차이점?
		int[] a;
		int[] b = {};
		//System.out.println(a.length); 초기화가 안됨
		System.out.println(b.length);		
	}
	public static void p29_arrayElem() {
		int[] intArray = new int[5];
		//int n = intArray[-2]; //음수는 사용불가
		//int m = intArray[5]; //배열 크기 넘음
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		System.out.println(b[a[2]]); //출력값: b[3] == 9
	}
	public static void p34_Ex() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("수 5개 입력: ");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		
		int maxval = arr[0];
		for (int i = 1; i < 5; i++)
			if (maxval < arr[i])
				maxval = arr[i];
		
		System.out.println("최대값: " + maxval);
		sc.close();
	}
	public static void p37_Ex() {
		int intArray[] = new int[5]; // 배열의 선언과 생성

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력 받은 정수 저장
		
		int min = intArray[0];
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
			if (intArray[i] < min)
				min = intArray[i];
		}
		
		sum -= min;
		System.out.print("평균은 " + (double)sum/(intArray.length - 1));
		scanner.close();
	}
	public static void p40_ArrayAccess() {
		int[] arr1 = new int[5];
		int[] arr2 = arr1;
		
		arr1[2] = 3;
		arr2[2] = 25;
		System.out.println(arr1[2]);
		//arr1의 또다른 이름을 arr2로 설정한다
		//배열참조변수 치환이라고 함
		
		byte[] byteArray = new byte[2];
		// ==을 이용한 배열비교
		int[] a = {1, 2, 3, 4};
		int[] b = {1, 2, 3, 4};
		System.out.println( a == b ); // false, 내용물은 같지만 다른 배열
		//a와 b는 서로 다른 객체이기 때문임
		
		//배열은 객체지향이다
	}
	public static void p47_Foreach() {
		int[] prime = {2, 3, 5, 7, 11, 13};
		
		for (int k : prime) {
			if (k == 5)
				k = 50; //배열 원소는 변경이 안됨
			System.out.print(k + " ");
		}
		System.out.println();
		for (int k : prime) {
			System.out.print(k + " ");
		}
		
		//주의사항
		//원소 추가, 삭제 등 컬렉션 변경행위는 불가능
	}
	public static void p58_2dArray() {
		int[][] arr1 = new int[2][5];
		int[] arr2[] = {{4, 5}, {2, 0}, {3, 6}};
		int arr3[][];
		
		//p59 ex
		int[][] p59ex = new int[2][3];
		p59ex[0][0] = 10;
		p59ex[0][1] = 20;
		p59ex[0][2] = 30;
		p59ex[1][0] = 40;
		p59ex[1][1] = 50;
		p59ex[1][2] = 60;
		
		//선언의 의미
		int[][] b = new int[2][10];
		//b는 2차원 배열
		//b[0]은 0번째 배열원소면서 1차원 배열
		//b[0][0]은 b[0]의 0번째 원소
		
		int[][] i = new int[2][5]; //배열 개수는 3개 (1 + 2)
		System.out.println(i.length); //2
		System.out.println(i[0].length); //5
		System.out.println(i[1].length); //5
		
		int[][][] j = new int[2][5][4]; //배열 개수는 13개 (1 + 2 + 10)	
	}
	public static void p66_Ex() {
		double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		//전체 평균
		double sum = 0.0;
		for (int year = 0; year < score.length; year++)
		    for (int term = 0; term < score[year].length; term++) 
			sum += score[year][term];
		System.out.println("평균 평점은" + sum / (score.length * score[0].length) );
		
		//학년별 평균
		System.out.println();
		for (int year = 0; year < score.length; year++) {
			double sum1 = 0.0;
		    for (int term = 0; term < score[year].length; term++) 
		    	sum1 += score[year][term];
		    System.out.println(year + 1 + "학년 평균 평점은 " + sum1 / (score[year].length) );
		}
		
		
		double max = score[0][0];
		
		//학기별 평균
		System.out.println();
		for (int term = 0; term < score[0].length; term++) {
			double sum2 = 0.0;
			for (int year = 0; year < score.length; year++) {
				sum2 += score[year][term];
			}
			System.out.println(term + 1 + "학기 평균 평점은 " + sum2 / score.length);
		}
			
		
	}
	public static void p70_Ex() {
		int amount[][] = { 
				{ 90, 90, 110, 110 }, 
				{ 120, 110, 100, 110 }, 
				{ 120, 140, 130, 150 } 
			};
		for (int term = 0; term < 4; term++) {
			double sum = 0;
			for (int year = 0; year < 3; year++)
				sum += amount[year][term];
			System.out.printf("\n%d 사분기 평균  매출 %6.2f", term + 1, sum / 3);
		}
	}
	public static void p72_Ex() {
		int[][] arr = { { 1, 2, 3, 4 }, { 1, 2 }, { 3, 4, 5, 6, 7 } };
		for (int i = 0; i < arr.length; i++, System.out.println())
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
	}
	//각 행의 열 수가 다른 배열
	public static void p75_RaggedArray() {
		//행의 수 나타내는 첫 차원의 크기만 일단 지정함
		//각 행의 열수는 다시 1차원 배열을 생성하며 지정함
		int arr[][] = new int[4][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		
		int n = 1;
		int[][][] arr3d = new int[5][][];
		for (int i = 0; i < arr3d.length; i++) {
			arr3d[i] = new int[i + 1][];
			for (int j = 0; j < i + 1; j++) {
				arr3d[i][j] = new int[j + 1];
				for (int k = 0; k <= j; k++)
					arr3d[i][j][k] = n++;
			}				
		}
		
		for (int i = 0; i < arr3d.length; i++) {
			for (int j = 0; j < arr3d[i].length; j++) {
				for (int k = 0; k < arr3d[i][j].length; k++)
					System.out.print(arr3d[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}			
	}
	public static void p80_Ex() {
		//배열이름을 바꾸는 방법: 식별자 선택 후  Alt + Shift + R
		int[][] arr = new int[4][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[3 - (i % 2)];
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = 10 * (i + 1) + j;
		}
		
		for (int i = 0; i < arr.length; i++, System.out.println())
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
	}
	public static void p83_foreach2DArray() {
		int[][] arr = { { 1, 2, 3, 4 }, { 7, 8 }, { 13, 14, 15, 16, 17 } };
		for (int[] row: arr) {
			for (int col: row) 
				System.out.printf("%-3d", col);
			System.out.println();
		}
	}
	public static void p87_MainArgs(String[] args) {
		//ex3-13 (p89)
		double sum = 0;
		for (int i = 0; i < args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("총합: " + sum);
	}
}
