package chapter05.classes_interface;

public class StudentA {
	int id;
	String name;
	int score;
	public StudentA(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public boolean greater(StudentA s) {
		if (score >= s.score) {
			return true;
		}
		else return false;
	}
	public String toString() {
		return id + "," + name + "," + score;
	}
}
