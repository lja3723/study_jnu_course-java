package chapter05.executes;

import chapter05.classes_composition.Comp01;
import chapter05.classes_composition.Date;
import chapter05.classes_composition.P07_Ex;
import chapter05.classes_composition.Person;
import chapter05.classes_composition.Time;

public class CompositionEx {
	void p03_composition() {
	//Ŭ���� ���� �� �������� Ÿ������ �̹� �����ϴ� �ٸ� Ŭ������ �����
		
	//B is composed of A
		//B�� A�� �����ȴ�.
		//A�� B�� ��ǰ ������ �Ѵ�.
		
	//Aggregation(����), Association(����) �̶�� ��
		//Ŭ������ �ٸ� Ŭ�������� ������
		//�� �̻��� Ŭ������ ���õȴ�
		
	//��ü�������α׷��ּ� ��Ӻ��� �ռ��� ���� ����
		
	}
	public static void p04_Ex() {
		Comp01.main(null);
		
	//Compute Ŭ������ �޼ҵ�
		//double add(double, double) 
		//double subtract(double, double) 
		//double multiply(double, double) 
		//double divide(double, double) 
	
		
	}
	void p06_forwarding() {
	//�ռ����� ���� Ŭ���� �޼ҵ� Ȱ���� Ŭ���� ����� ����
	//Ex:
		//Compute Ŭ������ add() �ۼ��� AddSubtract�� add()�� ���
		//���� Ŭ���� �޼ҵ� ȣ���� �ڽ��� �� ���� ����ϰ� ��
	}
	public static void p07_Ex() {
		P07_Ex.run();
		//�ռ� ��Ŀ��� ����� ������ �ٶ��� X
		//Compute Ŭ���� ����ڴ� .�� ���̾� ����� Ŭ���� �ʵ峪 �޼ҵ� ��� ����
	//Ex
		//Compute cp = new Compute();
		//int result = cp.as.add(10, 20);
		
		//�׷��� �̷� ����� ĸ��ȭ �����ϰ� ����ڿ��� Ŭ���� ���� ���� ������ ���� ����ϴ� ����
		//�ٶ������� X
		System.out.println("Hello worldq");
	}
	void p14_has_a_relation() {
	//Person�� BankAccount�� ����
		//���� ���ο��� is-a ���谡 �ƴ�
		//���� ����ϴ� ���� ������
		//has-a ����� �����ؾ� ��
	}
	public static void p20_Time() {
		Time.main(null);
	}
	public static void p22_Date() {
		Date.main(null);
	}
	public static void p24_Person() {
		Person.main(null);
	}
	void p29_IMPORTANT_Privacy_Leak() {
	//private ���� ������ �Ϻ����� �ʴ�
		//private�� ����� Ŭ���� �ʵ带 �׳� ��ȯ�ع�����
		//�ܺο��� ������ ������ �ִ�!!
		//private�� private�� �ƴϰ� �Ǵ� ���̴�.
	}
	void p31_object_copy() {
	//��ü�� �ʵ尪 ����: ����
		//��ü�� ������ �� ���°� ��ȭ ����
		//��ü ����: ���°� ���� ��ü�� ������ ������ ��ü�� �ϳ� �� �����ϴ� ��
		//��ü�� �ٽ� �����ϴ� �� -> ���� X
		
	//����� ���簡 �ƴϰ� ����(cloning) �̴�.		
	}
	void p32_shallow_deep_copy() {
	//���� ����
		//���� ��ü���������� �����Ѵ�
	//���� ����
		//��ü���������� ����Ű�� ��ü ������ ������ ������ �� ��ü�� �����
	}
	void p34_CopyConstructor() {
		//Ŭ������ ������ Ÿ���� �Ű����� ���� ������
		//�� üũ�� �ʿ�
		//Time, Date, Person ���� ������ ���� �ʿ�
	}
	void p38_String_Is_Immutable_Class() {
		//String��
		//��ü�� ���¸� ��ȯ��Ű�� �޼ҵ带 ������ ���� �ʴ´�.
		//�� String�� ����� �� ���� Ŭ����(Immutable Class)�̴�.
		
		//����: Mutable Class
		//Ŭ���� ��ü�� Mutator �޼ҵ峪 �Է� �޼ҵ� ���ԵǾ� �־�
		//��ü ���¸� ��ȭ��ų �� �ִ� Ŭ����(Data, Time ��)
		//�޼ҵ� ���� �� Mutable Object�� ���� ���������� ��ȯ�ؼ��� �ȵ�
		//�ݵ�� ���� ������ ����� ������ �������� ���纻 ��ü �����ϰ�
		//�̿� ���� ���������� ��ȯ�ؾ� �Ѵ�.
	}	
}
