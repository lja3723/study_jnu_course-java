package chapter03;

import java.util.Scanner;

public class Ch03_Array {
	public static void p07_DeclareAndUse() {
		int[] arr = new int[10];
		char[] season = new char[12];
		float weight[] = new float[7];
		
		//8���� ���ð� �迭 ������ �� ���Ҵ� �⺻������ �ʱ�ȭ��
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		//���� �ϴ� �Ǵٸ� ���
		int[] square = {0, 1, 4, 9, 16};
		
		//�ʱ�ȭ �� ���ο� �迭�� �ٽ� ����(���� �迭 �ʱ�ȭ)
		//�����̶� ���� ������ Ÿ���� �ƴ� ��Ÿ�ӿ� �޸𸮰� �����ȴٴ� ����
		square = new int[]{1, 2, 3, 4, 5};
		//square = {1,1,1,0,1};	//����
	}
	public static void p25_ArrayLength() {
		int[] arr = new int[10];
		System.out.println(arr.length);

		char[] gender = { 'M', 'F' };
		System.out.println(gender.length);
		//gender.length = 3;
		
		System.out.println("Christmas".getBytes().length);
		
		//���� ������?
		int[] a;
		int[] b = {};
		//System.out.println(a.length); �ʱ�ȭ�� �ȵ�
		System.out.println(b.length);		
	}
	public static void p29_arrayElem() {
		int[] intArray = new int[5];
		//int n = intArray[-2]; //������ ���Ұ�
		//int m = intArray[5]; //�迭 ũ�� ����
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		System.out.println(b[a[2]]); //��°�: b[3] == 9
	}
	public static void p34_Ex() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("�� 5�� �Է�: ");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		
		int maxval = arr[0];
		for (int i = 1; i < 5; i++)
			if (maxval < arr[i])
				maxval = arr[i];
		
		System.out.println("�ִ밪: " + maxval);
		sc.close();
	}
	public static void p37_Ex() {
		int intArray[] = new int[5]; // �迭�� ����� ����

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // Ű���忡�� �Է� ���� ���� ����
		
		int min = intArray[0];
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i]; // �迭�� ����� ���� ���� ���ϱ�
			if (intArray[i] < min)
				min = intArray[i];
		}
		
		sum -= min;
		System.out.print("����� " + (double)sum/(intArray.length - 1));
		scanner.close();
	}
	public static void p40_ArrayAccess() {
		int[] arr1 = new int[5];
		int[] arr2 = arr1;
		
		arr1[2] = 3;
		arr2[2] = 25;
		System.out.println(arr1[2]);
		//arr1�� �Ǵٸ� �̸��� arr2�� �����Ѵ�
		//�迭�������� ġȯ�̶�� ��
		
		byte[] byteArray = new byte[2];
		// ==�� �̿��� �迭��
		int[] a = {1, 2, 3, 4};
		int[] b = {1, 2, 3, 4};
		System.out.println( a == b ); // false, ���빰�� ������ �ٸ� �迭
		//a�� b�� ���� �ٸ� ��ü�̱� ������
		
		//�迭�� ��ü�����̴�
	}
	public static void p47_Foreach() {
		int[] prime = {2, 3, 5, 7, 11, 13};
		
		for (int k : prime) {
			if (k == 5)
				k = 50; //�迭 ���Ҵ� ������ �ȵ�
			System.out.print(k + " ");
		}
		System.out.println();
		for (int k : prime) {
			System.out.print(k + " ");
		}
		
		//���ǻ���
		//���� �߰�, ���� �� �÷��� ���������� �Ұ���
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
		
		//������ �ǹ�
		int[][] b = new int[2][10];
		//b�� 2���� �迭
		//b[0]�� 0��° �迭���Ҹ鼭 1���� �迭
		//b[0][0]�� b[0]�� 0��° ����
		
		int[][] i = new int[2][5]; //�迭 ������ 3�� (1 + 2)
		System.out.println(i.length); //2
		System.out.println(i[0].length); //5
		System.out.println(i[1].length); //5
		
		int[][][] j = new int[2][5][4]; //�迭 ������ 13�� (1 + 2 + 10)	
	}
	public static void p66_Ex() {
		double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		//��ü ���
		double sum = 0.0;
		for (int year = 0; year < score.length; year++)
		    for (int term = 0; term < score[year].length; term++) 
			sum += score[year][term];
		System.out.println("��� ������" + sum / (score.length * score[0].length) );
		
		//�г⺰ ���
		System.out.println();
		for (int year = 0; year < score.length; year++) {
			double sum1 = 0.0;
		    for (int term = 0; term < score[year].length; term++) 
		    	sum1 += score[year][term];
		    System.out.println(year + 1 + "�г� ��� ������ " + sum1 / (score[year].length) );
		}
		
		
		double max = score[0][0];
		
		//�б⺰ ���
		System.out.println();
		for (int term = 0; term < score[0].length; term++) {
			double sum2 = 0.0;
			for (int year = 0; year < score.length; year++) {
				sum2 += score[year][term];
			}
			System.out.println(term + 1 + "�б� ��� ������ " + sum2 / score.length);
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
			System.out.printf("\n%d ��б� ���  ���� %6.2f", term + 1, sum / 3);
		}
	}
	public static void p72_Ex() {
		int[][] arr = { { 1, 2, 3, 4 }, { 1, 2 }, { 3, 4, 5, 6, 7 } };
		for (int i = 0; i < arr.length; i++, System.out.println())
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
	}
	//�� ���� �� ���� �ٸ� �迭
	public static void p75_RaggedArray() {
		//���� �� ��Ÿ���� ù ������ ũ�⸸ �ϴ� ������
		//�� ���� ������ �ٽ� 1���� �迭�� �����ϸ� ������
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
		//�迭�̸��� �ٲٴ� ���: �ĺ��� ���� ��  Alt + Shift + R
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
		System.out.println("����: " + sum);
	}
}
