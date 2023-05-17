package chapter05.classes_abstract;

public class RightTriangle extends Figure {

    public RightTriangle() {
    }

    public RightTriangle(int w, int h) {
        width = w;
        height = h;
    }
    public void setNameChar(char ch){
        name = "RightTriangle";
        character = ch;
    }
    public double area() {
        return (double)width * height / 2;
    }

    public void draw() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < y + 1; x++)
                System.out.print(character);
            System.out.println();
        }
    }
}
