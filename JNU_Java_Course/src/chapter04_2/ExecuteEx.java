package chapter04_2;

import chapter04_2.classes.Triangle;

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
	}

	//32���������� �������!!!!
	//������ �������� �ް�!!
	//������ ���������� ���� (������! �ٸ��Ŵ� ������ �ʿ� X)
	//���� ���: 19�� 11�� ������ �޽����� ��������
}
