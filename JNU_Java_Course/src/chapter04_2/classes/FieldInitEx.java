package chapter04_2.classes;

public class FieldInitEx {
	//1: �ʱ�ȭ���� ������ Ÿ���� �⺻������ �ڵ� �ʱ�ȭ
	boolean b1;		// false
	char c1; 		// '\u0000'
	int[] a1;		// null
	Math m1;		// null
	
	//2: �ʵ� ���𹮿��� �ʱ�ȭ
	static boolean b2 = true;
	char c2 = 'Q';
	int k2 = this.c2;
	
	//3: �����ڸ� ���� �� �������� �ʱ�ȭ
	//1, 2�� ������� �ʰ� �̷������
	double d3;
	int k3;
	public FieldInitEx(double d3, int k3) {
		this.d3 = d3;
		this.k3 = k3;
	}
	
	//4: �ʱ�ȭ ���(Initialization Block)�� �̿��� �ʱ�ȭ
	//�ʱ�ȭ ������ �پ��� ���ǿ� ���� �޶����� �� �ſ� ������ �� Ȱ��
	//�ʱ�ȭ ����� ��� �������� �� �տ� ����Ǿ� �����
		// 1 -> 2 -> 4 -> 3 ������ �̷�����ٴ� ��
	int i;
	int j;
	int k;
	{
		i = 5;
		j = 6;
		for (int len = 0; len < i * j; len++)
			k += len * len;
	}
	
	//5: Ŭ���� �ʵ� �ʱ�ȭ, ���� �ʱ�ȭ ���(Static Initialization Block)
	//�ʱ�ȭ ��� ���ص� �⺻������ ������
	static int si;
	static int sj;
	static int sk;
	static {
		si = 5;
		sj = 6;
		sk = 7;
	}
	public static int specialValue;
	static {
		int sum = 0;
		for (int k = 0; k < 100; k++)
			if (k % 2 == 0)
				sum += k;
		specialValue = sum;
	}
}
