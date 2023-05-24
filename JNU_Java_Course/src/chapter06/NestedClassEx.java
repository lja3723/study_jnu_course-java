package chapter06;

import chapter06.classes.nested.*;

public class NestedClassEx {
	void p03_Ex() {
		Time.main(null);
		//new Time(13, 10, 20).print();
		//-> new Time(13, 10, 20) : 이름이 없는 객체
	}
	void p08_Anonymous_Class() {
		//이름이 없는(Anonymous) 클래스
		//특징
		//한 문장에서 클래스 정의와 생성이 동시에 이뤄짐
		//객체 생성되는데 1회 사용되며 이름이 없어 반복 사용 불가
		//객체를 1개만 생성하고 클래스 정의가 아주 짧을 때 유용
		
	//정의 형식
		//new Super_Type(생성자용 인자) {
			//필드 정의
			//메소드 정의
		//};
		//Super_Type: 상속할 클래스 또는 구현할 인터페이스		
	}
	Comparable<String> p11_Ex() {
		
		new NestedClassEx() {
			void func() {
				System.out.println("Hello!");
			}
		};
		
		//new의 의미: 인터페이스를 구현한 클래스를 new 하라는 뜻임
		return new Comparable<String>( ) {
			public int compareTo(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}			
		};
		//Comparable<String>을 구현한 클래스의 객체를 생성해 반환한다.
		//매우 길어 보이지만 하나의 return 문장이므로 맨 끝에 ; 필요
		//인터페이스에 new를 사용했음에 유의
	}
	void p13_LocalClass() {
	//지역변수처럼 메소드 몸체 또는 작은 블록 속에서 정의되는 클래스
		//정의되는 메소드나 블록만을 위한 클래스
		//선언할 떄 private, public, protected, static, final 등 사용 불가
	}
	public static void p14_Ex() {
		
		//참조변수의 타입도 인터페이스이고 생성되는 객체의 타입도 인터페이스
		//생성자를 호출하는 것이 아니고 생성되는 객체가 NumberBox라는
		//인터페이스의 서브타입임을 가리킴
		//업캐스팅으로 인해 nb1으로 호출할 수 있는 메소드는 NumberBox에 정의된 
		//메소드에 한함.
        NumberBox nb1 = new NumberBox( ) /*여기서부터*/{
            private int number;
            public void setNumber(int value) {
                number = value;
            }
            public int getNumber( ) {
               return number;
            }
         }; /*여기까지 로컬 클래스 본체고, 로컬 클래스는 인터페이스를 구현했다*/
         //이름이 없는 로컬 어나니머스 클래스임
         
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
