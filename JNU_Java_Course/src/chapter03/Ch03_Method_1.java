package chapter03;

import java.util.Random; //Random�� nextDouble();
import java.lang.Math; //Math�� (static) random(); 0~1 ����

public class Ch03_Method_1 {
	/***********[�޼��� �����]***********/
	static void p07_printStar() {
		System.out.println("******");
	}
	public static boolean p24_isPrime(int p) {
		if (p <= 1) return false;
		else if (p == 2) return true;
		else if (p % 2 == 0) return false;
		
		int n = 3;
		while (n * n <= p) {
			if (p % n == 0) 
				return false;
			n += 2;
		}

		return true;
	}
	
	/************[�ǽ���]***************/
	public static void p07() {
		//�޼ҵ� ����: Method Definition 
		//�޼ҵ� ȣ��: RMI (Remote Method Invocation)
		p07_printStar();
		
		//�޼ҵ� ����
		/*//��ȯŸ�� �޼ҵ��̸� (��������1, ��������2)
		 * int add (int a, int b)	//�޼ҵ� ���
		 * {
		 * 		return a + b;		//�޼ҵ� ��ü
		 * }
		 */
		
		//�޼ҵ��
		//�ĺ��� �ۼ� ��Ģ�� �°� �ۼ�
		//���������� �ҹ��ڷ� ����, ī�� ǥ��� ����Ѵ�
		//volumeOfBox(), getDayOfMonth(), setSpeed()
		
		//�޼ҵ� ����  2����: �� ��ȯ �޼���, void �޼���
		//Side Effect: 
		//	void �޼���� ȣ����(Caller)���� ������ ��ĥ �� ����
		//	��ȯ���� ������ ���������� ������ ��ģ��	
		
		//2������ ����: ��������, ������
		//	��������:	�޼��� ���ǿ� ��� �ִ� ����
		//		(Formal Parameter, ���� �Ķ����, �Ű�����)
		//	������:	�޼��� ȣ�� �� ȣ���ڰ� �Ѱ��ִ� ������
		//		(Actual Argument, ����, �ƱԸ�Ʈ)	
		
		//return ��
		//	return expression;
		//	return���� ������ �ۼ��� �� �ִ�.
		//	�� ��ȯ���� 2�� �̻��� �� ����.
	}
	public static void p24_Ex() {
		System.out.println("�Ҽ� ���: ");
		int newLine = 1;
		for (int i = 2; i <= 2000; i++) {
			if (p24_isPrime(i)) {
				System.out.printf("%6d", i);
				newLine++;
			}
			if (newLine == 15) {
				System.out.println();
				newLine = 1;
			}
		}
	}
	public static void p44_Random() {
		//�ǻ� ���� �߻���
		System.out.println(Math.random());
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		for (int i = 0; i < 40; i++)
		System.out.print(r.nextInt(3) + " ");
		System.out.println("\n" + r.nextDouble());
		
		//�õ带 ������ �ǻ� ����(���� ������ ������)
		System.out.println("==========seed setting random=============");
		Random seedRand = new Random(1001015L);
		for (int i = 0; i < 20; i++)
			System.out.print(seedRand.nextInt(8) + " ");
	}
	public static void p62_Ex() {
		//Monte Carlo Simulation
		int inCircle = 0;
		int simulCount = 1_000_000_000;//65_536_000;
		for (int i = 0; i < simulCount; i++) {
			double x = Math.random();
			double y = Math.random();
			if (x * x + y * y < 1)
				inCircle++;
			if (i % 10_000_000 == 0)
				System.out.println("���൵: " 
			+ (int)((double)i * 100 / simulCount) + "%");
		}
		System.out.println((double)inCircle / simulCount);
		System.out.println("��Ȯ�� ��: " + (Math.PI / 4));
	}
}

