package chapter05;

import chapter05.classes_poly.*;
import chapter05.classes_poly.shape.*;
import chapter05.classes_poly.super_ex.*;
import chapter05.classes_poly.hide_field.*;

import java.util.Scanner;

public class PolymoExecuteEx {
	void p00_Upcasting() {
		//upcasting
		//����Ŭ���� Ÿ���� ���������� ����Ŭ���� ��ü�� �����ϴ� ��
		//�ٸ���: ������ ����
		
		//��ĳ�������� ���ϴ°�/������ �ʴ°�
		//������ ���� ��
			//��ĳ���õǵ� ��ü�� �״�� ����: �Ÿ��� ��ü���� �ƹ� ���� X
		//���ϴ� ��
			//���� ����� ��ȭ: �������� Ÿ���� ������� ���� ����
			//���� Ÿ�� ��ü�� ���� Ÿ�� ��ü�� ��޹���
	}
	public static void p05_UpcastingEx() {
		Person p;
		Student s = new Student("������");
		p = s;
		
		System.out.println(p.name);
		
		//p.grade = "A";
		//p.department = "Computer Science";

		s.grade = "A";
		s.department = "Computer Science";
	}
	public static void p07_Downcasting() {
		//���� ��ü�� ���� ��ü�� �����ϴ� ��
		//����� �ٿ�ĳ���� ����
		
		Person p = new Student("name");
		Student s = (Student)p;
		s.grade = "grade1";
		System.out.println(s.grade);
		
		int input = new Scanner(System.in).nextInt();
		
				
		if (input == 0) {
			s = (Student)p;
		}
		
		if (input == 1) {
			s = (Student)(new Person("name"));
		}
		s.grade = "c+";
		

		System.out.println(s.grade);
	}
	public static void p12_Ex() {
		Animal.runEx2();
	}
	void p14_����������_����() {
		//������ �� ����
		//�޼ҵ� ȣ�� �� �����ڸ� �������ڿ� ����
		//�޼ҵ��� ��ȯ Ÿ�Կ� ��ȯ�� ����
		//����
			//throws�� ����Ǵ� ���� Ÿ�԰� throw�� �������� ����
			//catch ����� ���� Ÿ�԰� try��Ͽ��� �߻��ϴ� ����
		//�迭
			//�迭���������� �迭 ��ü�� ����
			//�迭 ��ä�� ������Ʈ(����)�� ��ü�� ����
		
		//1.
		Float f = 12.f; 
		Object o = new String("Korea");
		
		//�̿��� ���ô� ppt ���� ���� (16����������)
	}
	static void instanceofPrint(Person p) {
		//�⺻�� Ÿ���� �Ұ���
		//boolean b = 5 instanceof int;
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();

	}
	public static void p27_InstanceofEx() {
		System.out.print("new Student() ->\t"); instanceofPrint(new Student());
		System.out.print("new Researcher() ->\t"); instanceofPrint(new Researcher());
		System.out.print("new Professor() ->\t"); instanceofPrint(new Professor());
	}
	public static void p28_Ex() {
		Person p1 = new Professor();
		System.out.println(p1.getClass().getName());
		Person p2 = new Professor();
		System.out.println(p2.getClass().getName());
		
		//������(Polymorphism)
		//�� ���� p1�� �������̴�. ���� ���¸� ���� �� �ֱ� �����̴�.
	}
	void p34_overriding() {
		//�޼ҵ� ������
		//���� Ŭ������ ����� �޼ҵ带 ���� Ŭ�������� ��������
		//�������̽��� �����ϰ� �ۼ���
		// = ���� �������̽��� Ŭ������ ������ ����
		
		//���ε�
		//�޼ҵ� ȣ��� ����� �޼ҵ��� ����
		//������ �ÿ� ���� �̷����(Early Binding)
		//ex
		//Line line = new Line();
		//line.draw();
		
		//���� ���ε�
		//��/����Ŭ�������� �������̵��� �޼ҵ带 ��ĳ���õ�
		//����Ŭ���� Ÿ���� ���������� ȣ���ϸ� ���� ���ε��� �Ͼ
		//���ε��� �޼ҵ尡 ����� �� �̷����(Late Binding, Dynamic Binding)
		//��ü�� ������ �������� �巯����.
		//ex
		//Person p = new Student("������");	
	}
	public static void p38_Ex() {
		Shape shape;
		
		shape = new Shape();
		shape.draw();
		
		shape = new Line();
		shape.draw();
		
		shape = new Rect();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
	}
	void p41_overridingConstraint() {
		//1. �����ǵ� �޼���� ����Ŭ������ ������ �̸�&�������̽����� ��
		//2. ���� ��� ����Ŭ���� �޼ҵ庸�� ��ȭ �Ұ���
			// ���� ����: private > default > protected > public
		//3. Covariant Return Type: ����Ŭ���� �޼ҵ�� ���ų�  ������ ��ȯ Ÿ���̾�� ��
			//��ȯŸ���� ����Ŭ���� ����Ÿ�Ժ��� ������ �Ұ���
		//4. ����Ŭ������ �޼ҵ庸�� ������ ���ܳ� �߰� ���� ������ �Ұ���
		//5. static, private, final �޼ҵ� ������ �Ұ���
	}
	public static void p43_Ex() {
		Shape start, last, obj; //��� ���������� Shape�� ����
		//���������� ���� ����, ������ ��ũ�� ����Ʈ ����
		
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}			
	}
	public static void p49_superEx() {
		//super
		//����Ŭ���� ������ ȣ���ϴ� super()�� �ٸ�
		//super�� ���� ��ü���� ���� ��ü�� ����Ű�� Ű����
			//���� ��ü�� ������ü�� ������ �̸��� ��� ���� �� ������ ���� ���
		
		//�������� ������ ����ϴ°��� �߻�Ŭ����, �������̽��� �����Ѵ�.
		
		//super�� ���� �޼ҵ� ȣ���� �����Ϸ��� ���� ���ε���
		
		new S().m(); //super�� �ٷ� �Ѱ���� �ƴϰ� ���� ����� ����Ŭ������.
	}
	void p51_�ʵ�_���߱�() {
		//��,����Ŭ������ ���� �̸��� �ʵ带 ������ ���
		//�����ǰ� �̷����� ����
		//���� ��ü�� ������ �̸��� �ʵ� 2���� ���� ����
		
		//���� �ʵ带 ��ü�ϴ� ���� �ƴϰ� �����.
		//����Ŭ�������� �ʵ�� ���� ���� �ʵ尡 �켱��
		//���� �ʵ忡 �����Ϸ��� super Ű���� ����ؾ� ��
		//����Ŭ���� �ۿ����� ���� Ÿ���� �������� ����� ���� �ʵ忡 ����
		//���������ڰ� �Ȱ��� �����
		
		
	}
	public static void p55_Ex() {
		Super superClass = new Super();
		Sub subClass = new Sub();
		
		System.out.println(superClass.s);
		System.out.println(subClass.s);		
	}
	void p56_static�޼���_���߱�() {
		//������ �ȵ�
		//������ �Ǹ� ���������� ������ ����Ŭ������ �޼ҵ尡 ���������(���� ���ε�),
		//�������� ȣ���ڰ� ������ Ŭ������ �޼ҵ尡 �����(���� ���ε�)
		//����Ŭ���� �޼ҵ���� ����Ŭ���� �޼ҵ尡 �켱��
		
		//�̷� ������ �ǵ��� ������� ����(�����ڵ�, �򰥸�)
		
		//��Ģ
		//p41.�������̵� �������ǰ� ����(5����)
		//-> �Ϲ� �޼ҵ� �������̵� : ���� ���ε�(�������� ������� ��ü�� �޼��� ȣ��)
		//-> static �޼ҵ� �������̵�: ���� ���ε� (���������� ���� �޼��� ȣ��)
	}
	void p66_static�ʵ�_���߱�() {
		//��Ӱ��迡 ���� �� ������ü�� ����Ŭ������ static �ʵ忡 ������ ����
		//���������ڴ� �ν��Ͻ� �ʵ�� �����ϰ� static �ʵ忡�� �����
		//static �ʵ�� ��ӵȴ�
			//is-A ����� �ƴ϶� has-A ���
		//�ʵ� ���߱�� ����ϳ�?
	}
	void p71_��ü�迭() {
		//������ �迭�� ���� ���ɼ�
		//�迭 Ÿ���� �ٸ� ��� �迭�� �迭�� ���� �Ұ���
		//ex
		int[] intArray = new int[5];
		float[] floatArray = new float[5];
		//floatArray = intArray;
		//intArray = (int[])floatArray; //ĳ���õ� �Ұ���
		
		//��ü�迭 �迭������ Upcasting
		//���� Ÿ���� �迭 ���ҿ��� ���� Ÿ���� ��ü ���� ����
		//ex
		Object[] objectArr = new Object[3];
		objectArr[0] = new java.awt.Point();
		objectArr[1] = new int[2][3];
		objectArr[2] = objectArr;
		
		//��ü �迭�� Upcasting
		//��ü �迭�� Ÿ���� �ٸ� �迭���� ������ �����ϴ�
		//��ü �迭�� ��� ū Ÿ���� �迭�� ���� Ÿ���� �迭�� ������ �� �ְ� ����ȯ�� ����
		//ex
		java.awt.Button[] buttonArr = new java.awt.Button[5];
		Object[] obj1 = new java.awt.Button[10];
		Object[] obj2 = buttonArr;
		buttonArr = (java.awt.Button[])obj1;
	}	
	void p76_ArrayStoreException() {
		//�߸��� ������ ������ ���� ������
		//Bird[] bird = new Bird[10];
		//Animal[] animal = bird;
		//animal[0] = new Cock();		
		//animal[1] = new Duck();		
		//animal[2] = new Fish();	// INVALID
		//animal[3] = new Trout();	// INVALID
		
		//���ο� �迭 ��ü�� ������ �Ŀ��� ����
		//animal = new Fish[10]; // �ٸ� �迭 ��ü ����
		//animal[0] = new Fish();
		//animal[1] = new Trout();
	}
	void p77_ArrayIsObject() {
		//Object�� ��� �޼ҵ� ȣ�� ����
		//Animal[] animals = new Animal[10];
		//Object o = animals;
		//System.out.println(o.getClass().getName());
	}
}
