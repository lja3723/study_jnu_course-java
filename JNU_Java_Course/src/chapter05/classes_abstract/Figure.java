package chapter05.classes_abstract;

public abstract class Figure {

    protected int width;
    protected int height;
    protected String name = "Figure";
    protected char character = '-'; // 그릴 때 사용할 기본 문자

    public Figure() {}
    public Figure(int w, int h) {
        width = w;
        height = h;
    }

    public abstract void setNameChar(char ch);
    protected void draw() {
        System.out.println("This figure is " + name);
        System.out.println("Area is" + area());
    }

    public abstract double area();
    public boolean sameArea(Figure f) {
        return area() == f.area();
    }
}

