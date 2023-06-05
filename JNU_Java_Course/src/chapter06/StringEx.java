package chapter06;

import java.util.StringTokenizer;

public class StringEx {
	public static void p00() {
		CharSequence c;
	}
	public static void p17_StringEx() {
		String a = new String(" abcd");
		String b = new String(",efg");
		// 문자열 연결
		a = a.concat(b);
		System.out.println(a);

		// 공백 제거
		a = a.trim();
		System.out.println(a);

		// 문자열 대치
		a = a.replace("ab","12");
		System.out.println(a);

		// 문자열 분리
		String s[] = a.split(",");
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 " + i + "번 문자열: " + s[i]);

		// 서브 스트링
		a = a.substring(3);
		System.out.println(a);

		// 문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);
	}
	public static void p25() {
		int[] character = new int[122];// 각 셀은 0으로 자동 초기화
		String str = "Writing a winning Java-program";
		for (int i = 0; i < str.length(); i++)
			character[str.charAt(i)]++;
		for (int i = 0; i < character.length; i++)
			if (character[i] != 0)
				System.out.println(i + " " + (char) i + " " + character[i]);

	}
	public static void p32() {
		String str = "abcde자바abcde";
		System.out.println(str.indexOf('c'));
		System.out.println(str.lastIndexOf('c'));
		System.out.println(str.indexOf("bcd"));
		System.out.println(str.lastIndexOf("bcd"));
		System.out.println(str.indexOf('Y'));
		System.out.println(str.lastIndexOf('y'));
	}
	public static void p61_StringTokenizer() {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");

		StringTokenizer st2 = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		while (st2.hasMoreTokens()) 
			System.out.println(st2.nextToken());

	}
	public static void p68() {
		String str = "Christmas";
		System.out.println(squeeze(str, 's'));
	}
	static String squeeze(String from, char ch){
		char[] chars = from.toCharArray();
		int position = 0;
		for(int i = 0; i < chars.length; i++)
			if(chars[i] != ch) chars[position++] = chars[i];
		return new String(chars, 0, position);
	}
	public static void p78() {
		try {
			// 한글 "자바"의 Unicode Escape 표현
			String str = "\uc790\ubc14";
			System.out.println(str);
			byte[] arr = str.getBytes();
			for(byte b: arr){
				int k = b & 0xff; // 8비트 추출
				System.out.print(" " + Integer.toHexString(k));
			}
			System.out.println();
			arr = str.getBytes("Unicode");
			for(byte b: arr){
				int k = b & 0xff; // 8비트 추출
				System.out.print(" " + Integer.toHexString(k));
			}
			System.out.println();
			arr = str.getBytes("UTF-8");
			for(byte b: arr){
				int k = b & 0xff; // 8비트 추출
				System.out.print(" " + Integer.toHexString(k));
			}
			System.out.println();
		} 
		catch(Exception e) {
			
		}
	}
	public static void p__() {
		StringBuffer s = new StringBuffer("Hello world");
		StringBuffer s2 = new StringBuffer("Hello world");
		System.out.println(s.equals(s2));
	}
	
	
	
}
