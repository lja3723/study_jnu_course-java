package chapter05.executes;

import chapter05.classes.*;

public class UpcastingExecuteEx {
	void p05_define_inheritance() {
		//�θ� Ŭ����(Perent, super, base class)
		//�ڽ� Ŭ����(child, sub, derived class)
		
		//����� ���� ������ ���谡 �ִ� Ŭ������ �йи��� ���� ���� �뵵�θ�
		//����ؾߵ�, �ڵ� ������ ������ �Ǽ��� �� ��
	}
	public static void p07_Ex() {
		ColorPoint_first cp = new ColorPoint_first();
		cp.set(3, 4);
		cp.setColor("Red");
		cp.showColorPoint();
	}
	void p11_inheritanceInfo( ) {
		//���� ��� ���� X
		//��� Ƚ���� ������
		//��� Ŭ������ �ڵ����� java.lang.Object ��� ����
	}
	void p12_ViewAPI() {
		//https://docs.oracle.com/javase/10/docs/api/index.html
		//Eclipse������ Ȯ���ϰ� ���� Ŭ������ Ŀ���� ���� Shift + F2
		Object object;
		//�Ʒ� ���� ��� ��ġ
		//����Ѵ�, ��ӹ޴´�, Ȯ���Ѵ�(extend), Ȯ��ȴ�(extended)
	}
	void p16_protected() {
		//private ������
			//����Ŭ�������� private�� ����Ǹ� ����Ŭ���������� ���ٺҰ�
			//ĸ��ȭó�� �����ϴ� ���� ������ -> ��������!
		//protected
			//����� Ŭ�������Դ� ���� ���� ���
			//���� ��Ű�� ���� ��� Ŭ���������� ���� ���
	}
	public static void p20_Ex() {
		Student s = new Student();
		s.set();
	}
	public static void p24_constructor_rule() {
		//QnA 1
			//����Ŭ���� �����Ǹ� ����Ŭ������ ����Ŭ���� ������ ��� �����
		//QnA 2
			//����Ŭ���� �����ڰ� ���� ȣ��� �� ����Ŭ���� ������ ȣ���
		
		//����Ŭ���� ��ü�� ����Ŭ���� ��ü ���� ���� �Ұ���
			//����Ŭ���� ��ü �����Ƿ��� ����Ŭ���� ��ü�� �����Ǿ� ��
			//����Ŭ���� �����ڴ� ����Ŭ������ ��� �ȵ�
				//������ �̸� = Ŭ���� �̸�
		//������ ���� ����
			//���� -> ���� -> ���� ���� -> ���� ����
		
		//����Ŭ���� �����ڰ� �����ε� �� ���?
			//super() �̿��� ����Ŭ���� ������ �� �ϳ� ���� ����
			//super() ��� ���ϸ� �ڵ����� ����Ŭ���� �⺻������ ȣ����
		
		System.out.println("======c1======");
		C c1 = new C();
		System.out.println("======c1======");
		C c2 = new C(0);
	}
	public static void p34_Ex() {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showPoint();
	}
	void p36_isA_hasA() {
		//����Ŭ���� ��ü�� ����Ŭ���� ��ü�� is-A ����
		//����Ŭ������ ����� ��� ����
		//����Ŭ���� ��ü�� ����� �� ����
	}
}
