package chapter05.executes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chapter05.classes_interface.*;

public class InterfaceEx {
	public static void p00_Ex() {
		System.out.println("Hello world!");
	}
	void p49_Interface() {
	//�������̽� = ���赵
		//Ŭ������ ���� �޼ҵ� ǥ��
		//Ŭ������ ������ ����� ������ ǥ��
	//�ڹ�ǥ�� ���̺귯��Ŭ���� ��� ���� ���� Ŭ���� ��� �ľ� �ʿ�
		//Ŭ������ �������̽� ���� ��� �ľ�
	//Ŭ������ �������� ����� �޼ҵ� ����� �߽����� ����
		//==���==����==�޼ҵ�==�������̽�
		
	//�������̽� == ���
		//What�� ���� �������, How�� ���ʿ�
	
	//Ŭ���� ����� �������̽��� implements�� �Ա� ǥ��
		
	//�������̽� ���: interface�� ����
	//�������̽� ��ü: ������ ���� X/��ü ���� �޼ҵ� ����
		
	//�������̽� �޼ҵ�� �⺻������ public abstract
		//Ű���� �����ص� �ڵ� �����
		//���������� ���� �� �ڵ����� public ����(default x)
		
		
	}
	public static void p56_Ex() {
		StudentA s1 = new StudentA(1, "Kim", 95);
		StudentA s2 = new StudentA(2, "Lee", 97);
		if(s1.greater(s2)){
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
	}
	void p60_Comparable() {
		//��ü ũ�� �� ���� Java ǥ�� ���
		//java.lang ��Ű���� �����ִ� �������̽�
		
		//<T>: �Ű������� Ÿ��
		//public interface Comparable<T> {
		//	public int compareTo(T t);
		//}
		
		//�޼ҵ��: compareTo()
		//this�� t���� ũ�� ���, ������ 0, ������ ������ ��ȯ�� ���� �ּ����� ���
		
	//��� ����
		//�ڹ��� ǥ���� ������ ����
		//Comparable�� ���� compareTo()�� �������� �� �� ����
		
	//����
		//Comparable<T> ��� Comparable�� ��밡���ϳ�
		//�̶��� compareTo(Object)�� �����ؾ� �ϰ� �ݵ�� ���ڸ� Casting�ؾ� ��
		
	}
	public static void p62_Ex() {
		Student s1 = new Student(1, "Kim", 95);
		Student s2 = new Student(2, "Lee", 97);
		if(s1.compareTo(s2) >= 0){
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
	}
	public static void p64_Ex() {
		Player p1 = new Player(21, "Kim");
		Player p2 = new Player(17, "Choi");
		if(p1.compareTo(p2) <= 0)
			System.out.println(p1 + " <= " + p2);
		else
			System.out.println(p2 + " <= " + p1);
	}
	public static void p64_Ex2() {
		Player[] p = new Player[] {
			new Player(40, "name"),
			new Player(20, "byte"),
			new Player(25, "quite"),
			new Player(30, "salt"),
			new Player(25, "boss"),
			new Player(27, "lose"),
			new Player(15, "toucha"),
			new Player(20, "mirah")
		};
		List<Player> li = Arrays.asList(p);
		Collections.sort(li);
		p = (Player[])li.toArray();
		for (Player e : p) {
			System.out.println(e);
		}
		
		
	}
	void p67_implInterfaceAtClass() {
		//�������̽��� ���ǵ� �߻�޼ҵ� ��ü�� ��� �ϼ��� Ŭ���� �ۼ��Ѵ�
		//implements Ű���� ���
		//���� �������̽� ���ÿ� ���� ����
	}
	public static void p68_Ex() {
		  SamsungPhone phone = new SamsungPhone();
		  phone.printLogo();
		  phone.sendCall();
		  phone.receiveCall();
		  phone.flash();
	}
	void p87_variableInInterface() {
		//�������̽��� ���� ���� ����
		//�������̽� ������ �⺻������ public static final
		//private-protected:����
		//�����Ϸ��� �ڵ����� �߰���
		//��ä ���̵� ���� ����
	}
	void p91_InterfaceDefaultMethod() {
	//�̹� �����ϴ� �������̽��� �� �޼ҵ� �߰��ϸ� �������̽� ������ ��� Ŭ������
	//��� �ٽ� �ۼ��ؾߵ�
	
	//�߰��� �ʿ��� �޼ҵ带 default �޼ҵ� ���·� �ΰ��� �� ����
	//����Ŭ������ ���� �ʿ� X
		
	//default �޼ҵ�
		//������ �ϼ��� �޼ҵ�
		//default�� ���� �޼ҵ�
		//�������̽��� ��ü�� �Ϻ�� ��ü�� �޼ҵ�
		//�������̽� �����ϴ� � Ŭ�������� ��ӵǴ� �޼ҵ�
		//�ʿ信 ���� �������̽� ���� Ŭ�������� �����ǵ� ����
		
		//��ü ������ ����
		//��ü ������ default Ű���� �־�ߵ�(������ ����)
		//public�̴�
		//private, protected�� ����
		
		//�������� Ű���� default�ʹ� �ƹ��� ������ ����!!!
		
	//default �޼ҵ忡�� �Ұ����� ��
		//1. static (����Ŭ���� ��ü���� ��� �Ұ�������)
		//2. final		(�����ǰ� �����ؾߵǹǷ� �Ұ���)
		//3. abstract	(�����ǰ� �ǹ� �ƴ� �����̹Ƿ� �Ұ���)		
	}
	void p97_Interface_Static() {
	//�������̽� �����ϴ� Ŭ������ ��ü �������� �ʰ� ��� ������ �޼���
		//Local use�� �޼ҵ������ ȣ��
		//�������̽� �ۿ��� ������ �� �������̽��� ���
		
	//Interface Static �޼ҵ�� �������̽� �����ϴ� Ŭ������ ��ӵ��� ����
		//Ŭ�������� ���ǵ� static �޼ҵ�� Ŭ������ ����� �ڼ� Ŭ������ ��ӵ�
		
	//�⺻������ public, private�� protected����ϸ� ����
	}
	void p100_Interface_private() {
	//�������̽��� static, default �޼ҵ� �������� ���� �� �ִ� ������ �޼ҵ�
		//��ü�� �����ߵ�
		//abstract X
		//static / non-static ��� ����
		//�������̽��� ������ Local use �뵵��
		//�������̽� �� �ٸ� static/default/private/abstract ȣ�Ⱑ��
	}
	void p104_Abstract_vs_Interface() {
	//������
		//��ü ���� �Ұ�
		//��� ���� ���� Ŭ�����θ� ���
		//������ ���� ���� ����
		
	//������
		//�߻�Ŭ���� - ����
			//����Ŭ�������� �������� �ʿ�� �ϴ� ����� �߻�Ŭ�������� �ϼ�
			//����Ŭ�������� �����ؾ߸� �ϴ� ����� �߻�޼ҵ�� ����
		//�߻�Ŭ���� - ����
			//�߻�޼ҵ�� �����Ϸ� �޼ҵ带 ��� ����
			//��ü �ʵ�, ��� ����
		
		//�������̽� - ����
			//��ü ��� �԰�ȭ�� �����ϴ� ǥ�� ����
			//�������̽� �����ϴ� ����Ŭ���� ��Ȳ�� ���� ��� �߻�Ŭ���� �����Ǹ�
			//�����ڿ��� ����
		//�������̽� - ����
			//��ü �ʵ� ������
			//abstract, default, static, private �޼ҵ� ����
			//�߻� �޼ҵ�� private, protected �Ұ�
		
	//�߻�Ŭ���� �����ϴ� ���
		//�����ϰ� ���õ� Ŭ�������� �޼ҵ�/�ʵ� �����ؾ� �Ҷ�
		//�پ��� ���� ���� �ʿ��� ��
			//public �ƴ� protected, private ������ �ʿ��� ���
		//��ü �ʵ� ����ϴ� �޼ҵ� ������ ��
		
	//�������̽� �����ϴ� ���
		//������ ���� Ŭ�������� �������̽��� �����ϰ��� �Ҷ�
			//Ex: Comparable�� �����ϴ� ���� Ŭ�������� ���� ������ X
			//�߻�Ŭ�������� �������� �� ����
		//���� ����� �ʿ��� ��
	}
	void p106_final_method_class() {
	//final �޼ҵ�
		//���� Ŭ�������� �������̵� ������� ����
		//���� ���Ѱ� ���� ����
		//ǥ�� ���̺귯�� ��κ� �޼ҵ�� public final
		//private �޼ҵ�� ���� ��� �Ұ� -> final�� �ǹ� ����
	//final Ŭ����
		//Ŭ���� ��ü�� ��� ����
		//Ŭ���� �� ��� �޼ҵ�� �ڵ����� final �޼ҵ�
	}
	
	
	
	
	
	
}
