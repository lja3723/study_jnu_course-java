package chapter04_2;

import java.util.Scanner;

import chapter04_2.classes.*;

class Sample {
	public int a;
	private int b;
	int c;
	protected int d;
	
	void defaultTestFunc() {
		System.out.println("Hello");
	}
}
class SampleFixed {
	public int a;
	private int b;
	int c;
	
	void defaultTestFunc() {
		System.out.println("Hello");
	}
	public int getB() {
		return b;
	}
	public void setB(int value) {
		b = value;
	}
}

public class ExecuteEx {
	void p01_delete() {
		/*
		 * ��ü �Ҹ�
		 * :new�� ���� ������ ��ü �޸𸮸� jvm�� �����ִ� ��
		 * �ڹٴ� delete ����� ���� (�ڵ� ����)
		 * ������: �ڽ��� ����Ű�� ���۷����� ���� ��ü (�޸� ����)
		 * ������ �÷���: JVM ������ �÷��Ͱ� �ڵ����� ������ ������ �޸� ���� ����
		 */
	}
	void p06_occurGarbageEx() {
		String a = new String("a"); // <-������
		String b = new String("b"); 
		String c = new String("c");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
	void p07_GarbageCollection() {
		//�ڹٿ��� �������� �ڵ����� ȸ���ϴ� ����
		//������ �÷��� �����带 ���� �ڵ����� �������� ȸ����
		//������ �� ���� �ִ�. ���� �ڵ带 ����.
		System.gc();
	}
	void p10_classFile() {
		//Ȯ���ڰ� .class�� ����
		//.java�� �ҽ������� �������ϸ� ���ܳ�
	}
	void p11_package() {
		//������ Ŭ���� ������ �����ϴ� ���͸�
	}
	void p12_accessSpecfier() {
		//private	:�����
		//default	:�⺻��
		//protected	:��ӹ��� �ڼ� Ŭ���������� public, �ܴ̿� private
		//public	:���� ����
		
		//���� ����			Ŭ���� ����		��Ű�� ����		��� ����
		//private		O			X			X
		//default		O			O			X
		//protected		O			O			X
		//public		O			O			O
	}
	void p13_classAccess() {
		//public class
		//:��� ��Ű������ ���� ����
		
		//default class
		//���� ��Ű���� Ŭ�������� ���� ���
		
		//private class �� ���� �Ұ�
	}
	void p17_memberAccess() {
		//private: 
		//	Ŭ���� �������� ���� ���
		//default:
		//	���� ��Ű�� �������� public
		//	�� �ܿ��� private
		//protected:
		//	���� ��Ű�� �� ��� Ŭ�������� ���� ���
		//	��� ���� �ڼ� Ŭ���������� �ٸ� ��Ű���� ���ص� ���� ���
		//public:
		//	��� ���
	}
	public static void p23_Ex() {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; => �׼��� ���� �߻�
		aClass.c = 10; //�̰Ŵ� ���� ��Ű���� ���� �Ǵ±���...
		aClass.defaultTestFunc();//�̷��Ե� �ǳ�
		aClass.d = 15;
	}
	public static void p25_Ex() {
		//���� ������ �ҽ�
		SampleFixed aClass = new SampleFixed();
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10; //�̰Ŵ� ���� ��Ű���� ���� �Ǵ±���...
	}
	void p26_Encapsulation() {
		/*	���� �ǹ��� ĸ��ȭ
		 * 		�ʵ�� �ʵ带 ����ϴ� �޼ҵ带 ������ Ŭ���� ���� �δ� ��
		 * ���� �ǹ��� ĸ��ȭ
		 * 		- Ŭ���� �ʵ带 private�� ����, �ٸ� Ŭ������ ���� ���� ����
		 * 		- �ʵ� ����ϴ� �޼ҵ带 public���� ����, �޼ҵ� ���� ����������
		 * 		�ʵ� �����ϴ� ��
		 */
		//ĸ��ȭ ����: Ŭ������ �����ϴ� API �����ϸ鼭 ���α׷� �����ϰų� ��� �߰� ����
	}
	void p27_set_get_method() {
		/* ���� �޼ҵ�: �ʵ忡 ������
		 *		public getField()
		 * ���� �޼ҵ�: �ʵ带 ������
		 * 		public setField() 
		 */
	}
	public static void p30_EnCapsuleEx() {
		Triangle t = new Triangle(2.5, 2.0);
		System.out.println("Height = " + t.getHeight());
		System.out.println("Width = " + t.getWidth());
		System.out.println("Area = " + t.area());
		
		ExecuteEx e = new ExecuteEx();
	}	
	public static void midterm_problem00() {
		int count = 0;
		
		OUTER:
		for (int i = 1; i < 5; i++) {
			INNER:
			for (int j = 1; j < 4; j++) {
				if (j % 2 == 0)
					continue INNER;
				count += j;
				if (i > 2)
					break;
			}
		}
		System.out.println(count);
	}
	
	static private int static_field;
	public static void p34_static() {
		//static: �ʵ� or �޼��� �Ҽ��� Ŭ������ ����
		//��ü�� �������̶�� �ǹ̷� �ؼ� ����
		
		//non-static:
		//	��ü���� ���� ����(���ΰ���)
		//static:
		//	Ŭ������ 1���� ����(��������)
		
		//Ŭ���� �ۼ��ϸ� ��ũ�� �����
		//���α׷��� ����Ǹ� Ŭ������ ���θ޸𸮿� �ε�(Ŭ���� �δ�)
		//new�� �����ϸ� Ŭ�����κ��� ��ü�� ���Ӱ� ������
		
		//non-static -> static O ���� ����
		//static -> non-static X ���� �Ұ�
		//static�� this Ű���� ��� �Ұ�
		
		//���ٹ� 1:
		ExecuteEx.static_field = 0;
		//���ٹ� 2: (�����)
		ExecuteEx obj = new ExecuteEx();
		obj.static_field = 0;
	}
	public static void p42_Ex() {
		Scanner s = new Scanner(System.in);
		System.out.println("ȯ��(1�޷� ����?)$ ");
		double rate = s.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("100������ $" + CurrencyConverter.toDollar(1_000_000) + "�Դϴ�.");
		System.out.println("$100�� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		s.close();
	}
	void p44_variable_type() {
		//��ȿ���� ���� �з�:
			//Ŭ���� ����
			//�޼ҵ� ����
			//���� ����(���)
		//������ Ÿ�Կ� ���� �з�:
			//������
			//������
		//��ü ���� �ÿ� ���ԵǴ°��� ���� �з�:
			//�ʵ�(��ü �ʵ�, ��ü ����)
			//Ŭ���� �ʵ�(���� �ʵ� (static))
		
		//�ʵ�
			//Ŭ�����κ��� �����Ǵ� ��ü���� ���ԵǴ� ����
			//static�� �Ⱥ���
			//�ٸ��̸�: Field, Instance Variable, Property, Attribute
		
		//Ŭ���� �ʵ�
			//ũ�����κ��� ��ü �����ɶ� �����Ǵ� ��ü�� ���Ե��� �ʴ� ����
			//static ���� (=���� �ʵ��� ��)
			//��ü�� ��� ���� Ŭ������ �Ѱ��� ����, ��� ��ü�� ���� ������
			//��ü �������� �ʾƵ� ��밡��
	}
	public static void p47_Ex() {
		p47_Triangle[] triangle = new p47_Triangle[3];
		triangle[0] = new p47_Triangle(2.5, 2.0);
		triangle[1] = new p47_Triangle(3.5, 4.0);
		triangle[2] = new p47_Triangle(2.0, 1.0);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Serial Number: " + triangle[i].getSerialNo());
			System.out.println(", Area: " + triangle[i].area());
		}
	}
	public static void p51_InitField() {
		//1: �ʱ�ȭ���� ������ Ÿ���� �⺻������ �ڵ� �ʱ�ȭ
		//2: �ʵ� ���𹮿��� �ʱ�ȭ
		//3: �����ڸ� ���� �� �������� �ʱ�ȭ
		//4: �ʱ�ȭ ���(Initialization Block)�� �̿��� �ʱ�ȭ
		//5: Ŭ���� �ʵ� �ʱ�ȭ, ���� �ʱ�ȭ ���(Static Initialization Block) 
		
		FieldInitEx ex = new FieldInitEx(1.0, 1);
	}
	public static void p54_FieldInitTimeEx() {
		FieldInitTimeEx ex = new FieldInitTimeEx();
	}
	public static void p59_Ex() {
		System.out.println(FieldInitEx.specialValue);
	}
	public static void p61_FieldInitTimeEx() {
		System.out.println("=====��ü 1 ����=====");
		FieldInitTimeEx ex1 = new FieldInitTimeEx();
		System.out.println("=====��ü 2 ����=====");
		FieldInitTimeEx ex2 = new FieldInitTimeEx();
	}
	void p63_static_import() {
		//ppt ����
	}
	void p66_final_class_field() {
		//final class:
			//Ŭ���� �տ� ����
			//�� �̻� Ŭ���� ����� �Ұ������� ǥ��
		
		//final field:
			//�ʱ�ȭ ���:
			//1: ���� ����� ���ÿ� �ʱ�ȭ
			//2: �ʱ�ȭ ������� �ʱ�ȭ:
			//3: �����ڿ��� �ʱ�ȭ
	}
	void p70_black_final_field() {
		//������ �� �� ���� ���ϰ� ��� �� final �ʵ�
		//�ʱ�ȭ ��� or �����ڿ��� �� �����ؾ� ��
	}
	public void p75_toString() {
		//Object Ŭ������ ����, � Ŭ���������� �ڵ����� ���Ե�
		//��ü�� String ���·� ��ȯ
		//�⺻��: Ŭ�����̸�@��ü -> hash code�� 16���� ǥ��
		String s = getClass().getName() + '@' + Integer.toHexString(hashCode());
		System.out.println(s);
		
		//������ ������
		//pulic String toString(); ���� �����ϸ� ��
		
		//println �޼���� toString()�� �ڵ����� �����Ѵ�.
	}
	public static void p79_Ex() {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "�Դϴ�.");
		
		//toString ���ǻ���
			//��ü�� String���·� ���������� �ٲ���� Ư���� ��찡 �ƴϸ�
			//toString�� ���� ȣ������ �� ��
			//toString �����ǽ� println()�� ������ �ʿ� ����
			//return String.format("%d", this.field); ���� ����� ����
	}
	
	
	
	
	
	
	
	
}
