package chapter05.classes_composition;

public class CircleTest {
     public static void Main(String[] a){
        Point p = new Point(10,10);;
        Circle c = new Circle(p, 20);
        System.out.println( c );
     }
}

class Point {
    private int x, y;
    Point (int a, int b){
        x = a;
        y = b;
    }
}

class Circle {
    private int radius;
    private Point center;
    Circle (Point p, int r){
         center = p;
         radius = r;
    }
}
