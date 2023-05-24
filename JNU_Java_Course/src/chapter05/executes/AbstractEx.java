package chapter05.executes;

import chapter05.classes_abstract.*;

public class AbstractEx {
	void p01_Abstract() {
	//Abstract : ���
	//Abstraction(�߻�ȭ)
		//����� �߿��� �κи� �߷� �����ϰ� �����ϱ� ���� ����
		//Information Hiding: ���� ����, ���� ���� ���� X
		//Ŭ���� ����� ���븸 �߷� ǥ��
		
	//Abstract Class
		//�������� ���� 0�� �̻��� �߻� �޼ҵ� ������ Ŭ����
		//������: abstract Ű����� ���ǵ�
		//�ϼ����� �ʾ� ��ü ���� �Ұ�
		//����Ŭ������ ǥ�� �����ϴ� ���� ����(����� Ŭ����)
		
		//��Ӱ� �޼ҵ� �����Ǹ� ������ ��
		//�߻�Ŭ���� ���������ڷ� private, final �� ���ǹ�, �Ұ���
		//���� public, protected, default�� ���
		
		//�߻�Ŭ���� == Ÿ��
			//AbstractClass ac;
		//Upcasting ������� ����, �������� ����
		//�޼ҵ� �Ű����� Ÿ�Կ��� �����
		//�迭Ÿ�� ����, �迭 ��ü ������ ����		
	}
	void p06_AbstractMethod() {
	//����Ǿ����� �������� ����
		//�������̵��� ������
		//��ü�� ����Ŭ�������� ����
		//static�� ������ �Ұ��� -> ���� X
		
	//����
		//����� abstract ǥ��
		//��ü ���� ���� �����ݷ��� ����
		//public abstract int getValue();
		
	//Ư¡
		//�߻�Ŭ���������� ���� ����
		//���ϼ� ���� ����������: private, final
		//��ü�� ���� �� ����
		//����Ŭ�������� �߻�޼ҵ� ���� == �������̵�
		
	//�߻�Ŭ���� �޼ҵ� 2���� ����
		//���� �Ϸ�� �޼ҵ�
		//�߻� �޼ҵ�
	}
	void p09_�߻�Ŭ����Ư¡() {
	//�߻�Ŭ���� ����
		//1. �߻� �޼ҵ尡 1���� �ִ� Ŭ����
			//�߻�޼ҵ带 1���� ���Խñ�� �ݵ�� Ŭ���� �� abstract ���� �ʿ�
		//2. �߻� �޼ҵ� ��� Ŭ���� �տ� abstract ���� Ŭ����
		
	//����
		//Ű���� abstract ����� ����
		//�������� ���� �޼ҵ忡 abstract ����
		//�޼ҵ� �� �ϳ��� �߻�޼ҵ�� Ŭ������ abstract �ٿ��� ��
		
	}
	void p13_�߻�Ŭ������_���() {
	//�߻�Ŭ���� ����� �ڽ� Ŭ���� Ư¡
		//�߻�ũ������ ��� �����ϸ� �� Ŭ������ ��ü�� Ŭ������ ��
		//�߻�޼ҵ带 �ϳ��� �������� ������ ������ �߻�Ŭ����
			//�ڽ�Ŭ������ abstract ���� �ʿ�
	
		//�߻�Ŭ������ �����ڴ� ȣ�� �Ұ��� (�ڸ��� - �߻�Ŭ������ ��ü���� �Ұ�)
		
		
	}
	void p16_�߻�Ŭ����_�뵵() {
	//����� ���� �и�
		//�߻� Ŭ���� ������ ���� Ŭ������ �ý��� ����
		//�ڽ� Ŭ������ ���Ѿ��� ǥ���� ����(with �߻� �޼ҵ�)
		//�� ���� Ŭ�������� ��ü�� ���� ����
		//���� Ŭ�������� ������ �°� �߻�Ŭ���� ������
		//������ ��� ���踦 ���� Ŭ���� �йи��� ���� Ŭ������ ����		
	}
	public static void p17_Ex() {
		Calculator gc = new GoodCalc();
		
		//pre-condition : �޼ҵ尡 ���������� �����ϱ� ���� ���Ѿ��� ����
		//���� �޼ҵ� ���� �ּ����� ǥ���Ѵ�
		//��� ����: �Ķ���� Ÿ�Կ� ��� ������ ǥ���ϱⰡ ��Ʊ� ����
		//post-condition : -> �ּ����θ� ǥ�� ����
		//invariant : �޼ҵ尡 ����Ǵ� ���� ������ �����Ǿ�� �ϴ� ����
		
		
		System.out.println(gc.add(5, 12));
		System.out.println(gc.subtract(19, 8));
		System.out.println(gc.average(new int[] {5, 2, -3, 8}));
		
	}
	void p19_�߻�Ŭ������_������() {
		//�߻�Ŭ���� �����ڸ� ���� ȣ���� �Ұ����ϴ�.
		//������ �߻� Ŭ������ �����ڸ� ���� �� ����
		
		//����Ŭ���� �����ڰ� super()�� �̿��� ȣ���ϰ� ��
		//�߻�Ŭ���� �����ڵ� �ڽ��� ����Ŭ���� �����ڸ� ȣ�� ����
	}
	public static void p20_AbstractEx() {
	//Solid			: ��ü - ���� ������ �Ӽ� ����
		//Sphere	: ��
		//Cuboid	: ������ü
		//Cylinder	: ����	
		Solid s = new Sphere(2.0);
		s.show();
		new Cuboid(2.0, 3.0, 4.0).show();
		new Cylinder(2.0, 3.0).show();
	}
	public static void p24_Ex() {
	//Figure: ����
		//Triangle: �̵�ﰢ����
		//Square: �簢��
		//RightTriangle: �����ﰢ��
		FigureTest.main(null);
	}
	void p31_protect_�����ǹ�() {
		//����Ŭ������ �ƴ� Ŭ�������Դ� default�� ���� �ǹ�
		//���� Ŭ�������Դ� public �ǹ�
		
		//�߻�Ŭ������ �ʵ� ����
		//public abstract class Figure {
		//    protected String name = "Figure";
		//    protected char character = '-'; // �׸� �� ����� �⺻ ����
		//}
		
		//����Ŭ�������� �ʵ尪 �ٽ� ����		
	}
	void p33_�߻�Ŭ����_3����_�޼ҵ�() {
	//abstrct
		//�ڽ�Ŭ������ �ǹ������� �����ؾ� ��
		
	//protected
		//���������� �������̵� ����
		
	//public
		//������ �ϰ�� �޼ҵ�
		//�׳� ��븸 ����
		
	//protected ����� ����
		//���� Ŭ������ protected ����� ������ �� �ִ� ���� �ſ� ������ ����
		//��� protected ����� �ϴ���
		//�����ϰ� �ִ� ��ü���� ���� ��ü������ ������Դ� ���� �Ұ�
		//�����ϰ� �ִ� ��ü���� ���� Ÿ���� ���������δ� ���� �Ұ�
		
		//����Ŭ������ ����Ŭ������ ���� �ٸ� ��Ű���� ���� �����
		
	}
	void p38_templete_method() {
		//������ ������ �ϳ�
		
		//�߻�Ŭ�������� ū �帧 ����
		//���� Ŭ�������� ��ü���� ������ ����
		
		//Ư���� ������ ����� �˾ƾ� ���α׷��� ������ ����
		//�߻�޼ҵ�� ���ĸ� ������ ���� ����Ŭ������ �Ѱ� ������
		
		//����Ŭ������ ����Ǵ� �κ��� ���� ��� ��� ����Ŭ������ ����ø�
		//�ڵ��� �ߺ��� ����
		
	//���ø� �޼ҵ� ����
		//1. ���� Ŭ������ ���ø� ������ �ϴ� �޼ҵ� ����
			//���ø� �޼ҵ尡 �߻� �޼ҵ� ȣ��
			//���ø� �޼ҵ� ���� �߻� �޼ҵ尡 ��� ȣ��Ǵ��� ������ ������ ��
		//2. ���� Ŭ������ �߻� �޼ҵ� ������ �ϼ�
			//����Ŭ�������� ������ Ư�� ���� ���� �ٸ� ���� �̷����
			//����Ŭ������ � ���� �������� ó�� ū �帧�� ����Ŭ������ �����Ѵ�� �̷���
		
	//�߻� Ŭ���� ����
		//���ø� �޼ҵ� ����
		//���ø� �޼ҵ忡�� ����ϴ� �߻� �޼ҵ� ����
		//������ TemplateClass Ŭ������ ���� �ش�
	//��ü Ŭ���� ����
		//�߻�Ŭ�������� ����� �߻�޼ҵ带 �������� ����
		
	//�߻� Ŭ���� �ۼ�
		//�ߺ� ���ϱ� ���� ����Ŭ������ ���� �κ��� ���� Ŭ������ ���� �÷� �ۼ�
		//��ü�� ������ �����Ǿ�� ���� ������ �޼ҵ�� ���� Ŭ�������� �߻� �޼ҵ� ���·� ����
		
		//���ø� �޼ҵ� �ۼ�
		//�߻�Ŭ������ ��ġ�ؾ� ��
		//�߻� �޼ҵ� ȣ���ϴ� ȣ�⹮ ������ �߻�Ŭ������ ����Ŭ������ �մ� ���� ������ ��
		//�����ǵǾ�� �ȵǹǷ� final�� ������ ������
		//���ø� �޼ҵ带 ����� Ŭ�������� ȣ���� �����ϰ� ��
	}	
	public static void p46_TemplateMethodEx() {
		long time;
		time = new Loop().templateMethod();
		System.out.println("Loop: " + time);
		time = new Recursion().templateMethod();
		System.out.println("Recursion: " + time);
	}
	









}