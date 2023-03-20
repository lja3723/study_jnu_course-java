package chapter02;

public class Ch02_Operator {
	
	public static void p18_RealNumModOp() {
		/*
		 * n, d�� �Ǽ��� �� n % d�� n - (d * q) (q�� n/d�� ������)
		 * �� ��ȣ�� n/d ��ȣ�� ����
		 * ������ ��ȣ�� n�� ��ȣ�� ����
		 */
		
		System.out.println(7.5 % 2.0);
		System.out.println(-7.5 % 2.0);
		System.out.println(7.5 % -2.0);
		System.out.println(-7.5 % -2.0);
	}
	public static void p23_IncDecOp() {
		int p = 16;
		System.out.println(++p + " " + p++ + " " + p);
		
		char b = 65; // ��A���� �ǹ�
		b += 5;
		System.out.println("b = " + b);
		System.out.println("b = " + b++);
		System.out.println("b = " + ++b);
//		b = b + 1;
		System.out.println("b = " + b);

		//!!!!//
		int x = 3;
		x = x++;
		System.out.println(x);
		//!!!!//
		
		int x2 = -100;
		System.out.println(++x2);
		System.out.println(x2);
	}
	public static void p34_AssignOp() {
		int i = 8;
		i += (i = 4);
		int j = 8;
		j = j + (j = 4);
		int three = 3;
		three = -three++ * 5;
		System.out.println("three = " + three);
	}
	public static void p45_LogicOp() {
		//�������ڴ� �ǿ����ڷ� boolean Ÿ���� ���ϸ� ���� ��� ���� boolean�̴�
		//���������� ����
		// &	Logical AND
		// |	Logical OR
		// ^	Logical XOR(Exclusive OR)
		// !	Not
		//�������ڴ� ��Ʈ �����ڿ� ���� ȥ���ȴ�
		//��Ʈ �����ڴ� �ǿ����ڷ� ������ ���ϰ� ���� ����� ��Ʈ�� �ٲ� �����̴�
		// &,|,^,! �����ڴ� �ǿ����ڰ� boolean�̸� ��������, �����̸� ��Ʈ�����ڷ� �����
		
		//���Ǻ� ��������
		// && 	Conditinal AND
		// || 	Conditinal OR
		//���� ó��
		// &&�� &�� ����. ��, ���� �ǿ������� ���� true�� ���� ������ �ǿ������� ���� ó���Ѵ�.
		// ||�� |�� ����. ��, ���� �ǿ������� ���� false�� ���� ������ �ǿ������� ���� ó���Ѵ�.
		//�켱����
		// �������� &, |�� ���Ǻ� �������� &&, ||���� ����

		int a = 1, b = 2, c = 0;
		boolean f = false & (9 == (c = 9)); 
		// -> & �����ڴ� �º��� false�� �캯�� ���Ѵ�
		
		System.out.println(c);
	}
	public static void p58_BitOp() {
		//�ǿ����ڰ� ����!!
		
		int a = 0b0110_1010;
		int b = 0b1100_1101;
		
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println(Integer.toBinaryString(a ^ b));
		System.out.println(Integer.toBinaryString(~a));
		
		int sa = 0x55ff;
		int sb = 0x00ff;

		System.out.printf("a: %08x\n", sa);
		System.out.printf("b: %08x\n", sb);
		System.out.printf("a ^ b: %08x\n", sa ^ sb);
		System.out.printf("a ^ 0x0000: %08x\n", sa ^ 0x0000);
		System.out.printf("a ^ 0xffff: %08x\n", sa ^ 0xffff);
		System.out.printf("~a: %08x\n", ~sa);
		System.out.printf("0x1234abcd ^ 0x00ff00ff: %08x\n", 0x1234abcd ^ 0x00ff00ff);
	}
	public static void p65_Diff() {
		int num = 65671; // 65671 = 65536 +135
		System.out.printf("%d\n", (byte) num); 
			//��ȣ�� ������ 8��Ʈ, ù��Ʈ�� ��ȣ�� ó��
		System.out.printf("%d\n", num & 0xff); 
			//int��, ��ȣ�� ����
		System.out.println(Integer.toHexString((byte)num));
		System.out.println(Integer.toHexString(num & 0xff));
	}
	public static void p66_XorEx() {
		int move = 0;
		for (int i = 0; i < 10; i++)
			System.out.println(move ^= 1);
	}
	public static void p67_q() {
		int a = 0b10101010;
		for (int i = 0; i < 4; i++) {
			System.out.print("bits: " + Integer.bitCount(a) + ", ");
			System.out.println(Integer.toBinaryString(a &= a - 1));
		}
	}
	public static void p70_ShiftOp() {
		// >> << >>>
		// ��Ʈ �������� �ǿ����ڴ� ����, char (�Ǽ� �Ұ���)
		// ���� ��� Ÿ���� ���� �ǿ����ڸ� ����(�� �ּ� ����� int��)
		// byte << long -> int
		// >>, <<: ����� ��ȣ ����, >>>: ����� �׻� ���
		
		int a = -128;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(a));
			a >>>= 1;
		}
 	}
	public static void p85_���մ��Կ�����() {
		//���� �����ڿ� ���� �������� ���� (���� ������ �Ұ���)
		// a (op)= b  <==>  a = a (op) b
		//���� �ǿ����ڴ� �̸� �����(�ʱ�ȭ��) !����! ���� ��
		//������ �ǿ����ڴ� �� �ִ� � �ĵ� ����
	}
}
