package chapter04_2.classes;

public class FieldInitEx {
	//1: 초기화하지 않으면 타입의 기본값으로 자동 초기화
	boolean b1;		// false
	char c1; 		// '\u0000'
	int[] a1;		// null
	Math m1;		// null
	
	//2: 필드 선언문에서 초기화
	static boolean b2 = true;
	char c2 = 'Q';
	int k2 = this.c2;
	
	//3: 생성자를 통한 값 설정으로 초기화
	//1, 2번 방법보다 늦게 이루어진다
	double d3;
	int k3;
	public FieldInitEx(double d3, int k3) {
		this.d3 = d3;
		this.k3 = k3;
	}
	
	//4: 초기화 블록(Initialization Block)을 이용한 초기화
	//초기화 과정이 다양한 조건에 따라 달라지는 등 매우 복잡할 때 활용
	//초기화 블록은 모든 생성자의 맨 앞에 복사되어 실행됨
		// 1 -> 2 -> 4 -> 3 순으로 이루어진다는 뜻
	int i;
	int j;
	int k;
	{
		i = 5;
		j = 6;
		for (int len = 0; len < i * j; len++)
			k += len * len;
	}
	
	//5: 클래스 필드 초기화, 정적 초기화 블록(Static Initialization Block)
	//초기화 명시 안해도 기본값으로 설정됨
	static int si;
	static int sj;
	static int sk;
	static {
		si = 5;
		sj = 6;
		sk = 7;
	}
	public static int specialValue;
	static {
		int sum = 0;
		for (int k = 0; k < 100; k++)
			if (k % 2 == 0)
				sum += k;
		specialValue = sum;
	}
}
