package chapter05.classes_composition;

/*
�ʵ�� name, born, died
Class invariant: Person�� �׻� ��������� ������. ������� ���� ��� �׻� ����Ϻ��� ���ų� ���� ��¥�̴�. 
*/
public class Person {
	private String name;
	private Date born;
	private Date died; // null�̸� ������ �ִ� ���
	public Person(String name, Date birth, Date death) {
		if (name == null || birth == null) {
			System.out.println("�߸��� ��� ������");
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
			System.out.println("�߸��� ��� ������");
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
	 * date1�� date2�� ��ġ ���� �˻� date1�� date2�� ��� null�̰ų� ������ ��¥�̾�� ��
	 */
	private static boolean datesMatch(Date date, Date date2) {
		if (date == null)
			return (date2 == null);
		else if (date2 == null) // && date1 != null
			return false;
		else // �� ��¥�� null�� �ƴ� ��
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
	 * Precondition: newDate�� �ո��� ��¥ 
	 * Postcondition: ���� ��ü�� ������� newDate
	 */
	public void setBorn(Date newDate) {
		if (consistent(newDate, died))
			born = new Date(newDate);
		else{
			System.out.println("�������� ��¥��");
			System.exit(0);
		}
	}
	/**
	 * Precondition: newDate�� �ո����� ��¥ 
	 * Postcondition: ���� ��ü�� ������� newDate
	 */
	public void setDied(Date date) {
		if (!consistent(born, date)) {
			System.out.println("�������� ��¥��");
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
	 * �ٸ� Person�̷��� ������� null�̸� �� �ȴ�. 
	 * ������� ������ (deathDate == null) ��� ����ϰ��� ������� �ʰ� �ϰ��ȴ�.
	 * �׷��� ���� ��� ������� ����Ϻ��� �۰ų� ���ƾ� �Ѵ�
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
	