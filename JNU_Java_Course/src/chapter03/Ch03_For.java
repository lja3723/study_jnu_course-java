package chapter03;

public class Ch03_For {
	static void ________________() {
		System.out.println();
	}
	public static void p10_Ex() {
		for (int n = 0; n < 10; n++)
			System.out.print(" " + n);
		________________();

		for (int n = 0; n < 10; n += 2)
			System.out.print(" " + n);
		________________();

		for (int n = 0; n < 10; n++)
			System.out.print(" " + (10 - n));
		________________();

		int sum = 0;
		for (int n = 1; n <= 10; ++n)
			sum += n;
		System.out.println("sum: " + sum);
		________________();
		
		for (int i = 1, s = 0; i <= 100; i++) {
			s += i;
			if (i == 100)
				System.out.println("1~100 sum: " + s);
		}
		
		System.out.println("================");
		for(int n = 1; n < 5; n++)
		    System.out.println(n);
		________________();
		
		for(int n = 5; n > 0; n--)
			System.out.println(n);
		________________();
		
		System.out.println("========���� 3-1(p25)========");
		for (int j = 0, i = 1; i <= 10; i++) {
			j += i;
			System.out.print(i + " ");
			if (i != 10)
				System.out.print("+ ");
			else
				System.out.print("= " + j + "\n");	
		}
		________________();
		
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch + " ");
		________________();
		
		
		//for���� �ݺ� Ƚ��
		//0 <   x  <    n 	// n - 1 ��
		//0 <= x <=  n 		// n + 1 ��
		//0 <= x <     n 	// n ��
		//0 <    x =<  n 	// n ��
		//�������� ���۰��� ������.
		System.out.println("========(p33)========");
		int max = 1;
		for (int i = 0; i < 3; max *= 2, i++);
		for (int i = max; i >= 1; i /= 2)
			System.out.print(" " + i);
		________________();
	}
	public static void p36over_ExProblem() {
		int n;
		int sum = 0;
		for (n = 1; sum < 5000; n++, sum += n) {}
		System.out.println(n - 1);
		
		//������ 10%, ������ �����Ͽ� ���ݰ� ������ ��(�����հ�)�� 
		//������ 2�谡 �Ƿ��� �� ���� �����ؾ� �ϴ°�?
		
		int seedMoney = 100000;
		int endMoney = seedMoney;
		int year;
		for (year = 0; endMoney < 2 * seedMoney; ++year) {
			endMoney += (double)endMoney / 10;
		}
		System.out.println(year);
	}
}
