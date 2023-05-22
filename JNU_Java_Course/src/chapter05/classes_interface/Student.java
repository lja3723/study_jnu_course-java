package chapter05.classes_interface;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int score;
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public int compareTo(Student s) {
		return score - score;
	}
	
	public String toString() {
		return id + "," + name + "," + score;
	}
}