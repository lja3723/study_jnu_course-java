package chapter05.classes_abstract;

class Triangle extends Figure {

    public Triangle() {
    }

    public Triangle(int w, int h) {
        super(w, h);
    }
    public void setNameChar(char ch){
        name = "Triangle";
        character = ch;
    }
    public double area() {
        return (double)width * height / 2;
    }
    public void draw() {
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5 - (k + 1); i++)
                System.out.print(" ");
            for (int i = 0; i < k + 1; i++)
                System.out.print(character + " ");
            System.out.println();
        }
    }
}

