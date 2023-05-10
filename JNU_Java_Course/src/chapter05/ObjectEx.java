package chapter05;

import chapter05.classes_object.*;

public class ObjectEx {
	public static void p00_Ex() {}
	void p02_object_class() {
		//java.lang ��Ű���� ����
		//��� Ŭ������ ���� Ŭ����
		
		//�޼ҵ�
		//protected Object clone()
		//public boolean equals(Object obj)
		//Class getClass()
		//int hashCode()	:map�� ���� �ؽ��ڵ带 �����.
		//String toString()
		
		//������ ���α׷��ֽ� �浹�� �����ϱ� ����, ������ ����ȭ ���� ���
		//�� �����尡 ������̸� �ٸ� ������� ����� ��
		//�� �����尡 ���ÿ� ���ϴ°�: ����ȭ
		//void notify()
		//void notifyAll()
		//void wait()
	}
	public static void p06_CompareObject() {
	//==
		//�� ��ü�� ���ϼ�(Identity)�� ��
		//�� ���������� ������ ��ü�� ���ϴ°�?
	//equals()
		//�� ��ü�� ���(Equlity)�� ��
		//�� ��ü�� �ʵ尪�� �����Ѱ�?
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
	//Object.equals()
		//==ó�� ���ϼ��� �˻���
		//���������� ������ ���ϼ��� �˻��ϰ� ��
		//�ڹ� ǥ�� ���̺귯�� Ŭ���� �߿����� Stringó�� ��� �˻縦 �ϴ� �͵� �ְ�
		//�����Ǹ� ������ ���ϼ��� �˻��ϴ� �͵� ����
	}
	public static void p09_StringEquals() {
		//String Ŭ������ equals()�� ��� �˻�� ��������
		//==�� ����� ���ڿ� ���ϼ� �˻�
		
		String str1 = new String("Korea");
		String str2 = str1;
		System.out.println(str1 == str2); //true
		
		str2 = new String("Korea");
		System.out.println(str1 == str2); //false (�ٸ� ��ü)
		
		Person a = new Person(1, "Kim");
		Person b = new Person(1, "Kim");
		System.out.println(a.equals(b));
	}
	public static void p15_Ex() {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
	}
	public static void p24_Problem() {
		Object a = new WrongPoint(3, 4);
		Object b = new WrongPoint(3, 4);
		System.out.println(a.equals(b));
		//equals�� �����ε��Ǿ����Ƿ� ���� ���ε� ���� X
		//Object�� equals�� ȣ��ȴ�.
	}
	public static void p26_CompleteEquals() {
		Triangle t = new Triangle(2.0, 3.0);
		Triangle t2 = new Triangle(2.0, 3.0);
		System.out.println(t.equals(t2));
	}
}
