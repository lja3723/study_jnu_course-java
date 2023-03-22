package chapter02;

import java.util.Scanner;

public class Ch02_Switch {
	// if-else�� ������
	public static void p34_Ex() {
		//switch(exp)
		//exp�� Ÿ���� long�� ������ ����Ÿ��, ���ڿ� Ÿ��
		//�Ǽ�, �Ҹ� �Ұ���
		//case exp:
		//exp�� Ÿ���� ����, ���ڿ� ���ͷ�, ������� ��
		Scanner s = new Scanner(System.in);

		char grade;
		System.out.print("������ �Է�(0~100): ");
		int score = s.nextInt();
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("������ " + grade + " �Դϴ�");
		s.close();
	}
	public static void p40_Ex() {
		Scanner s = new Scanner(System.in);

		
		System.out.print("Ŀ�� �޴� �Է�(����������, īǪġ��, ī���): ");
		String str = s.next();
		switch (str) {
		case "����������":
			break;
		case "īǪġ��":
			break;
		case "ī���":
			break;
		default:
			break;
		}
		
		s.close();
	}
}
