package chapter06;

import chapter06.classes.nested.*;

public class NestedClassEx {
	void p03_Ex() {
		Time.main(null);
		//new Time(13, 10, 20).print();
		//-> new Time(13, 10, 20) : �̸��� ���� ��ü
	}
	void p08_Anonymous_Class() {
		//�̸��� ����(Anonymous) Ŭ����
		//Ư¡
		//�� ���忡�� Ŭ���� ���ǿ� ������ ���ÿ� �̷���
		//��ü �����Ǵµ� 1ȸ ���Ǹ� �̸��� ���� �ݺ� ��� �Ұ�
		//��ü�� 1���� �����ϰ� Ŭ���� ���ǰ� ���� ª�� �� ����
		
	//���� ����
		//new Super_Type(�����ڿ� ����) {
			//�ʵ� ����
			//�޼ҵ� ����
		//};
		//Super_Type: ����� Ŭ���� �Ǵ� ������ �������̽�		
	}
	Comparable<String> p11_Ex() {
		
		new NestedClassEx() {
			void func() {
				System.out.println("Hello!");
			}
		};
		
		//new�� �ǹ�: �������̽��� ������ Ŭ������ new �϶�� ����
		return new Comparable<String>( ) {
			public int compareTo(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}			
		};
		//Comparable<String>�� ������ Ŭ������ ��ü�� ������ ��ȯ�Ѵ�.
		//�ſ� ��� �������� �ϳ��� return �����̹Ƿ� �� ���� ; �ʿ�
		//�������̽��� new�� ��������� ����
	}
	void p13_LocalClass() {
	//��������ó�� �޼ҵ� ��ü �Ǵ� ���� ��� �ӿ��� ���ǵǴ� Ŭ����
		//���ǵǴ� �޼ҵ峪 ��ϸ��� ���� Ŭ����
		//������ �� private, public, protected, static, final �� ��� �Ұ�
	}
	public static void p14_Ex() {
		
		//���������� Ÿ�Ե� �������̽��̰� �����Ǵ� ��ü�� Ÿ�Ե� �������̽�
		//�����ڸ� ȣ���ϴ� ���� �ƴϰ� �����Ǵ� ��ü�� NumberBox���
		//�������̽��� ����Ÿ������ ����Ŵ
		//��ĳ�������� ���� nb1���� ȣ���� �� �ִ� �޼ҵ�� NumberBox�� ���ǵ� 
		//�޼ҵ忡 ����.
        NumberBox nb1 = new NumberBox( ) /*���⼭����*/{
            private int number;
            public void setNumber(int value) {
                number = value;
            }
            public int getNumber( ) {
               return number;
            }
         }; /*������� ���� Ŭ���� ��ü��, ���� Ŭ������ �������̽��� �����ߴ�*/
         //�̸��� ���� ���� ��ϸӽ� Ŭ������
         
         NumberBox nb2 = new NumberBox( ) {
            private int number;
            public void setNumber(int value) {
                number = 2 * value;
            }
            public int getNumber( )  {
                return number;
            }
        };
        
		nb1.setNumber(42);
		nb2.setNumber(42);
		showNumber(nb1);
		showNumber(nb2);
		System.out.println("End of program.");
	}
	public static void showNumber(NumberBox o)  {
		System.out.println(o.getNumber( ));
	}
	public static void p16_Ex() {
		AnimalTest.main(null);
	}
	public static void p17_Ex() {
		java.util.function.Consumer<String> c = p17_getConsumer();
		c.accept("Christmas");
	}
	static java.util.function.Consumer<String> p17_getConsumer() {
		class Target implements java.util.function.Consumer<String> {
			public void accept(String s) {
				System.out.println(s + s.length());
			}
		}
		
		return new Target();
	}
	public static void p19_NamedMemberClass() {
		MemberNamed.main(null);
	}
		
		
		
	
	
	
	
	
}
