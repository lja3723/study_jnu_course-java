package chapter05.classes_composition;

/*
필드는 name, born, died
Class invariant: Person은 항상 생년월일을 가진다. 사망일이 있을 경우 항상 출생일보다 같거나 이후 날짜이다. 
*/
public class Person {
	private String name;
	private Date born;
	private Date died; // null이면 생존해 있는 사람
	public Person(String name, Date birth, Date death) {
		if (name == null || birth == null) {
			System.out.println("잘못된 사람 데이터");
			System.exit(0);
		}

		if (consistent(birth, death)) {
			this.name = name;
			born = new Date(birth);
			if (death == null)
				died = null;
			else
				died = new Date(death);
		} else {
			System.out.println("Inconsistent dates. Aborting.");
			System.exit(0);
		}
	}
	public Person(Person person) {
		if (person == null) {
			System.out.println("잘못된 사람 데이터");
			System.exit(0);
		}
		name = person.name;
		born = new Date(person.born);
		if (person.died == null)
			died = null;
		else
			died = new Date(person.died);
	}
	public String toString() {
		String diedString;
		if (died == null)
			diedString = ""; // Empty string
		else
			diedString = died.toString();
		return (name + ", " + born + " - " + diedString);
	}
	/*
	 * date1과 date2의 일치 여부 검사 date1과 date2가 모두 null이거나 동일한 날짜이어야 함
	 */
	private static boolean datesMatch(Date date, Date date2) {
		if (date == null)
			return (date2 == null);
		else if (date2 == null) // && date1 != null
			return false;
		else // 두 날짜가 null이 아닐 때
			return (date.equals(date2));
	}
	public boolean equals(Object o) {	
		if(o == this)
			return true;
		if(o == null) return false;
		if(o.getClass() != getClass())
			return false;
		Person other = (Person)o;
		return name.equals(other.name) 
				&& born.equals(other.born)
				&& datesMatch(died, other.died);
	}
	/**
	 * Precondition: newDate가 합리적 날짜 
	 * Postcondition: 현행 객체의 출생일은 newDate
	 */
	public void setBorn(Date newDate) {
		if (consistent(newDate, died))
			born = new Date(newDate);
		else{
			System.out.println("부적절한 날짜임");
			System.exit(0);
		}
	}
	/**
	 * Precondition: newDate가 합리적인 날짜 
	 * Postcondition: 현행 객체의 사망일은 newDate
	 */
	public void setDied(Date date) {
		if (!consistent(born, date)) {
			System.out.println("부적절한 날짜임");
			System.exit(0);
		}
		if (date == null)
			died = null;
		else
			died = new Date(date);
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public Date getBorn() {
		return new Date(born);
	}
	public Date getDied() {
		if (died == null)
			return null;
		else
			return new Date(died);
	}
	/*
	 * 바른 Person이려면 출생일이 null이면 안 된다. 
	 * 사망일이 없으면 (deathDate == null) 어느 출생일과도 상충되지 않고 일관된다.
	 * 그렇지 않을 경우 출생일은 사망일보다 작거나 같아야 한다
	 */
	private static boolean consistent(Date birth, Date death) {
		if (birth == null)
			return false;
		else if (death == null)
			return true;
		else
			return (birth.precedes(death) || birth.equals(death));
	}
	public static void main(String[] args) {
		Person p1 = new Person("Lee", 
				new Date(1800, 1, 1, new Time(0,0,0)),
				new Date(1900, 12, 31, new Time(23,59,59)));
		System.out.println(p1);
		Date d = p1.getBorn();
		//privacy leak
		d.setDate(2100, 1, 1, new Time(0, 0, 0));
		System.out.println(p1);
	}
}
	