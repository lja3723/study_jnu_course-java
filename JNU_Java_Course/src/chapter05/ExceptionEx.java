package chapter05;

import java.util.Scanner;

import chapter05.classes_exception.P25_Ex;
import chapter05.classes_exception.P26_Ex;

public class ExceptionEx {
	static void p() {}
	static void q() throws Exception {}
	
	public static void p00_Ex() {}
	void p04_callee�������() {
		//���ܴ� Callee�� Caller���� ���� ����� �����ϴ� ���
		//�޼ҵ� ��ȯ���� ������ �ſ� ���
		//���������� �۾��� ��ġ�� ��ȯ���� ��ȯ�� ���� ó�� ��� ����(��ȯ�� X)
		//���������� ��Ȳ�� �߻��� ��� ���ܸ� �߻����� ���� ó�� ��� �����
			//������ ��Ȳ�� �޼ҵ� ���ϰ�
			//���ܴ� ������ ��Ȳ�� ǥ���ϴ� ��ü
		
		//����ó���� 2���� ����
		//
	}
	public static void p08_Ex() {
		Scanner s = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ���:");
		int dividend = s.nextInt();
		System.out.println("������ ���� �Է��ϼ���:");
		int divide = s.nextInt();
		System.out.println("�����: " + (dividend / divide));
		s.close();
	}
	public static void p14_tryCatch() {
		try {
			q();
			// try ���
			// ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
		} catch (Exception e) {
			// catch ���
			// MyException ���ܰ� �߻����� �� ó���� ���
			// Exception Handler��� �θ�
		}
		// ������ �̾����� ����
	}
	public static void p15_TryCatchFinally() {
		try { // try ���
			q();
			// ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
		} catch (Exception e) { // catch ���		-> �������� catch�� �� �� ����
			// Exception Handler��� �θ� 
			// MyException ���ܰ� �߻����� �� ó���� ���
		} finally { // finally ���
			//���� �߻� ���ο� ������� ������ ����Ǵ� ����
			// finally ����� ���� ����
		}
		// ������ �̾����� ����

		//try-finally�� �����ϴ�
	}
	public static void p19_ExceptionEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = s.next();
		try {
			int a = Integer.parseInt(str);
			System.out.println("Input value: " + a);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred. ");
			System.out.println("Please, enter an integer!");
		}
		System.out.println("End of try-catch.");
		s.close();
	}
	void p23_TryCatchFinallyDiscription() {
	//try
		//���ܸ� �߻���Ű�� �޼ҵ带 ȣ���ϴ� ��
		//���ܿ� ���� ���� ���� �־ ��
	//catch
		//ȣ���� �޼ҵ尡 �߻���Ų ���ܸ� �޾� ó���ϴ� ��
		//==Exception Handler��� ��
		//���⿡���� ��ƾ� �� ���ܰ� ������ ���� �������� ǥ�õǾ�� ��
			//��ƾ� �� ���� Ÿ�� + ������
		//catch ��Ͽ����� �߻��� ���� �߻� ��Ȳ�� �м��ϱ� ����
		//getMessage(), printStackTrace()�� ȣ���ϱ⵵ ��
			//printStackTrace(): ���� �߻���Ȳ�� ������ �������
	//finally (p29)
	}
	public static void p25_Ex() {
		try {
			P25_Ex.a();
		} catch (Exception e) {
			System.out.println(e.getMessage() + "caught in main");
			e.printStackTrace();
		}
	}
	public static void p26_Ex() {
		P26_Ex.a();
	}
	
	public static void p31_Ex() {
		showUpTo5();
	}
	static void showUpTo5(){
		int count = 0;
		try{
			int k = 5; //���������� try������ ��� ����
			
			while(true){
				if(++count  > 5) 
					return;
				System.out.println((char)(64 + count));
			}
		} catch(Exception e){
		} finally {
			System.out.println( (count - 1) + " characters processed");
		}
	}

}
