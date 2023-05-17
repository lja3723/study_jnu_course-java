package chapter05.classes_abstract;

public class Square extends Figure {

    public Square () {
    }

    public Square (int w, int h) {
        super(w, h);
    }
    public void setNameChar(char ch){
        name = "Square";
        character = ch;
    }
    public double area() {
        return width * height;
    }
    public void draw() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++)
                System.out.print(character);
            System.out.println();
        }
    }
}

