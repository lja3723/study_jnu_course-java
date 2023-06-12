package chapter07;

import java.util.*;

public class CollectionsEx {
	public static void run() {
		p29_Ex();
	}
	
	void p05_hieriachy() {
		//Set, List, Map으로 구성
		//tree가 붙으면 자동 정렬됨
		//hash는 검색 속도 빠름		
	}
	
	void p06_collection_interface() {
		//공통 메서드
		//boolean add(E element)
		//boolean remove(Object object)
		//boolean isEmpty()
		//int size()
		//void clear()
		//boolean contains(Object object)
		//원소를 읽는 메소드는 없음 -> Get은 구현마다 상이한 특성이 있음
			//그래서 공용으로 Iterator를 정의함
	}
	
	void p13_List() {
		//Collection의 확장
		//각 원소가 위치정보(index) 가짐 (0~size()-1)
		//get, set, add, remove 모두 특정 위치 가능
		//중복 허용
		
		//리스트의 모든메서드는 인덱스와 관련됨
		//void add(int index, E element): index 위치에 element 삽입, 뒤에 위치한 원소는 모두 한 칸씩 이동
		//E get(int index)
		//E set​(int index, E element): index의 원소 교체 및 원래 원소 리턴
		//void remove(int index)
		//int indexOf(Object object)
		//int lastIndexOf(Object object)
		//<T> T[] toArray​(T[] a)
		//Object[] toArray()
		
		//Collection의 유사 메소드
		//boolean add(E element): 원소를 마지막에 삽입
		//boolean remove(Object object): 일치되는 원소 삭제

		//List 종류
		//ArrayList
		//LinkedList
		
		//Vector (deprecated) -> ArrayList 의 구형버전
		
		//Stack (deprecated) -> Vector를 상속하고 있음
			//stack이 필요하면 ArrayDeque 사용할것
	}
	public static void p20_p24_ArrayList() {
		//객체 null 기본타입 모두 삽입가능
		//성능/특징은 어레이리스트랑 동일
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(12));
		list.add(22);
		list.add(51);
		list.add(37);
		Collections.sort(list);
		for (int i = 0;i < list.size(); i++) { 
			Integer n = list.get(i);
			System.out.print(" " + n);
		}
		System.out.println();
		// Another Try: toString()
		System.out.println(list);

	}
	
	static void p28_Ex() {
		// Point 객체만 원소로 가지는 ArrayList 생성
		ArrayList<Point> v = new ArrayList<Point>();
		// 3 개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		v.remove(1); // 인덱스가 1인 Point 객체 삭제
		// ArrayList에 있는 모든 Point 객체 출력
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i); // i 번째 Point 객체 얻어내기
			System.out.println(p); // p.toString() 이용 p 출력
		}
		System.out.println(v);
	}
	static void p29_Ex() {
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		String longest = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			String name = a.get(i);
			if (longest.length() < name.length())
				longest = name;
		}
		System.out.println("\n가장 긴 이름은 : " + longest);

	}
	
	
	
	
	
}

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

