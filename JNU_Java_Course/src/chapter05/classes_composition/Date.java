package chapter05.classes_composition;

public class Date {
	private int year;
	private int month;
	private int day;
	private Time time;
	static int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static String[] strMonth = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.",
			"Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec." };
	static String[] strDow = { "Sun", "Mon", "Tue", "Wed", "Thi", "Fri", "Sat" };
	public Date() {
		this(2000, 1, 1, 0, 0, 0);
	}
	public Date(int year, int month, int day,
			int hour, int minute, int second) {
		setDate(year, month, day, hour, minute, second);
	}
	public Date(int year, int month, int day, Time t) {
		setDate(year, month, day, t);
	}
	public Date(Date d) {
		if (d == null) {
			System.out.println("잘못된 날짜로 Date 생성할 수 없음");
			System.exit(0);
		}
		setDate(d.year, d.month, d.day, d.time);
	}
	private boolean isLeapYear() {
		if (year < 1582)
			return false;
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public Time getTime() {
		return new Time(time);
	}
	public void setDate(int year, int month, int day,
			int hour, int minute, int second) {
		setDate(year, month, day, new Time(hour, minute, second));
	}
	public void setDate(int year, int month, int day, Time t) {
		if (validDate(year, month, day))
			this.year = year;
		this.month = month;
		this.day = day;
		if (t == null) {
			time = new Time(0, 0, 0);
		}
		else
			time = new Time(t.getHour(), t.getMinute(), t.getSecond());
	}
	private boolean validDate(int year, int month, int day){
		if (year < 0 || year > 9999)
			throw new DateException("부적절한 Year");
		if (month < 0 || month > 12)
			throw new DateException("부적절한 Month");
		int temp;
		if (month == 2 && isLeapYear())
			temp = 29;
		else
			temp = lastDay[month - 1];
		if (day >= 1 && day <= temp)
			return true;
		else
			throw new DateException("부적절한 Day");
	}
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(o == null) 
			return false;
		if(o.getClass() != getClass())
			return false;
		Date d = (Date) o;
		return year == d.year 
				&& month == d.month 
				&& day == d.day 
				&& time.equals(d.getTime());
	}
	public Date copyDate() {
		return new Date(year, month, day, 
				time.getHour(), time.getMinute(), time.getSecond());
	}
	private int getDow() {
		int year = this.year;
		int month = this.month;
		int day = this.day;
		if (month == 1 || month == 2) {
			year = year - 1;
			month = month + 12;
		}
		int w = year + year / 4 - year / 100 + year / 400
				+ (13 * month + 8) / 5 + day;
		return w % 7;
	}
	public String toString() {
		int dow = getDow();
		return (strDow[dow] + " " 
		+ strMonth[month - 1] + " " + day + " " + year + " " + time);
	}
	public boolean precedes(Date d) {
		if(d == null)
			return false;
		return ( (year < d.year)
			|| (year == d.year && month < d.month)
			|| (year == d.year && month == d.month && day < d.day) );
	}
	public static void main(String[] args) {
		System.out.println("Java's Date = " + new java.util.Date());
		Date a = new Date();
		System.out.println("new Date = " + a);
		Date b = new Date(a);
		System.out.println("b = " + b);
		System.out.println("a.equals(b) = " + a.equals(b));
		System.out.println("a.precedes(b) = " + a.precedes(b));
	}
}
class DateException extends RuntimeException {
	public DateException(String s) {
		super(s);
	}
}
	