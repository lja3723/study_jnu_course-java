package chapter02;
import java.util.Scanner;

public class Ch02_IfStatement {
	public static void p03_Block() {
		int i = 10;
		{
			int j = 20; //��� �������� ��ȿ
		}
		//System.out.println(i * j);
		System.out.println(i * 20);
	}
	public static void p12_IfEx() {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int result = scan.nextInt();
		if (result >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		scan.close();
	}
	public static void p14_IfElseEx() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int x = sc.nextInt();
		
		System.out.print("3�� ���");
		if (x % 3 == 0)
			System.out.println("�Դϴ�");
		else
			System.out.println("�� �ƴմϴ�");
		
		sc.close();
	}
	public static void p17_MultiIfEx() {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90.0) // score�� 90.0 �̻��� ���
				grade = 'A';
			else if(score >= 80.0) // score�� 80.0 �̻��̸鼭 90.0 �̸��� ���
				grade = 'B';
			else if(score >= 70.0) // score�� 70.0 �̻��̸鼭 80.0 �̸��� ���
				grade = 'C';
			else if(score >= 60.0) // score�� 60.0 �̻��̸鼭 70.0 �̸��� ���
				grade = 'D';
			else // score�� 60.0 �̸��� ���
				grade = 'F';
			System.out.println("������ "+grade+"�Դϴ�");
		}
		a.close();
	}
	public static void p20_InnerIfEx() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �г� �Է�: ");
		int score = s.nextInt();
		int grade = s.nextInt();
		
		if (score >= 60) {
			if (grade == 4) {
				if (score >= 70)
					System.out.println("�հ�");
				else {
					System.out.println("���հ�");
				}
			}
			else
				System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
		
		//�� ���� ����
		int lim = grade == 4 ? 70 : 60;
		if (score >= lim)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
		s.close();
	}
}
