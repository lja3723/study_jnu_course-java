package chapter05.classes_composition;

public class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second){
		setTime(hour, minute, second);
	}
	public Time(Time t){
		if (t == null) {
			System.out.println("잘못된 시간으로 객체를 생성할 수 없음");
			System.exit(0);
		}
		setTime(t.hour, t.minute, t.second);
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	private boolean validHour(int hour){
		return hour >= 0 && hour <= 23;
	}
	private boolean validMinute(int minute){
		return minute >= 0 && minute <= 59;
	}
	private boolean validSecond(int second){
		return second >= 0 && second <= 59;
	}
	private boolean validTime(int hour, int minute, int second){
		return validHour(hour) 
				&& validMinute(minute) 
				&& validSecond(second);
	}
	public void setHour(int hour){
		if(validHour(hour))
			this.hour = hour;
		else
			this.hour = 0;
	}
	public void setMinute(int minute){
		if(validMinute(minute))
			this.minute = minute;
		else
			this.minute = 0;
	}
	public void setSecond(int second){
		if(validSecond(second))
			this.second = second;
		else
			this.second = 0;
	}
	void setTime(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(o == null) return false;
		if(o.getClass() != getClass())
			return false;
		Time t = (Time)o;
		return t.hour == hour &&
				t.minute == minute &&
				t.second == second;
	}
	public String toString() {
		String s1 = (hour >= 0 && hour <= 11) ? "AM " : "PM ";
		String s2 = (hour > 12 ? hour - 12 : hour) + ":" + minute + ":" + second;
		return s1 + s2;
	}
	public boolean isPrevious(Time t) {
		if (hour != t.getHour())
		 return hour < t.getHour();
		else if (minute != t.getMinute())
			 return minute < t.getMinute();
		 else
			 return second < t.getSecond();
	}
	public static void main(String[] v) {
		Time t1 = new Time(9, 15, 20);
		Time t2 = new Time(10, 15, 20);
		Time t3 = new Time(t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(new Time(9, 15, 20).isPrevious(new Time(9, 15, 20)));
	}
}
	
