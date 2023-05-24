package chapter06.classes.nested;

public class Time {
    int hour;
    int minute;
    int second;
    Time() {}
    Time(int h, int m, int s) {
       hour = h;
       minute = m;
       second = s;
    }
    void print() {
       System.out.println();
       System.out.println(hour + ":" + minute + ":" + second);
    }
    boolean isPrevious(Time t) {
       if (hour != t.hour)
         return hour < t.hour;
       else if (minute != t.minute)
                 return minute < t.minute;
              else
                 return second < t.second;
    }
	public static void main(String[] v){
		System.out.println(
             new Time(10, 10, 10).isPrevious(
             new Time(10, 10, 10))
        );
        new Time(10, 10, 10).print();
        new Time(10, 10, 10).print();

        Time t1 = new Time(12, 00, 00);
        Time t2 = new Time(12, 00, 00);
        System.out.println(t1.isPrevious(t2));
        System.out.println(t1.isPrevious(t2));
        t1.print();
        t2.print();
	}
}