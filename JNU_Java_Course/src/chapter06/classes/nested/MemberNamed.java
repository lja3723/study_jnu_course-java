package chapter06.classes.nested;

interface Compare {
	boolean bigger(int a, int b);
}

public class MemberNamed {
	class CompareClass implements Compare {
		public boolean bigger(int a, int b) {
			return a > b;
		}
	}
	Compare c = new CompareClass();
	
	public static void main(String[] args) {
		System.out.println(
			new MemberNamed().c.bigger(1, 2)
		);
	}
}
