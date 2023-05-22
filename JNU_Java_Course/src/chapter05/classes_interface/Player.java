package chapter05.classes_interface;

public class Player implements Comparable<Player> {
	int age;
	String name;
	public Player(int j, String s) {
		age = j;
		name = s;
	}
	public int compareTo(Player p) {
		if (age - p.age != 0)
			return age - p.age;
		
		return name.compareTo(p.name);
	}
	public String toString() {
		return name + "(" + age + ")";
	}
}
