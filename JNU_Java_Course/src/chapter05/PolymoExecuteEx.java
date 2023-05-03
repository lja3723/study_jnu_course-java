package chapter05;

import chapter05.classes_poly.*;
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
}
