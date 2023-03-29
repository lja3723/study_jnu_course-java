package chapter03;

public class Ch03_Method_1 {
	/***********[�޼��� �����]***********/
	static void p07_printStar() {
		System.out.println("******");
	}
	static boolean p24_isPrime(int p) {
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
}
