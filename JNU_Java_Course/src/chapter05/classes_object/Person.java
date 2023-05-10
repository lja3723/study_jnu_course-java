package chapter05.classes_object;

public class Person {
	public int x;
	public String name;
	
	public Person(int x, String name) {
		this.x = x;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return x == p.x && name.equals(p.name);
	}
}
